import Parents.*;

import Kids.Kid;
import Things.*;

public class LittleHouse {
    public static void main(String[] args) {
        Kid baby1 = new Kid("20210802","男","武佳博",5,"小博");
        Kid baby2 = new Kid("20210802","女","李宇敏",4,"小敏");
        Kid[] Kids = new Kid[2];
        Kids[0] = baby1;
        Kids[1] = baby2;
        Farther farther = new Farther(21,"李宇博",52,170,"小昊",Kids,
                20000);
        Mother mother = new Mother(19,"武佳敏",52,165,"敏敏",Kids,
                20000);
        farther.describe();
        System.out.println();
        mother.describe();
        System.out.println();
        System.out.println("现在家里有"+farther.getSaving()+"钱");
        Car car = new Car("特斯拉",200000,"电动跑车");
        House house = new House("快乐之家",500000,"别墅");
        System.out.println();
        baby1.makeMoney(farther,mother);
        System.out.println();
        System.out.println("现在家里有"+farther.getSaving()+"钱");
        System.out.println();
        baby1.buy(farther,mother,car);
        System.out.println();
        baby1.buy(farther,mother,house);
        System.out.println();
        System.out.println("现在家里还有"+farther.getSaving()+"钱");
        System.out.println();
        farther.describe();
        System.out.println();
        mother.describe();
    }
}
