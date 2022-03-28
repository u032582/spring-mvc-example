package com.example;

import javax.transaction.Transactional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;

@WithDocket
@RestController
public class SampleRestController {

	/**
	 * テストメソッドです.
	 * 
	 * @param name 名前を指定します
	 * @return {@link User}を返却します
	 */
	@Transactional
	@GetMapping("/test")
	public User test(@RequestParam(name = "name") String name) {
		return null;
	}

}
