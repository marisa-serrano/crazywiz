package org.academiadecodigo.wizards.objects;

import org.academiadecodigo.wizards.position.Direction;

public class Wizard extends Character {
    private Direction aim = Direction.RIGHT;

    public Wizard(){
        super(52, 51, 20, "resources/wizard.png");
        super.draw();
    }

    public void setAim(Direction dir){
        aim = dir;
    }

    public  Spell castSpell() {
        return new Spell(getX(), getY(), aim);
    }
}
