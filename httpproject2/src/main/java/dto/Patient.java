package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patient 
{
	@Id
	private int pid;
	private String pname;
	private String bgroup;
	private long phno;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getBgroup() {
		return bgroup;
	}
	public void setBgroup(String bgroup) {
		this.bgroup = bgroup;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Patient [pid=" + pid + ", pname=" + pname + ", bgroup=" + bgroup + ", phno=" + phno + "]";
	}
	
	
	

}
