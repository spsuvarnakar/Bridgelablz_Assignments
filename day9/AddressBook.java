package com.assignments.day9;

import java.util.Objects;

public class AddressBook {


	public int id;
    public String bookName;
    public String firstName;
    public String lastName;
    public String address;
    public String city;
    public int zip;
    public String state;
    public long phoneNumber;
    public String email;

    public AddressBook(String bookName, String firstName, String lastName, String address, String city, int zip,
                       String state, long phoneNumber, String email) {
        this.bookName = bookName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.zip = zip;
        this.state = state;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public AddressBook(int id,String bookName, String firstName, String lastName, String address, String city, int zip,
                       String state, long phoneNumber, String email) {
        this.id = id;
        this.bookName = bookName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.zip = zip;
        this.state = state;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void AddressBook() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressBook that = (AddressBook) o ;
        return zip == that.zip && phoneNumber == that.phoneNumber && Objects.equals(bookName, that.bookName) && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(address, that.address) && Objects.equals(city, that.city) && Objects.equals(state, that.state) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode(){
        return Objects.hash(bookName, firstName, lastName, address, city, zip, state, phoneNumber, email);
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "bookName='" + bookName + '\'' +
                "firstName='" + firstName + '\'' +
                "lastName='" + lastName + '\'' +
                "address='" + address + '\'' +
                "city='" + city + '\'' +
                "zip=" + zip +
                "state='" + state + '\'' +
                "phoneNumber=" + phoneNumber +
                "email='" + email + '\'' +
                '}';
    }
	}
