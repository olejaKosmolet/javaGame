package com.mygdx.game.Shooters;

import com.mygdx.game.AbstractUnit.AbstractUnit;

import java.util.ArrayList;

public class Sniper extends Shooters {
    public Sniper(String name, int x, int y, int numberOfShells) {
        super(name, x, y, numberOfShells);
    }

    @Override
    public String getInfo() {
        return "Снайпер";
    }

    @Override
    public void step(ArrayList<AbstractUnit> teamEnemy, ArrayList<AbstractUnit> teamFriend) {

    }
}