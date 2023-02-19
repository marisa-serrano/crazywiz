package org.academiadecodigo.wizards.objects;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GameObject extends Picture {

    public GameObject(int x, int y, String string) {
        super(x, y, string);
    }

    public GameObject(int x, int y, int width, int height) {
        super();
    }

    public GameObject() {
        super();
    }
}
