package com.example.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
//스프링이 패키지 이하 모든 파일을 스캔하지 않음. 
//특정 어노테이션만 스캔 및 ioc 관리.
public class BlogControllerTest {
	
	//http://localhost:8080/test/hello
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>hello</h1>";
	}
}
