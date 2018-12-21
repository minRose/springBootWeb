package com.example.myproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.myproject.entity.User;

/*@RestController的意思就是controller里面的方法都以json格式输出，不用再配置jackjson*/
@RestController
public class HelloWorldController {

	@RequestMapping("/hello")
	public String index() {
		return "Hello World";
	}

	@RequestMapping("/getUser")
	public User getUser() {
		return new User("min", "nonono");
	}
}
