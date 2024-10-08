package edu.ict.ex.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import edu.ict.ex.vo.UserVO;

@Mapper
@Repository
public interface MemberDao {
	
	public UserVO getuserid(String id);
	
	public int addmember(UserVO vo);

	
	

	
}
