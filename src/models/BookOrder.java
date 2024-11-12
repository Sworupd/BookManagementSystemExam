package models;

public class BookOrder {
    int Orderid;
    int Price;

    public BookOrder(int orderid, int price) {
        Orderid = orderid;
        Price = price;
    }

    public int getOrderid() {
        return Orderid;
    }

    public void setOrderid(int orderid) {
        Orderid = orderid;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
}
