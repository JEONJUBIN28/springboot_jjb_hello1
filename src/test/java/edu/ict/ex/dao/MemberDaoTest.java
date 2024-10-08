package edu.ict.ex.dao;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.ict.ex.vo.UserVO;



@SpringBootTest	
class MemberDaoTest {

	@Autowired
	MemberDao memberDao;
	
	/*
	 * @Disabled
	 * 
	 * @Test void getuseridTest() {
	 * System.out.println(memberDao.getuserid("customer01")); }
	 */
	
	//@Disabled
	@Test
	void addmemberTest() {
		UserVO member = new UserVO();
		
		member.setId("dddd");
		member.setPasswd("dddd");
		
		memberDao.addmember(member);
	}

}
