package org.academiadecodigo.wizards.objects;

import org.academiadecodigo.wizards.position.Direction;

public class Spell extends Character {
    private Direction direction;
    private boolean collision;

    public Spell(int x, int y, Direction dir) {
        super(x, y, 20, 5);
        this.direction = dir;
        this.fill();
        move(dir);
    }

    @Override
    public void move(Direction dir) {
        int i = 0;
        while (i < 60) {
            super.move(dir);
            i++;
        }
    }
}
