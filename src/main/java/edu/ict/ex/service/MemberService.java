package edu.ict.ex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.ict.ex.dao.MemberDao;
import edu.ict.ex.dto.MemberDto;

@Service
@Transactional
public class MemberService {
	
	@Autowired
	MemberDao dao;
	
	public boolean getuserid(MemberDto dto) {
		int n = dao.getuserid(dto);
		
		return n>0?true:false;
	}
	
	public boolean addmember(MemberDto dto) {
		int n = dao.addmember(dto);
		
		return n>0?true:false;
	}
	
	public MemberDto login(MemberDto dto) {
		return dao.login(dto);
	}
	
}
