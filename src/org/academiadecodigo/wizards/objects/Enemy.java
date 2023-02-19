package org.academiadecodigo.wizards.objects;

public class Enemy extends Character {

    public Enemy(int x, int y){
        super(x, y, 20, "resources/zomby.png");
        super.draw();
    }
}
