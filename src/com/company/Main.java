package com.company;

public class Main {

    public static void main(String[] args) {
        Doshka doshka = new Ski();
        Sporiadzhennia sporiadzhennia1 = new Sporiadzhennia(doshka);
        Skier skier1 = new Skier(sporiadzhennia1);

        skier1.jump();
        skier1.getSporiadzhennia().getDoshka().setLength(150);
        ((Ski)skier1.getSporiadzhennia().getDoshka()).printLength();
    }
}
