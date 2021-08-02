package Parents;

import Kids.Kid;

public class Mother extends Farther {

    public Mother(int age, String name, double weight, double height, String nickname, Kid[] baby, double saving) {
        super(age, name, weight, height, nickname, baby, saving);
    }

    public void describe() {
        System.out.println("妈妈的名字是" + this.getName() + ",身高是" + this.getHeight() + ",体重是"
                + this.getWeight() + ",小名是" + this.getNickname() + "。妈妈今年" + this.getAge() + "岁了" +
                ",家里有" + getBaby().length + "个孩子" + "。情况如下:");
        Kid[] baby = this.getBaby();
        for (int i = 0; i < baby.length; i++) {
            Kid kid = baby[i];
            kid.describe();
        }
    }
}
