package Model;


import java.util.ArrayList;

public class Users {
String name;
String address;
int contact;

    ArrayList<Orders>order;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }





    public ArrayList<Orders> getOrder() {
        return order;
    }

    public void setOrder(ArrayList<Orders> order) {
        this.order = order;
    }

    public Users(String name, String address, int contact, ArrayList<Items> item, ArrayList<Orders> order) {
        this.name = name;
        this.address = address;
        this.contact = contact;

        this.order = order;
    }
}
