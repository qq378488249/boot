package com.blue.boot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	@Value("${age}")
	private String age;
//	@Value("${context}")
//	private String context;

//	@Autowired
//	GirlProperties girl;

//	@RequestMapping(value = {"/get","/get1"},method = RequestMethod.GET)
	@GetMapping(value = "/1")
	public String test(@RequestParam(value = "id",required = false,defaultValue = "1") Integer id){
		return "id"+id;
	}
}
