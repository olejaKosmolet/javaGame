package com.mygdx.game.Warriors;

public class Rogue extends Warriors {

    public Rogue(String name, int x, int y) {
        super(name, x, y);
    }

    @Override
    public String getInfo() {
        return "Разбойник";
    }
}
