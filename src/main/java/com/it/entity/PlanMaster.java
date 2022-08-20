// PlanMaster.java
package com.it.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Entity
@Data
@Table(name="PLAN_MASTER")
public class PlanMaster {
	@Id
	@GeneratedValue
	@Column(name="PLAN_ID")
	 private Integer pid;
	
	@Column(name="PLAN_NAME" ,length=30)
	 private String pname;
	
	@Column(name="PLAN_START_DATE")
	@CreationTimestamp
	 private Date startdate;
	
	@Column(name="PLAN_END_DATE")
	@CreationTimestamp
	 private Date enddate;
	
	@Column(name="CATEGORY_ID")
	 private Integer id;
	
	@Column(name="CATEGORY_NAME")
	 private String name;
	
	@Column(name="ACTIVE_SWITCH")
	 private String activesw;
	
	@Column(name="CREATE_DATE")
	@CreationTimestamp
	 private Date createdate;
	
	@Column(name="UPDATE_DATE")
	@CreationTimestamp
	 private Date  updatedate;
	
	@Column(name="CREATED_BY" ,length=30)
	 private String createdby;
	
	@Column(name="UPDATE_BY",length=30)
	 private String updatedby;

	 // Setter and Getter Method 
	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getActivesw() {
		return activesw;
	}

	public void setActivesw(String activesw) {
		this.activesw = activesw;
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	public Date getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public String getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}
	// To String Method

	@Override
	public String toString() {
		return "PlanMaster [pid=" + pid + ", pname=" + pname + ", startdate=" + startdate + ", enddate=" + enddate
				+ ", id=" + id + ", name=" + name + ", activesw=" + activesw + ", createdate=" + createdate
				+ ", updatedate=" + updatedate + ", createdby=" + createdby + ", updatedby=" + updatedby + "]";
	}
}//class
