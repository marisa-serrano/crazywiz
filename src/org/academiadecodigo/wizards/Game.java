package org.academiadecodigo.wizards;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.wizards.objects.KeyBoardLogic;
import org.academiadecodigo.wizards.objects.Wizard;
import org.academiadecodigo.wizards.objects.Enemy;
import org.academiadecodigo.wizards.position.Direction;

public class Game {
    private final int WIDTH;
    private final int HEIGHT;
    private final int CELL_SIZE;
    private Wizard wiz = new Wizard();
    private Enemy enemy = new Enemy();

    private KeyBoardLogic keyBoardLogic = new KeyBoardLogic(wiz);

    public Game(int width, int height, int cellSize) {
        WIDTH = width;
        HEIGHT = height;
        CELL_SIZE = cellSize;
        Rectangle map = new Rectangle(10, 10, WIDTH*CELL_SIZE, HEIGHT*CELL_SIZE);
        map.draw();
    }
}
