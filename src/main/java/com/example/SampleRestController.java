package com.example;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "group1")
@RestController
public class SampleRestController {
	@Autowired
	private UserRepository userRepository;

	/**
	 * テストメソッドです.
	 * 
	 * @param name 名前を指定します
	 * @return {@link User}を返却します
	 */
	@Transactional
	@PostMapping("/test")
	@ApiResponse(responseCode = "200", description = "成功時", content = @Content(mediaType = "application/json", schema = @Schema(implementation = User.class)))
	@ApiResponse(responseCode = "500", description = "失敗時")
	public User test(@RequestBody User user) {
		return userRepository.findById(user.getEmail()).get();
	}
}
