package edu.ict.ex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.ict.ex.dao.MemberDao;
import edu.ict.ex.vo.UserVO;

@Service
@Transactional
public class MemberService {
	
	@Autowired
	MemberDao dao;
	
	public UserVO getuserid(String id) {
		return dao.getuserid(id);
	}
	
	public void addmember(UserVO vo) {
		dao.addmember(vo);
	}
	
}
