package com.Spring.FirstSpringDeskstopApplication;
/**
 * 
 * @author Pradip Gadekar
 *
 */
public class Student {
  private int rollno;
  private String name;
  private Float per;
  private String address;
  
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Float getPer() {
	return per;
}
public void setPer(Float per) {
	this.per = per;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", per=" + per + ", address=" + address + "]";
}
}
