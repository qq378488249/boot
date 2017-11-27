package com.blue.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {
	@Value("${age}")
	private String age;
	@Value("${context}")
	private String context;

//	@Autowired
//	GirlProperties girl;

//	@RequestMapping(value = {"/get","/get1"},method = RequestMethod.GET)
	@GetMapping
	public String test(@RequestParam(value = "id",required = false,defaultValue = "1") Integer id){
		return "id"+id;
	}
}
