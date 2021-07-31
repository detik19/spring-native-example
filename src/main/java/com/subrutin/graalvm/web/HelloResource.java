package com.subrutin.graalvm.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {

	@GetMapping("/hello")
	public String helloGraalVM() {
		return "Hello GraalVM";
	}
}
