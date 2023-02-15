package org.academiadecodigo.wizards.objects;

import org.academiadecodigo.simplegraphics.graphics.Color;

public class Enemy extends Character {
    public Enemy(){
        super(10, 40, 20);
        super.setColor(Color.RED);
        super.fill();
    }
}
