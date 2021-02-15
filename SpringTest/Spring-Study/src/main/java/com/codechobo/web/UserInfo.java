package com.codechobo.web;

public class UserInfo {
	private String id;
	private String pwd;
	private String remember;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getRemember() {
		return remember;
	}
	public void setRemember(String remember) {
		this.remember = remember;
	}
	
	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", pwd=" + pwd + ", isRemember=" + remember + "]";
	}

}