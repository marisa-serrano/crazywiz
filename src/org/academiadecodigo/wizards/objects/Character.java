package org.academiadecodigo.wizards.objects;

import org.academiadecodigo.wizards.position.Direction;

public class Character extends GameObject {
    private int speed;
    private int health = 100;
    private boolean dead;
    public Character(int x, int y, int speed, String string) {
        super(x, y, string);
        this.speed = speed;
    }


    public void move(Direction dir) {
        if (!dead) {
            switch (dir) {
                case UP:
                    if (this.getY() - this.speed >= 51) {
                        this.translate(0, -speed);
                    }
                    break;
                case DOWN:
                    if (this.getY() + this.speed <= 738) {
                        this.translate(0, speed);
                    }
                    break;
                case LEFT:
                    if (this.getX() - this.speed >= 52) {
                        this.translate(-speed, 0);
                    }
                    break;
                case RIGHT:
                    if(this.getX() + this.speed <= 1450) {
                        this.translate(speed, 0);
                    }
                    break;
            }
            super.draw();
        }
    }

    public void hit() {
        System.out.println("hit");
        if (!dead) {
            health -= 50;
            if (health <= 0) {
                dead = true;
                this.delete();
                System.out.println("hit!");
            }
        }
    }

    public boolean isDead(){
        return this.dead;
    }

    public int getSpeed() {
        return speed;
    }
}
