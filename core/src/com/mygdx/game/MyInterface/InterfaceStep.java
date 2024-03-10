package com.mygdx.game.MyInterface;

import com.mygdx.game.AbstractUnit.AbstractUnit;

import java.util.ArrayList;

public interface InterfaceStep {
    void step(ArrayList<AbstractUnit> teamEnemy, ArrayList<AbstractUnit> teamFriend);
}
