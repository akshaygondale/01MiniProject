// Plan.java
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
@Table(name="PLAN_CATEGORY")
public class Plan {
	@Id
	@GeneratedValue
	@Column(name="CATEGORY_ID")
	 private Integer id;
	
	@Column(name="CATEGORY_NAME",length=30)
	 private String name;
	
	@Column(name="ACTIVE_SWITCH")
	 private String activesw;
	
	@Column(name="CREATE_DATE")
	@CreationTimestamp
	 private Date createdate;
	
	@Column(name="UPDATE_DATE")
	@CreationTimestamp
	 private Date updatedate;
	
	@Column(name="CREATED_BY",length=30)
	 private String createdby;
	
	@Column(name="UPDATE_BY",length=30)
	 private String updatedby;

	 //Setter And Getter Method 
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
	//ToString Method 

	@Override
	public String toString() {
		return "Plan [id=" + id + ", name=" + name + ", activesw=" + activesw + ", createdate=" + createdate
				+ ", updatedate=" + updatedate + ", createdby=" + createdby + ", updatedby=" + updatedby + "]";
	}
	 
}
