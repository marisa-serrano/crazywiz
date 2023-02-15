package org.academiadecodigo.wizards.objects;

import org.academiadecodigo.wizards.position.Direction;

public class Character extends GameObject{
    private int speed;
    public Character(int x, int y, int size) {
        super(x, y, size);
        speed = 5;
    }

    public void move(Direction dir){
        switch(dir){
            case UP:
                super.translate(0, -speed);
                break;
            case DOWN:
                super.translate(0, speed);
                break;
            case LEFT:
                super.translate(-speed, 0);
                break;
            case RIGHT:
                super.translate(speed, 0);
                break;
        }
        super.fill();
    }
}
