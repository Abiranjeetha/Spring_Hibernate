package com.pack;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Categories")
public class Categories {
	@Id
	private int catid;
	private String catname;
	@ManyToMany(targetEntity=Items.class,cascade=CascadeType.ALL)
	@JoinTable(name="categories_items",joinColumns=@JoinColumn(name="cat_id_fk",referencedColumnName="catid"),inverseJoinColumns=@JoinColumn(name="item_id_fk",referencedColumnName="itemid"))
	private Set Items;
	public int getCatid() {
		return catid;
	}
	public void setCatid(int catid) {
		this.catid = catid;
	}
	public String getCatname() {
		return catname;
	}
	public void setCatname(String catname) {
		this.catname = catname;
	}
	public Set getItems() {
		return Items;
	}
	public void setItems(Set items) {
		Items = items;
	}
}
