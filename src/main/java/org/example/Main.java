package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Contact sami = new Friend("sami", "324555");
        Contact lila = new Friend("lila", "897543");
        Contact max = new Friend("max", "437653");
        Contact nils = new Friend("nils", "7653289");
        Contact scott = new Friend("scott", "6528714");

        List<Contact> contactList = new ArrayList<>();
        contactList.add(sami);
        contactList.add(lila);
        contactList.add(max);
        contactList.add(nils);
        contactList.add(scott);


        Smartphone smartphone1 = new Smartphone("iphone 11", "apple", contactList);
        System.out.println(smartphone1);
        System.out.println(scott.getName() + " has the index of " + smartphone1.getContact(scott));
        System.out.println(smartphone1.getContactByName("sami"));
        smartphone1.removeContactByName("max");
        System.out.println(smartphone1);
    }}