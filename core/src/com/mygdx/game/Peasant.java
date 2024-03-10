package com.mygdx.game;


import com.mygdx.game.AbstractUnit.AbstractUnit;
import com.mygdx.game.Place.Position;

import java.util.ArrayList;

public class Peasant extends AbstractUnit {
    public boolean opportunityToGiveShells;

    public Peasant(String name, int x, int y) {
        super(new Position(x, y), name, 3, "hands" , 10, 0, 0, false);
    }

    @Override
    public void getHit(int damage) {
        super.getHit(damage);
    }


    @Override
    public void step(ArrayList<AbstractUnit> enemy, ArrayList<AbstractUnit> friend) {
        if (getHp()<=0) return;

        for (AbstractUnit unit : friend){
            if (unit.getInfo().equals("Снайпер") || unit.getInfo().equals("Арбалетчик")){
                if (unit.needSheells() == true){
                    unit.getSheells();
                    return;
                }
            }
        }
    }

    @Override
    public String getInfo() {
        return "Крестьянин";
    }

}
