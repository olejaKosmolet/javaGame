package com.mygdx.game.Shooters;

import com.mygdx.game.AbstractUnit.AbstractUnit;

import java.util.ArrayList;

public class Crossbowman extends Shooters {
    public Crossbowman(String name, int x, int y, int numberOfShells) {
        super(name, x, y, numberOfShells);
    }

    @Override
    public String getInfo() {
        return "Арбалетчик";
    }

    @Override
    public void step(ArrayList<AbstractUnit> teamEnemy, ArrayList<AbstractUnit> teamFriend) {

    }
}