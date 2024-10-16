package com.green.day06.ch07;

public class BankAccount {
    int balance = 0;

    void deposit(int amount){
        balance += amount;
    }

    void withdraw(int amount){
        balance -= amount;
    }

    void checkMyuBalance(){
        System.out.printf("balance : %d\n", balance);
    }

    public static void main(String[] args) {

    }
}
