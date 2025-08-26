package com.elon.jdbc.day03.pstm.member.model.vo;

import java.sql.Date;

public class Member {
	// 필드
	private String memberId;
	private String memberPwd;
	private String memberName;
	private char gender;
	private int age;
	private String email;
	private String phone;
	private String address;
	private String hobby;
	private Date enrollDate;
	
	// 생성자
	public Member() {} // Member 생성자 

	// Alt + Shift + s 누르고 generate constructor using fields 누르면 자동으로 생성자 만들어줌 
	public Member(String memberId, String memberPwd, String memberName, char gender, int age, String email,
			String phone, String address, String hobby) {
		super();
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.gender = gender;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.hobby = hobby;
	}
	
	public Member(String memberId, String memberPwd, String email, String phone, String address, String hobby) {
		super();
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.hobby = hobby;
	}



	public Member(String memberId, String memberPwd, String memberName, char gender, int age, String email,
			String phone, String address, String hobby, Date enrollDate) {
		super();
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.gender = gender;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.hobby = hobby;
		this.enrollDate = enrollDate;
	}
	
	// getter/setter메소드

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPwd() {
		return memberPwd;
	}

	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberPwd=" + memberPwd + ", memberName=" + memberName + ", gender="
				+ gender + ", age=" + age + ", email=" + email + ", phone=" + phone + ", address=" + address
				+ ", hobby=" + hobby + ", enrollDate=" + enrollDate + "]";
	}
}
