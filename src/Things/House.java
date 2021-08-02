package Things;

public class House {
    private String houseName;
    private double price;
    private String type;

    public House(String houseName, double price, String type) {
        this.houseName = houseName;
        this.price = price;
        this.type = type;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void describe(){
        System.out.println("房的名字是"+this.houseName+",房的型号是"+this.type+",房的价格是"+this.price);
    }
}
