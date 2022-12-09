package Model;

import java.util.ArrayList;

public class Orders {
int total_order;
String date;

ArrayList<Items>items;

    public int getTotal_order() {
        return total_order;
    }

    public void setTotal_order(int total_order) {
        this.total_order = total_order;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ArrayList<Items> getItems() {
        return items;
    }

    public void setItems(ArrayList<Items> items) {
        this.items = items;
    }

    public Orders(int total_order, String date, ArrayList<Items> items) {
        this.total_order = total_order;
        this.date = date;
        this.items = items;
    }
}
