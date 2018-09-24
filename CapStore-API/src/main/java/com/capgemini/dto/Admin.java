package com.capgemini.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/*@Entity
@Table(name="admin")*/
@JsonIgnoreProperties(ignoreUnknown = true)
public class Admin {
	/*@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="admin_id")*/
	private int adminId;
	//@Column(name="admin_name")
	private String adminName;
	//@Column(name="admin_pswd")
	private String adminPswd;
	
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminPswd() {
		return adminPswd;
	}
	public void setAdminPswd(String adminPswd) {
		this.adminPswd = adminPswd;
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminPswd=" + adminPswd + "]";
	}
}