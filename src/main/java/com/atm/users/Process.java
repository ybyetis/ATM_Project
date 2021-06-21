package com.atm.users;

import com.atm.AtmClass;

public class Process {
    public void paraYatir(int balance, int money) {
        balance = balance + money;
        System.out.println("Hesabınıza " + money + " tl yatırıldı ve güncel bakiye: " + balance + " tl");

    }

    public void paraCek(int balance, int money) {
        balance = balance - money;
        System.out.println("Hesabınızdan " + money + " tl çekildi ve güncel bakiye: " + balance + " tl");

    }

}
