package org.academiadecodigo.wizards.objects;

import org.academiadecodigo.wizards.position.Direction;

public class Character extends GameObject {
    private int speed;
    public Character(int x, int y, int size) {
        super(x, y, size);
        speed = 5;
    }

    public Character(int x, int y, int width, int height) {
        super(x, y, width, height);
        speed = 5;
    }

    public void move(Direction dir){
        switch(dir){
            case UP:
                this.translate(0, -speed);
                break;
            case DOWN:
                this.translate(0, speed);
                break;
            case LEFT:
                this.translate(-speed, 0);
                break;
            case RIGHT:
                this.translate(speed, 0);
                break;
        }
        super.fill();
    }
}
