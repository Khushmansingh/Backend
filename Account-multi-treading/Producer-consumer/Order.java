public class Order{

    int orderid;
    String name;

    Order(int orderid , String name){
        this.orderid = orderid;
        this.name = name;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}