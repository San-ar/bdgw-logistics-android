package com.bdg.logistics;

public class LogisticsItem {
    private int id;
    private String status;
    private String description;

    // Getters are required for Retrofit to work
    public int getId() { return id; }
    public String getStatus() { return status; }
    public String getDescription() { return description; }
}
