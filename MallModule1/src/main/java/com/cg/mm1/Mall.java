package com.cg.mm1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Mall {

	private int id;
	private String mallAdmin;
	private String mallName;
	private String location;
	private String shops_id;
	private String categories;
	
	public Mall() {
		super();
	}

	public Mall(int id, String mallAdmin, String mallName, String location, String shops_id, String categories) {
		super();
		this.id = id;
		this.mallAdmin = mallAdmin;
		this.mallName = mallName;
		this.location = location;
		this.shops_id = shops_id;
		this.categories = categories;
	}

	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMallAdmin() {
		return mallAdmin;
	}

	public void setMallAdmin(String mallAdmin) {
		this.mallAdmin = mallAdmin;
	}

	public String getMallName() {
		return mallName;
	}

	public void setMallName(String mallName) {
		this.mallName = mallName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getShops_id() {
		return shops_id;
	}

	public void setShops_id(String shops_id) {
		this.shops_id = shops_id;
	}

	public String getCategories() {
		return categories;
	}

	public void setCategories(String categories) {
		this.categories = categories;
	}

	@Override
	public String toString() {
		return "Mall [id=" + id + ", mallAdmin=" + mallAdmin + ", mallName=" + mallName + ", location=" + location
				+ ", shops_id=" + shops_id + ", categories=" + categories + ", getId()=" + getId() + ", getMallAdmin()="
				+ getMallAdmin() + ", getMallName()=" + getMallName() + ", getLocation()=" + getLocation()
				+ ", getShops_id()=" + getShops_id() + ", getCategories()=" + getCategories() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}