package edu.ict.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.ict.ex.service.MemberService;
import edu.ict.ex.vo.UserVO;


@RestController
public class MemberController {

	@Autowired
	MemberService service;
	
	@RequestMapping(value="/getUserid", method= {RequestMethod.GET, RequestMethod.POST})
	public String getUserid(@PathVariable String id) {
		System.out.println("MemberController getUserid");
		
		UserVO vo = service.getuserid(id);
		
		return "/";
	}
	
	@RequestMapping(value = "/addmember", method = {RequestMethod.GET, RequestMethod.POST})
	public String addmember(@RequestBody UserVO vo) {
		System.out.println("MemverController login");
		
		service.addmember(vo);
		
		return "";
	}
}
