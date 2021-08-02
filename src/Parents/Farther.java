package Parents;

import Kids.Kid;
import Things.*;
public class Farther {
    private int age;
    private String name;
    private double weight;
    private double height;
    private String nickname;
    private Kid[] baby;
    private double saving;
    private Car car;
    private House house;


    public Farther(int age, String name, double weight, double height, String nickname, Kid[] baby, double saving, Car car, House house) {
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.nickname = nickname;
        this.baby = baby;
        this.saving = saving;
        this.car = car;
        this.house = house;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public Farther(int age, String name, double weight, double height, String nickname, Kid[] baby, double saving) {
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.nickname = nickname;
        this.baby = baby;
        this.saving = saving;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Kid[] getBaby() {
        return baby;
    }

    public void setBaby(Kid[] baby) {
        this.baby = baby;
    }

    public double getSaving() {
        return saving;
    }

    public void setSaving(double saving) {
        this.saving = saving;
    }

    public void describe() {
        System.out.println("爸爸的名字是" + this.name + ",身高是" + this.height + ",体重是"
                + this.weight + ",小名是" + this.nickname + "。爸爸今年" + this.age + "岁了" + ",家里有"
                + baby.length + "个孩子" + "。情况如下:");
        for (int i = 0; i < baby.length; i++) {
            Kid kid = baby[i];
            kid.describe();
        }
        if(this.car == null){
            System.out.println("该家庭现在还没有车,不过不久的将来就有了！");
        }else{
            car.describe();
        }
        if(this.house == null){
            System.out.println("该家庭现在还没有房,不过不久的将来就有了！");
        }else{
            house.describe();
        }
    }
}
