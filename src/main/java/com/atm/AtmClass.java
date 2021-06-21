package com.atm;

import com.atm.users.BireyselUsers;
import com.atm.users.KurumsalUsers;
import com.atm.users.Process;
import com.atm.users.Users;

import java.util.*;

public class AtmClass {
    public static void main(String[] args) {

        Users bireyselUsers1 = new BireyselUsers();
        bireyselUsers1.setNameSurname("Leyla Ada");
        ((BireyselUsers) bireyselUsers1).setHomeAdress("İstanbul");
        bireyselUsers1.setBalance(200);
        bireyselUsers1.setTcNo(12344321555l);

        Users bireyselUsers2 = new BireyselUsers();
        bireyselUsers2.setNameSurname("Mecnun Çınar");
        ((BireyselUsers) bireyselUsers2).setHomeAdress("Ankara");
        bireyselUsers2.setBalance(100);
        bireyselUsers2.setTcNo(56789098765l);

        Users bireyselUsers3 = new BireyselUsers();
        bireyselUsers3.setNameSurname("İskender Çınar");
        ((BireyselUsers) bireyselUsers3).setHomeAdress("İzmir");
        bireyselUsers3.setBalance(300);
        bireyselUsers3.setTcNo(12345678909l);


        Users kurumsalUsers1 = new KurumsalUsers();
        kurumsalUsers1.setNameSurname("Ali Veli");
        ((KurumsalUsers) kurumsalUsers1).setCompany("Garanti Bankası");
        kurumsalUsers1.setBalance(150);
        kurumsalUsers1.setTcNo(366478932134l);

        Users kurumsalUsers2 = new KurumsalUsers();
        kurumsalUsers2.setNameSurname("Ayşe Aylin");
        ((KurumsalUsers) kurumsalUsers2).setCompany("Ziraat Bankası");
        kurumsalUsers2.setBalance(500);
        kurumsalUsers2.setTcNo(56657789456l);


        Map<Integer, Users> userNo = new HashMap<>();
        userNo.put(1, bireyselUsers1);
        userNo.put(2, bireyselUsers2);
        userNo.put(3, bireyselUsers3);
        userNo.put(4, kurumsalUsers1);
        userNo.put(5, kurumsalUsers2);

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Lütfen müşteri numarasını giriniz(1'den 5e kadar): ");
        Integer userNumber = myObj.nextInt();  // Read user input

        for (int i = 1; i < 6; i++) {
            if (userNumber == i) {
                System.out.println("Müşteri Ad-Soyadı: " + userNo.get(i).getNameSurname());
                System.out.println("Müşteri TC No: " + userNo.get(i).getTcNo());
                try {
                    System.out.println("Müşteri Şirketi: " + ((KurumsalUsers) userNo.get(i)).getCompany());
                } catch (Exception e) {
                    System.out.println("Müşteri Adresi: " + ((BireyselUsers) userNo.get(i)).getHomeAdress());
                }
                System.out.println("Hesap Bakiyesi: " + userNo.get(i).getBalance() + " tl");
                System.out.print("Lütfen Para Yatırma işlemi için 1, Para Çekme İşlemi için 2 giriniz: ");
                Integer processNo = myObj.nextInt();
                Process process = new Process();
                if (processNo == 1) {
                    process.paraYatir(userNo.get(i).getBalance());
                } else if (processNo == 2) {
                    process.paraCek(userNo.get(i).getBalance());
                } else {
                    System.out.println("Geçersiz işlem numarası girildi!");
                }

            } else if (userNumber > 5 | userNumber < 1) {
                System.out.println("Geçersiz müşteri numarası girildi!");
                break;
            }
        }
    }
}