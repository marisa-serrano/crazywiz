package org.academiadecodigo.wizards.objects;

import org.academiadecodigo.simplegraphics.graphics.Color;

public class Enemy extends Character {

    public Enemy(int x, int y){
        super(x, y, 20, 5);
        super.setColor(Color.RED);
        super.fill();
    }


}
