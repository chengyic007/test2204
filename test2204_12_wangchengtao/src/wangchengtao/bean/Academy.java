package wangchengtao.bean;

public class Academy {
	private int aid;
	private String aname;
	private String adesc;
	private String contact;
	private String conphone;
	private int astate;
	public Academy() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAdesc() {
		return adesc;
	}
	public void setAdesc(String adesc) {
		this.adesc = adesc;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getConphone() {
		return conphone;
	}
	public void setConphone(String conphone) {
		this.conphone = conphone;
	}
	public int getAstate() {
		return astate;
	}
	public void setAstate(int astate) {
		this.astate = astate;
	}
	@Override
	public String toString() {
		return "Academy [aid=" + aid + ", aname=" + aname + ", adesc=" + adesc + ", contact=" + contact + ", conphone="
				+ conphone + ", astate=" + astate + "]";
	}
	
}
