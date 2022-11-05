package org.example;

import java.util.List;

public class Smartphone implements Radio,Gps{

    private String model;
    private String manfacture;
    private List<Contact> contact;


    public Smartphone() {
    }

    public Smartphone(String model, String manfacture, List<Contact> contactList) {
        this.model = model;
        this.manfacture = manfacture;
        this.contact = contactList;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManfacture() {
        return manfacture;
    }

    public void setManfacture(String manfacture) {
        this.manfacture = manfacture;
    }

    public List<Contact> getContact() {
        return contact;
    }

    public void setContact(List<Contact> contact) {
        this.contact = contact;
    }

    @Override
    public String getPosition() {
        return "Köln";
    }

    @Override
    public boolean startRadio() {
        System.out.println("Radio started");
        return true;

    }

    @Override
    public boolean stopRadio() {
        System.out.println("Radio stopped");
        return false;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "model='" + model + '\'' +
                ", manfacture='" + manfacture + '\'' +
                ", contactList=" + contact +
                '}';
    }

    public void addContact(Contact contact){
        this.contact.add(contact);
    }

    public int getContact(Contact contact){
        return this.contact.indexOf(contact);
    }

    public Contact getContactByName(String name){
        for(Contact i: contact){
            if(i.getName().equals(name)){
                return i;
            }
        }
        return null;
    }


    public void removeContactByName(String name){

        for(Contact i : contact){
            if(i.getName().equals(name)){
                System.out.println(name+"  has been removed from the list");

                contact.remove(i);
               return;

            }

        }

    }


}