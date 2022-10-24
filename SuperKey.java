package com.app.prac1.entity;
import java.io.Serializable;

public class SuperKey implements Serializable {

	private String id;	//ForeignKey
	private int cns;	//LocalKey	
	
	public SuperKey() {
		super();
	}

	public SuperKey(String id, int cns) {
		super();
		this.id = id;
		this.cns = cns;
	}
}
