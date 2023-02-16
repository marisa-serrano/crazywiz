package org.academiadecodigo.wizards.objects;

import org.academiadecodigo.wizards.position.Direction;

public class Spell extends Character {
    private Direction direction;
    private boolean collision;

    public Spell(int x, int y, Direction dir) {
        super(x, y, 5);

        if (dir == Direction.DOWN || dir == Direction.UP) {
            this.grow(0, 15);

        } else {
            this.grow(15, 0);
        }

        this.direction = dir;
        this.fill();
        move(dir);
    }

    @Override
    public void move(Direction dir)  {
        int i = 0;
        while (i < 60) {
            super.move(dir);
            this.fill();
            /*
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }*/
            i++;
        }
    }

    public void setCollision(){
        collision = true;
        this.delete();
    }
}
