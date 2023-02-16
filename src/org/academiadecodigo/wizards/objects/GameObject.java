package org.academiadecodigo.wizards.objects;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class GameObject extends Rectangle {

    public GameObject(int x, int y, int size) {
        super(x, y, size, size);
    }

    public GameObject(int x, int y, int width, int height) {
        super(x, y, width, height);
    }
}
