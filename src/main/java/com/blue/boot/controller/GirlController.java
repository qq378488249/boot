package com.blue.boot.controller;

import com.blue.boot.domain.Girl;
import com.blue.boot.domain.Response;
import com.blue.boot.domain.Enum;
import com.blue.boot.exception.GirlRunTimeExcetion;
import com.blue.boot.repository.GirlRepository;
import com.blue.boot.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@RestController
@RequestMapping("/girl")
public class GirlController {

	@Autowired
	GirlRepository girlRepository;
	@Autowired
	GirlService girlService;
//	@RequestMapping(value = {"/get","/get1"},method = RequestMethod.GET)
//	@GetMapping(value = "/findAll")
//	public List<Girl> test(){
//		return girlRepository.findAll();
//	}
//
	@GetMapping(value = "/{id}")
	public Response get(@PathVariable Integer id){
		Response response = Response.newResponse();
		Girl girl = girlRepository.getOne(id);
		if(girl==null){
			return response.setEnum(Enum.ksj);
		}
		if(girl.getAge()<18){
			throw new GirlRunTimeExcetion(1,"年龄小于18");
		}
		if(girl.getAge()<8){
			throw new GirlRunTimeExcetion(1,"年龄小于8");
		}
		response.setData(girl);
		return response;
	}

	@GetMapping(value = "/login")
	public void login(HttpServletRequest httpServletRequest){
		System.out.println("girl");
		HttpSession session = httpServletRequest.getSession();
		session.setAttribute("login","1");
	}

	@GetMapping(value = "/exit")
	public void exit(HttpServletRequest httpServletRequest){
		System.out.println("girl");
		HttpSession session = httpServletRequest.getSession();
		session.removeAttribute("login");
	}

	@PostMapping(value = "/add")
	public void add(@Valid Girl girl, BindingResult bindingResult){
		if (bindingResult.hasErrors()){
			System.out.println(bindingResult.getFieldError().getField());
		}
		girlRepository.save(girl);
	}
}
