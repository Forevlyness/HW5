package com.company;
public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(100);
        boss.setHeals(800);
        boss.setDefenceType("Magical");
        System.out.println(boss.getDamage());
        System.out.println(boss.getDefenceType());
        System.out.println(boss.getHeals());
        System.out.println(createHeroes("Thor"));

    }

    public static Heroes createHeroes(String className) {
        switch (className){
            case "Hunter":
                return new Hunter(150, 50, "Magical");
            case "Zeus":
                return new Zeus(300, 100);
            case "Thor":
                return new Hunter(200, 75);
            default:
                return null;
        }
    }
}