package com.tnsif.constructor;

public class Custmoer {
	private String cname;
	private int cid;
	private String caddress;
	public Custmoer() {
		
	

}
	public Custmoer(String cname, int cid, String caddress) {
		
		this.cname = cname;
		this.cid = cid;
		this.caddress = caddress;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String ename) {
		this.cname = cname;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	@Override
	public String toString() {
		return "Custmoer [cname=" + cname + ", cid=" + cid + ", caddress=" + caddress + "]";
	}
}
	