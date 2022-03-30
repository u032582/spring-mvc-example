package com.example;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "group1")
@RestController
@RequestMapping("rest")
public class SampleRestController {
	@Autowired
	private UserRepository userRepository;

	/**
	 * ユーザーリストを取得します。
	 * 
	 * @return Userのリスト
	 */
	@Transactional
	@GetMapping("/users")
	@ApiResponse(responseCode = "200", description = "成功時", content = @Content(mediaType = "application/json", schema = @Schema(implementation = User.class)))
	@ApiResponse(responseCode = "500", description = "失敗時")
	public List<User> users() {
		var ite = userRepository.findAll().iterator();
		List<User> list = new ArrayList<User>();
		while (ite.hasNext()) {
			list.add(ite.next());
		}
		return list;
	}
}
