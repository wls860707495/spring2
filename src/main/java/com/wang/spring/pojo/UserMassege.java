package com.wang.spring.pojo;
import org.apache.ibatis.type.Alias;
@Alias("UserMassege")
public class UserMassege {
	private int userid;
	private String username;
	private String password;
	private String tel;
	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}


}