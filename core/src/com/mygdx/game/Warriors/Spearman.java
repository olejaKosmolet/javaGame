package com.mygdx.game.Warriors;

public class Spearman extends Warriors {

    public Spearman(String name, int x, int y) {
        super(name, x, y);
    }

    @Override
    public String getInfo() {
        return "Фронтлейнер";
    }
}
