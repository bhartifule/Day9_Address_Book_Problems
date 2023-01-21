package com.bridgelabz.day9;

public class AddressbookMain {
	public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        AddressBook obj1 = new AddressBook();
        obj1.setName("Bharti");
        obj1.setSurname("Fule");
        obj1.setAddress("Hingna Nagpur");
        obj1.setCity("Nagpur");
        obj1.setState("Maharastra");
        obj1.setContactNumber("9146075923");
        obj1.setEmail("bharatifule10@gmail.com");

        System.out.println("Name: " + obj1.getName());
        System.out.println("Surname: " + obj1.getSurname());
        System.out.println("Address: " + obj1.getAddress());
        System.out.println("City: " + obj1.getCity());
        System.out.println("State: " + obj1.getState());
        System.out.println("ContactNumber: " + obj1.getContactNumber());
        System.out.println("Email: " + obj1.getEmail());


    }
}
