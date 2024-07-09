package com.tnsif.inheritence;

public class Citizen {
	private String name;
	private long aadharno;
	private String address;
	private long phno;
	public Citizen() {
		
	}
	public Citizen(String name, long aadharno, String address, long phno) {
		super();
		this.name = name;
		this.aadharno = aadharno;
		this.address = address;
		this.phno = phno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAadharno() {
		return aadharno;
	}
	public void setAadharno(long aadharno) {
		this.aadharno = aadharno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", aadharno=" + aadharno + ", address=" + address + ", phno=" + phno + "]";
	}
	
	

}
