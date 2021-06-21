package com.atm.users;

import com.atm.AtmClass;

public class Process {
    public void paraYatir(int balance) {
        balance = balance + 50;
        System.out.println("Hesabınıza 50 tl yatırıldı ve güncel bakiye: " + balance + " tl");

    }

    public void paraCek(int balance) {
        balance = balance - 50;
        System.out.println("Hesabınızdan 50 tl çekildi ve güncel bakiye: " + balance + " tl");

    }

}
