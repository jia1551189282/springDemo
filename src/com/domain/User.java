package com.domain;


import java.util.*;

public class User {
    private String username;
    private String password;
    private Integer age;

    private List<String> cars;

    private Set<String> city;
    private Map<String,String> info;
    private Properties properties;

    private String[] members;

    public String[] getMembers() {
        return members;
    }

    public void setMembers(String[] members) {
        this.members = members;
    }

    public Set<String> getCity() {
        return city;
    }

    public void setCity(Set<String> city) {
        this.city = city;
    }

    public Map<String, String> getInfo() {
        return info;
    }

    public void setInfo(Map<String, String> info) {
        this.info = info;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public List<String> getCars() {
        return cars;
    }

    public void setCars(List<String> cars) {
        this.cars = cars;
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", cars=" + cars +
                ", city=" + city +
                ", info=" + info +
                ", properties=" + properties +
                ", members=" + Arrays.toString(members) +
                '}';
    }

    public User(String username, Integer age) {
        this.username = username;
        this.age = age;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
