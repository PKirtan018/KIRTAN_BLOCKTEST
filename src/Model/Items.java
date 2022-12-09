package Model;

public class Items {
    String item_name;
    int code;
    String brand;
    int price;
    String size;

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Items(String item_name, int code, String brand, int price, String size) {
        this.item_name = item_name;
        this.code = code;
        this.brand = brand;
        this.price = price;
        this.size = size;
    }
    public void printformat1(){
        System.out.println("Item name:" +this.item_name);
        System.out.println("code:" +this.code);
        System.out.println("Brand:"+this.brand);
        System.out.println("Price:"+this.price);
        System.out.println("size:"+this.size);
    }
}

