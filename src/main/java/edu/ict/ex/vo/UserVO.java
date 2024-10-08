package edu.ict.ex.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserVO{
	private String id;
	private String passwd;
	private int member_gubun;
	private int manager_role;
	private int status;
	private String name;
	private Date birthday;
	private String telno;
	private String email;
	private Date create_date;	
	private String last_change_id;	
	private Date last_change_date;	
	private Date expire_date;
}
