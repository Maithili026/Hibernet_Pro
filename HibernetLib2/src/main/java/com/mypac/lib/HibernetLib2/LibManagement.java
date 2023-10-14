//project name Library Management Systetem

package com.mypac.lib.HibernetLib2;

//import Entity packages
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//Declaration of entity
@Entity
public class LibManagement {

	//declaration of variable
	@Id
	private int memId;
	
	@Column
	private String memName;
	@Column
	private String memType;
	@Column
	private String bName;
	@Column
	private String authName;
	public int getmemId()
	 {
		 return memId;
	 }
	//Getter and setter method for all fields
	public int getMemId() {
		return memId;
	}
	public void setMemId(int memId) {
		this.memId = memId;
	}
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	public String getMemType() {
		return memType;
	}
	public void setMemType(String memType) {
		this.memType = memType;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getAuthName() {
		return authName;
	}
	public void setAuthName(String authName) {
		this.authName = authName;
	}
	
}
