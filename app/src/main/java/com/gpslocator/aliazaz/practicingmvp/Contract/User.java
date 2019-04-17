package com.gpslocator.aliazaz.practicingmvp.Contract;

public class User {
    public Integer id;
    public String name;
    public String username;
    public String email;
    public String street;
    public String suite;
    public String city;
    public String zipcode;
    public String lat;
    public String lng;
    public String phone;
    public String website;
    public String com_name;

    public User(User user) {
        this.id = user.id;
        this.name = user.name;
        this.username = user.username;
        this.email = user.email;
        this.street = user.street;
        this.suite = user.suite;
        this.city = user.city;
        this.zipcode = user.zipcode;
        this.lat = user.lat;
        this.lng = user.lng;
        this.phone = user.phone;
        this.website = user.website;
        this.com_name = user.com_name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSuite() {
        return suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getCom_name() {
        return com_name;
    }

    public void setCom_name(String com_name) {
        this.com_name = com_name;
    }

    public interface UserInterface {
        String id = "id";
        String name = "name";
        String username = "username";
        String email = "email";
        String address = "address";
        String street = "street";
        String suite = "suite";
        String city = "city";
        String zipcode = "zipcode";
        String geo = "geo";
        String company = "company";
        String lat = "lat";
        String lng = "lng";
        String phone = "phone";
        String website = "website";
        String com_name = "com-name";
    }
}
