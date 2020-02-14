package com.silversky.metronet.datavalidation;

import java.util.Comparator;

public class Contact implements Comparable<Contact> {
    private String fullName;
    private String cityName;
    private String phoneNumber;
    private String emailAddress;

    public Contact() {
    }

    public Contact(String fullName, String cityName, String phoneNumber, String emailAddress) {
        this.fullName = fullName;
        this.cityName = cityName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public int compareTo(Contact c) {
        return (this.fullName).compareTo(c.fullName);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "fullName='" + fullName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
