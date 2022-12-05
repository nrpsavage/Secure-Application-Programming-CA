package org.example;

public class Data {
    private int balance;
    private String name;
    private String password;

    public Data(){
        balance = 2000;
        name = "Nathan";
        password = "1234";
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
