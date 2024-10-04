package edu.ict.ex.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import edu.ict.ex.dto.MemberDto;

@Mapper
@Repository
public interface MemberDao {
	
	public int getuserid(MemberDto dto);
	
	public int addmember(MemberDto dto);
	
	public MemberDto login(MemberDto dto);

	
	

	
}
