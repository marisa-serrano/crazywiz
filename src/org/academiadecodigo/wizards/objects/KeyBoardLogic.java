package org.academiadecodigo.wizards.objects;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.wizards.Game;
import org.academiadecodigo.wizards.position.Direction;

import javax.swing.plaf.basic.BasicTreeUI;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyBoardLogic implements KeyboardHandler {

    private Keyboard keyboard;

    private KeyboardEvent right, left, up, down, space, rightArrow, leftArrow, upArrow, downArrow, print;
    private Wizard wiz;
    private Game game;
    public KeyBoardLogic(Wizard wiz, Game game) {
        this.wiz = wiz;
        this.game = game;
        this.keyboard = new Keyboard(this);

        right = setEvent(KeyboardEvent.KEY_D);
        left = setEvent(KeyboardEvent.KEY_A);
        up = setEvent(KeyboardEvent.KEY_W);
        down = setEvent(KeyboardEvent.KEY_S);
        space = setEvent(KeyboardEvent.KEY_SPACE);
        rightArrow = setEvent(KeyboardEvent.KEY_RIGHT);
        leftArrow = setEvent(KeyboardEvent.KEY_LEFT);
        upArrow = setEvent(KeyboardEvent.KEY_UP);
        downArrow = setEvent(KeyboardEvent.KEY_DOWN);
        print = setEvent(KeyboardEvent.KEY_P);
    }

    public KeyboardEvent setEvent(int key) {
        KeyboardEvent e = new KeyboardEvent();
        e.setKey(key);
        e.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        this.keyboard.addEventListener(e);
        return e;
    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        if (keyboardEvent.getKey() == right.getKey()) {
                wiz.move(Direction.RIGHT);
        }
        if (keyboardEvent.getKey() == left.getKey()) {
                wiz.move(Direction.LEFT);
        }
        if (keyboardEvent.getKey() == up.getKey()) {
                wiz.move(Direction.UP);
        }
        if (keyboardEvent.getKey() == down.getKey()) {
                wiz.move(Direction.DOWN);
        }
        if (keyboardEvent.getKey() == space.getKey()) {
            game.createSpell();
        }
        if (keyboardEvent.getKey() == rightArrow.getKey()) {
            wiz.setAim(Direction.RIGHT);
        }
        if (keyboardEvent.getKey() == leftArrow.getKey()) {
            wiz.setAim(Direction.LEFT);
        }
        if (keyboardEvent.getKey() == upArrow.getKey()) {
            wiz.setAim(Direction.UP);
        }
        if (keyboardEvent.getKey() == downArrow.getKey()) {
            wiz.setAim(Direction.DOWN);
        }
        if (keyboardEvent.getKey() == print.getKey()) {
            System.out.println(wiz.getX() + ", " + wiz.getY());
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

}
