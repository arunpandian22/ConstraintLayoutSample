package me.arun.constraintsample.sample.model;

/**
 * Created by Arun Pandian M on 03/March/2019
 * arunsachin222@gmail.com
 * Chennai
 */
public class Event {

    String name;
    String group;
    boolean isconfirmed;
    String Date;
    String time;
    String description;
    String address;
    String location;

    public Event(String name, String group, boolean isconfirmed, String date, String location) {
        this.name = name;
        this.group = group;
        this.isconfirmed = isconfirmed;
        Date = date;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public boolean isIsconfirmed() {
        return isconfirmed;
    }

    public void setIsconfirmed(boolean isconfirmed) {
        this.isconfirmed = isconfirmed;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}

