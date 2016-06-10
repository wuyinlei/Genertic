package com.yinlei.e_eg;

// Admin=a_admin
@utils.Table(tableName="a_admin")
public class Admin {

	@utils.Id
	@utils.Column(columnName = "a_id")
	private int id;
	
	@utils.Column(columnName = "a_userName")
	private String userName;
	
	@utils.Column(columnName = "a_pwd")
	private String pwd;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", pwd=" + pwd + ", userName=" + userName
				+ "]";
	}
	
}
