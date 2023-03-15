package yuwenxu.bean;

import java.sql.Date;

public class Room {
	private int rid;
	private String name;
	private String address;
	private String intent;
	private Date lastModify;
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIntent() {
		return intent;
	}
	public void setIntent(String intent) {
		this.intent = intent;
	}
	public Date getLastModify() {
		return lastModify;
	}
	public void setLastModify(Date lastModify) {
		this.lastModify = lastModify;
	}
	@Override
	public String toString() {
		return "Room [rid=" + rid + ", name=" + name + ", address=" + address + ", intent=" + intent + ", lastModify="
				+ lastModify + "]";
	}
	
}
