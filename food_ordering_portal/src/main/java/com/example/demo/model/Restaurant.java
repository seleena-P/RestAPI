package com.example.demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="restaurant")
public class Restaurant {
	@Id
private int restaurantid;
private String restaurantname;
private String cuisinetype;
private String location;
private long contactnumber;
private float rating;
@OneToMany(cascade=CascadeType.ALL)
@JoinColumn(name="restaurantid")
private List<Menu> mn;
public Restaurant() {
	super();
	// TODO Auto-generated constructor stub
}
public Restaurant(int restaurantid, String restaurantname, String cuisinetype, String location, long contactnumber,
		float rating, List<Menu> mn) {
	super();
	this.restaurantid = restaurantid;
	this.restaurantname = restaurantname;
	this.cuisinetype = cuisinetype;
	this.location = location;
	this.contactnumber = contactnumber;
	this.rating = rating;
	this.mn = mn;
}
public int getRestaurantid() {
	return restaurantid;
}
public void setRestaurantid(int restaurantid) {
	this.restaurantid = restaurantid;
}
public String getRestaurantname() {
	return restaurantname;
}
public void setRestaurantname(String restaurantname) {
	this.restaurantname = restaurantname;
}
public String getCuisinetype() {
	return cuisinetype;
}
public void setCuisinetype(String cuisinetype) {
	this.cuisinetype = cuisinetype;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public long getContactnumber() {
	return contactnumber;
}
public void setContactnumber(long contactnumber) {
	this.contactnumber = contactnumber;
}
public float getRating() {
	return rating;
}
public void setRating(float rating) {
	this.rating = rating;
}
public List<Menu> getMn() {
	return mn;
}
public void setMn(List<Menu> mn) {
	this.mn = mn;
}


}
