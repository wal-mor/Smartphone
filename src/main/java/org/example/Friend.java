package org.example;

public class Friend extends Contact {
    String telfonnumber ;

    public Friend(String name, String telfonnumber) {
        super(name);
        this.telfonnumber = telfonnumber;
    }

    public Friend() {

    }

    @Override
    public String toString() {
        return "Friend{" +
                "telfonnumber='" + telfonnumber + '\'' +
                ", name='" + getName()+ '\'' +
                '}';
    }
}
