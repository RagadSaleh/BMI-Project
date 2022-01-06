package com.example.bmi;

public class FoodInfo {
    private int img;

    public FoodInfo(int img, String name, String gender, String calory) {
        this.img = img;
        this.name = name;
        this.gender = gender;
        this.calory = calory;
    }

    private String name, gender, calory;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCalory() {
        return calory;
    }

    public void setCalory(String calory) {
        this.calory = calory;
    }

    public FoodInfo(String name) {
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
