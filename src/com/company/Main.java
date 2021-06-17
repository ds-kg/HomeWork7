package com.company;

public class Main {

    public static void main(String[] args) {
//        Создать интерфейс с одним методом - применить суперСпособность
//        Реализовать этот интерфейс в классах Warrior, Magical, Mental

        Mental mental = new Mental();
        Magical magical = new Magical();
        Warrior warrior = new Warrior();

        mental.setHealth(200);
        magical.setHealth(200);
        warrior.setHealth(200);

        mental.setDamage(80);
        magical.setDamage(80);
        warrior.setDamage(75);



        System.out.println("Magical`s info: " + magical.getHealth() + " " + mental.getDamage());
        System.out.println("Mental`s info: " + mental.getHealth() + " " + mental.getDamage());
        System.out.println("Warrior`s info: " + warrior.getHealth() + " " + warrior.getDamage());

        System.out.println("=======================================");

        mental.Ability();
        magical.Ability();
        warrior.Ability();
    }
}
