package com.green.day05.ch07;

import com.green.day06.ch07.BankAccount;

public class BankAccountPOTest2 {
    public static void main(String[] args) {
        BankAccountPO po1 = new BankAccountPO();
        po1.deposit(1000);
        po1.checkMyBalance();

        BankAccountPO po2 = new BankAccountPO();
        po2.checkMyBalance();

        BankAccountPO.checkMyBalance();
    }
}