package com.exam.deploy.DeploytoAWS;



public class Student {
	
	private String sid;
	private String sname;
	private String sage;
	public Student(String sid, String sname, String sage) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
	}
	public Student() {
		super();
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSage() {
		return sage;
	}
	public void setSage(String sage) {
		this.sage = sage;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sage=" + sage + "]";
	}
	
	
}
