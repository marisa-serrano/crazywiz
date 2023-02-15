package org.academiadecodigo.wizards.objects;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.wizards.position.Position;
import org.academiadecodigo.wizards.position.Aim;

public class GameObject extends Rectangle {
    private Aim aim;

    public GameObject(int x, int y, int size){
        super(x, y, size, size);
    }
}
