package com.mygdx.game.Warriors;


import com.mygdx.game.AbstractUnit.AbstractUnit;
import com.mygdx.game.Place.Position;

import java.util.ArrayList;

abstract public class Warriors extends AbstractUnit {
    public Warriors(String name, int x, int y) {
        super(new Position(x, y), name, 15, "spear", 75, 2, 10, false);
    }

    @Override
    public void getHit(int damage) {
        super.getHit(damage);
    }

    @Override
    public void step(ArrayList<AbstractUnit> enemy, ArrayList<AbstractUnit> friend) {
        if (getHp()<=0) return;

        AbstractUnit target = super.searchForEnemy(enemy);
        if (target == null){
            return;
        }

        if (position.distanceToTarget(target.position) < 2){
            target.getHit(this.damage);
            return;
        }
        Position diff = position.getDifference(target.position);
        Position newposition = new Position(position.x, position.y);

        if (Math.abs(diff.x) > Math.abs(diff.y)) {
            newposition.x += diff.x < 0 ? 1 : -1;
        }
        else
            newposition.y += diff.y < 0 ? 1 : -1;

        for (AbstractUnit unit : friend) {
            if (unit.position.equals(newposition) && unit.getHp() >= 1) return;

        }
        this.position = newposition;

    }
}
