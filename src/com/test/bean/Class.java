package com.test.bean;

/**
 * Class entity. @author MyEclipse Persistence Tools
 */

public class Class implements java.io.Serializable {

	// Fields

	private Integer cid;
	private String cname;

	// Constructors

	/** default constructor */
	public Class() {
	}

	/** full constructor */
	public Class(String cname) {
		this.cname = cname;
	}

	// Property accessors

	public Integer getCid() {
		return this.cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

}