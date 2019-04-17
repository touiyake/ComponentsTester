package com.component.picklist;

public class Theme {

	private int id;
	private String displayName;
	private String name;
	
	public Theme(int id, String displayName, String name) {
		super();
		this.id = id;
		this.displayName = displayName;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
