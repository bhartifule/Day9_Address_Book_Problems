package com.bridgelabz.day9;

import java.util.Scanner;

public class PersonDetails {
	 private String name ;
	    private String surName;
	    private String address;
	    private String  city ;
	    private String state;
	    private String contactNumber;
	    private String zip;
	    private String gmail ;
	    public PersonDetails(String name, String surName, String Address, String  city, String state, String contactNumber,
	                   String zip, String gmail){
	        this.name = name;
	        this.surName = surName;
	        this.address = Address;
	        this.city=city;
	        this.state = state;
	        this.contactNumber = contactNumber;
	        this.zip = zip;
	        this.gmail = gmail;
	    }

	    public PersonDetails() {
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getSurName() {
	        return surName;
	    }

	    public void setSurName(String surName) {
	        this.surName = surName;
	    }

	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String address) {
	        this.address = address;
	    }

	    public String getCity() {
	        return city;
	    }

	    public void setCity(String city) {
	        this.city = city;
	    }

	    public String getState() {
	        return state;
	    }

	    public void setState(String state) {
	        this.state = state;
	    }

	    public String getContactNumber() {
	        return contactNumber;
	    }

	    public void setContactNumber(String contactNumber) {
	        this.contactNumber = contactNumber;
	    }

	    public String getZip() {
	        return zip;
	    }

	    public void setZip(String zip) {
	        this.zip = zip;
	    }

	    public String getGmail() {
	        return gmail;
	    }

	    public void setGmail(String gmail) {
	        this.gmail = gmail;
	    }
	    public String toStore(){
	        return String.format(name+" "+ surName+ " "+ address+" "  +city+" " + state+" "+ contactNumber+
	                " "+ zip+" "+ gmail);
	    }

	    @Override
	    public String toString() {
	        return "Contact{" +
	                "name='" + name + '\'' +
	                ", surName='" + surName + '\'' +
	                ", address='" + address + '\'' +
	                ", city='" + city + '\'' +
	                ", state='" + state + '\'' +
	                ", contactNumber='" + contactNumber + '\'' +
	                ", zip='" + zip + '\'' +
	                ", gmail='" + gmail + '\'' +
	                '}';
	    }
}
