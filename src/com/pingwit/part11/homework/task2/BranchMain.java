package com.pingwit.part11.homework.task2;

public class BranchMain {
    public static void main(String[] args) {
        Branch branch1 = new Branch(new Fruits[]{Fruits.BANANA}, new Branch[0]);
        Branch branch2 = new Branch(new Fruits[]{Fruits.COCONUT, Fruits.BANANA}, new Branch[0]);
        Branch branch3 = new Branch(new Fruits[]{Fruits.COCONUT, Fruits.BANANA}, new Branch[0]);
        Branch root = new Branch(new Fruits[]{Fruits.BANANA, Fruits.COCONUT}, new Branch[]{branch1, branch2, branch3});

        Monkey bananaMonkey = new BananaMonkey();
        Monkey coconutMonkey = new CoconutMonkey();
        Monkey smartMonkey = new SmartMonkey();

        MonkeyManager manager = new MonkeyManager();

        System.out.println("Количество бананов: " + manager.askMonkeyToCountFruits(bananaMonkey, root));
        System.out.println("Количество кокосов: " + manager.askMonkeyToCountFruits(coconutMonkey, root));
        System.out.println("Всего фруктов: " + manager.askMonkeyToCountFruits(smartMonkey, root));
    }
}
