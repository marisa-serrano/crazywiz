package org.academiadecodigo.wizards.objects;

import org.academiadecodigo.simplegraphics.graphics.Color;

public class Enemy extends GameObject {
    public Enemy(){
        super(10, 40, 20);
        super.getShape().setColor(Color.RED);
        super.getShape().fill();
    }
}
