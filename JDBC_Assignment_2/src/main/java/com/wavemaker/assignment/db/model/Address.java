package com.wavemaker.assignment.db.model;

public class Address {
    private String door_no;
    private String street_name;
    private String city_name;
    private String state_name;
    private String pin_code;
    private String landmark;

    public Address() {
    }

    public Address(String door_no, String street_name, String city_name, String state_name,
                    String pin_code, String landmark) {
        this.door_no = door_no;
        this.street_name = street_name;
        this.city_name = city_name;
        this.state_name = state_name;
        this.pin_code = pin_code;
        this.landmark = landmark;
    }

    public String getDoorNo() {
        return door_no;
    }

    public void setDoorNo(String door_no) {
        this.door_no = door_no;
    }

    public String getStreetName() {
        return street_name;
    }

    public void setStreetName(String street_name) {
        this.street_name = street_name;
    }

    public String getCityName() {
        return city_name;
    }

    public void setCityName(String city_name) {
        this.city_name = city_name;
    }

    public String getStateName() {
        return state_name;
    }

    public void setStateName(String state_name) {
        this.state_name = state_name;
    }

    public String getPinCode() {
        return pin_code;
    }

    public void setPinCode(String pin_code) {
        this.pin_code = pin_code;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    @Override
    public String toString() {
        return "Address{" +
                "door_no=" + door_no +
                ", street_name='" + street_name + '\'' +
                ", city_name='" + city_name + '\'' +
                ", dob=" + state_name +
                ", company='" + pin_code + '\'' +
                ", landmark='" + landmark + '\'' +
                '}';
    }
}
