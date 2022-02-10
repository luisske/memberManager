package com.luisske.memberManager.model;

public class Person {

    private String name;
    private String birthday;
    private String address;
    private String mobilePhone;
    private String phone;
    private String joining;
    private String seniority;
    private String marriage;

    public Person() {
    }

    public Person(String name, String birthday,
                  String address, String mobilePhone,
                  String phone, String joining,
                  String seniority, String marriage) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.mobilePhone = mobilePhone;
        this.phone = phone;
        this.joining = joining;
        this.seniority = seniority;
        this.marriage = marriage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getJoining() {
        return joining;
    }

    public void setJoining(String joining) {
        this.joining = joining;
    }

    public String getSeniority() {
        return seniority;
    }

    public void setSeniority(String seniority) {
        this.seniority = seniority;
    }

    public String getMarriage() {
        return marriage;
    }

    public void setMarriage(String marriage) {
        this.marriage = marriage;
    }
}
