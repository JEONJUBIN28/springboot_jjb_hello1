package edu.ict.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.ict.ex.dto.MemberDto;
import edu.ict.ex.service.MemberService;


@RestController
public class MemberController {

	@Autowired
	MemberService service;
	
	@RequestMapping(value="/getUserid", method= {RequestMethod.GET, RequestMethod.POST})
		public String getUserid(MemberDto dto) {
		System.out.println("MemberController getUserid");
		
		boolean b = service.getuserid(dto);
		if(b) {
			return "NO";
		}
		return "OK";
	}
	
	@RequestMapping(value = "/addmember", method = {RequestMethod.GET, RequestMethod.POST})
	public MemberDto addmember(MemberDto dto) {
		System.out.println("MemverController login");
		
		MemberDto mem = service.login(dto);
		return mem;
	}
}
