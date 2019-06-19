package com.pack;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name="Items")
public class Items {
	@Id
	private int itemid;
	private String itemname;
	@ManyToMany(targetEntity=Categories.class,mappedBy="Items")
	private Set Categories;
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
}
