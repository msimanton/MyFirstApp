package com.example.matthewsimanton.broadcastreceiverassignment;

public class IncomingNumber {

    private int id;
    private String number;


    //constructor
    IncomingNumber(int id, String number) {
        this.setId(id);
        this.setNumber(number);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
