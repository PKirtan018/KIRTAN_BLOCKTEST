import Model.Items;
import Model.Orders;
import Model.Users;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Items a=new Items("hoodie",4545,"addidas",4500,"XXl");
        Items b=new Items("tshirt",4545,"aallstar",4500,"XXl");
        Items c=new Items("tanktop",4545,"levis",4500,"XXl");
        Items d=new Items("vcut",4545,"balenciaga",4500,"XXl");
        Items e=new Items("hook",4545,"nike",4500,"XXl");

        ArrayList<Items>item1=new ArrayList<>();
        item1.add(a);
        item1.add(b);

        ArrayList<Items>item2=new ArrayList<>();
        item2.add(c);
        item2.add(d);

        ArrayList<Orders> orders1=new ArrayList<>();
        Orders f=new Orders(4,"monday",item1);
        Orders g=new Orders(5,"tuedsay",item2);

        orders1.add(f);
        orders1.add(g);

        ArrayList<Orders> orders2=new ArrayList<>();
        Orders h=new Orders(6,"monday",item1);
        Orders i=new Orders(7,"tuedsay",item2);

        orders1.add(h);
        orders1.add(i);

a.printformat1();
    }

}
