package Kids;

import Parents.*;
import Things.*;

public class Kid {
    private String BirthDay;
    private String sex;
    private String name;
    private double weight;
    private String nickname;

    public Kid(String birthDay, String sex, String name, double weight, String nickname) {
        BirthDay = birthDay;
        this.sex = sex;
        this.name = name;
        this.weight = weight;
        this.nickname = nickname;
    }

    public String getBirthDay() {
        return BirthDay;
    }

    public void setBirthDay(String birthDay) {
        BirthDay = birthDay;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void describe(){
        System.out.println("孩子的名字是"+this.name+",是一个"+this.sex+"孩,"+"出生日期是"+this.BirthDay+
                ",刚生下来体重是"+this.weight+",小名是"+this.nickname);
    }

    public void makeMoney(Farther farther,Mother mother){
        System.out.println("十年之后,孩子长大了,买彩票中了1000000");
        farther.setSaving(farther.getSaving()+1000000);
        mother.setSaving(mother.getSaving()+1000000);
    }

    public void buy(Farther farther,Mother mother,Car car){
        if(farther.getSaving()<car.getPrice()){
            System.out.println("您还没有足够的钱买车");
        }else{
            farther.setSaving(farther.getSaving()-car.getPrice());
            farther.setCar(car);
            mother.setSaving(mother.getSaving()-car.getPrice());
            mother.setCar(car);
            System.out.println("成功购买一辆车,车的情况如下");
            car.describe();
        }
    }
    public void buy(Farther farther,Mother mother,House house){
        if(farther.getSaving()<house.getPrice()){
            System.out.println("您还没有足够的钱买房");
        }else{
            farther.setSaving(farther.getSaving()-house.getPrice());
            farther.setHouse(house);
            mother.setSaving(mother.getSaving()-house.getPrice());
            mother.setHouse(house);
            System.out.println("成功购买一套房,房子情况如下:");
            house.describe();
        }
    }
}
