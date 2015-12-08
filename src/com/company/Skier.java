package com.company;

/**
 * Created by Vitaliy on 12/8/2015.
 */
public class Skier implements Pokatushki, Aas{

    @Override
    public void bbb() {

    }

    private Sporiadzhennia sporiadzhennia;

    public Skier(Sporiadzhennia sporiadzhennia) {
        this.sporiadzhennia = sporiadzhennia;
    }

    public Sporiadzhennia getSporiadzhennia() {
        return sporiadzhennia;
    }

    public void setSporiadzhennia(Sporiadzhennia sporiadzhennia) {
        this.sporiadzhennia = sporiadzhennia;
    }

    @Override
    public void katatys() {

    }

    @Override
    public void padaty() {

    }

    @Override
    public void jump() {
        System.out.println("JUMP");

    }

    @Override
    public void pidnimatys() {

    }

    @Override
    public void die() {

    }
}
