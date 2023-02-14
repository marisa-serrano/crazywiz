package org.academiadecodigo.wizards.objects;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.wizards.position.Position;
import org.academiadecodigo.wizards.position.Aim;

public class GameObject {
    private Rectangle rectangle;
    private Position pos;
    private Aim aim;

    public GameObject(int x, int y, int size){
        rectangle = new Rectangle(x, y, size, size);
    }

    public Rectangle getShape() {
        return rectangle;
    }
}
