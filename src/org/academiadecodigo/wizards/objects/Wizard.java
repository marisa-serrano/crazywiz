package org.academiadecodigo.wizards.objects;

import org.academiadecodigo.simplegraphics.graphics.Color;

public class Wizard extends GameObject {

    public Wizard(){
        super(30, 40, 20);
        super.getShape().setColor(Color.BLUE);
        super.getShape().fill();
    }
}
