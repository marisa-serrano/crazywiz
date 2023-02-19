package org.academiadecodigo.wizards.objects;

import org.academiadecodigo.wizards.position.Direction;

public class Spell extends Character {
    private Direction direction;
    private boolean collision;

    public Spell(int x, int y, Direction dir) {
        super(x, y, 15, "resources/fireballRight.png");


        if (dir == Direction.DOWN || dir == Direction.UP) {
            this.grow(0, 15);

        } else {
            this.grow(15, 0);
        }
        this.direction = dir;
        this.draw();
        move(dir);
    }

    public void setCollision() {
        collision = true;
        this.delete();
    }

    public boolean hasCollided(){
        return this.collision;
    }

    public Direction getDirection() {
        return direction;
    }

    public int[] getPos(){
        return new int[] {this.getX(), this.getY()};
    }

    public void checkBounds (){
            if (!(this.getY() - this.getSpeed() >= 51)) {
                this.setCollision();
            }
            if (!(this.getY() + this.getSpeed() <= 738)) {
                this.setCollision();
            }
            if (!(this.getX() - this.getSpeed() >= 52)) {
                this.setCollision();
            }
            if(!(this.getX() + this.getSpeed() <= 1450)) {
                this.setCollision();
            }
        }
}
