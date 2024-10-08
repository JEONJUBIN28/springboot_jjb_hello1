package edu.ict.ex.dto;

import java.sql.Date;

public class MemberDto {
	private String userId;
	private String passWd;
	private int birthyear;
	private Date regdate;
	private Date birthdate;
	private String email;
	private String name;
	private String role;
	private String auth;

	public String getUserid() {
		return userId;
	}

	public void setUserid(String userid) {
		this.userId = userid;
	}

	public String getPasswd() {
		return passWd;
	}

	public void setPasswd(String passwd) {
		this.passWd = passwd;
	}

	public int getBirthyear() {
		return birthyear;
	}

	public void setBirthyear(int birthyear) {
		this.birthyear = birthyear;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

	@Override
	public String toString() {
		return " MemberDto [userid=" + userId + ", passwd=" + passWd + ", name=" + name + ", email=" + email + ", auth="
				+ auth + ", birthyear=" + birthyear + ", regdate=" + regdate + ", role=" + role + ", birthdate= " + birthdate + "]";
	}

}
