package com.example.bmi;

public class Record {
    private static class Constants {
        final static String UNDERWEIGHT = "Underweight";
        final static String HEALTHY = "Healthy";
        final static String OVERWEIGHT = "Overweight";
        final static String OBESITY = "Obesity";
        final static String LC = "Little Changes";
        final static String SG = "Still Good";
        final static String GA = "Go Ahead";
        final static String BC = "Be Careful";
        final static String SB = "So Bad";
    }

    private String date;
    private double weight;
    private int length;
    private String status;

    public Record(String date, double weight, int length, String status) {
        this.date = date;
        this.weight = weight;
        this.length = length;
        this.status = status;

    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

}

