package edu.ict.ex.mapper;

import edu.ict.ex.vo.UserVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    void saveUser(UserVO userVo);
}
