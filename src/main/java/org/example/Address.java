package org.example;

import javax.persistence.*;

@Embeddable
public class Address {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId;

    @Column(length = 55)
    private String street;

    private String city;

    public Address(){}

    public Address(String street, String city){
        this.street = street;
        this.city = city;
    }

    public int getAddressId() {
        return addressId;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

}
