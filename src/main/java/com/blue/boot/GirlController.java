package com.blue.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/girl")
public class GirlController {

	@Autowired
	GirlRepository girlRepository;
//	@RequestMapping(value = {"/get","/get1"},method = RequestMethod.GET)
	@GetMapping(value = "/findAll")
	public List<Girl> test(@RequestParam(value = "id",required = false,defaultValue = "1") Integer id){
		return girlRepository.findAll();
	}

	@PostMapping(value = "/add")
	public Girl add(@RequestParam("name") String name,@RequestParam("age") String age){
		Girl girl = new Girl();
		girl.setAge(age);
		girl.setName(name);
		return girlRepository.save(girl);
	}
}
