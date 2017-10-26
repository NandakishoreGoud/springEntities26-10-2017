package com.cts.pojo;

public class Vehicle {
    private String name;
    private String type;
    Integer wheels;

    public Vehicle(String name, String type, Integer wheels) {
        this.name = name;
        this.type = type;
        this.wheels = wheels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getWheels() {
        return wheels;
    }

    public void setWheels(Integer wheels) {
        this.wheels = wheels;
    }
}
