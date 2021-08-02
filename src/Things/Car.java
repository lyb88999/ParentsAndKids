package Things;

public class Car {
    private String carName;
    private double price;
    private String type;

    public Car(String carName, double price, String type) {
        this.carName = carName;
        this.price = price;
        this.type = type;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
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
        System.out.println("车的名字是"+this.carName+",车的型号是"+this.type+",车的价格是"+this.price);
    }
}
