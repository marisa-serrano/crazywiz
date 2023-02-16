package org.academiadecodigo.wizards.objects;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.wizards.position.Direction;

public class Wizard extends Character {
    private Direction aim;

    public Wizard(){
        super(30, 40, 20);
        super.setColor(Color.BLUE);
        super.fill();
    }

    public void setAim(Direction dir){
        aim = dir;
    }

    public void castSpell() {
        Spell spell = new Spell(getX(), getY(), aim);
    }
}
