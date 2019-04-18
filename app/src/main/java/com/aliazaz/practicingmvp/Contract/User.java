package com.aliazaz.practicingmvp.Contract;

import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("id")
    public Integer id;
    @SerializedName("name")
    public String name;
    @SerializedName("username")
    public String username;
    @SerializedName("email")
    public String email;
    @SerializedName("address")
    public Address address;
    @SerializedName("phone")
    public String phone;
    @SerializedName("website")
    public String website;
    @SerializedName("company")
    public Company company;

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
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

    public class Address {
        @SerializedName("street")
        public String street;
        @SerializedName("suite")
        public String suite;
        @SerializedName("city")
        public String city;
        @SerializedName("zipcode")
        public String zipcode;
        @SerializedName("geo")
        public GeoLocation geoLocation;

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

        public GeoLocation getGeoLocation() {
            return geoLocation;
        }

        public void setGeoLocation(GeoLocation geoLocation) {
            this.geoLocation = geoLocation;
        }
    }

    public class GeoLocation {
        @SerializedName("lat")
        public String lat;
        @SerializedName("lng")
        public String lng;

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
    }

    public class Company {
        @SerializedName("name")
        public String comp_name;

        public String getComp_name() {
            return comp_name;
        }

        public void setComp_name(String comp_name) {
            this.comp_name = comp_name;
        }
    }

}
