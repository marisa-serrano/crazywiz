package org.academiadecodigo.wizards.objects;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.wizards.position.Direction;

import javax.swing.plaf.basic.BasicTreeUI;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyBoardLogic implements KeyboardHandler {

    private Keyboard keyboard;

    private KeyboardEvent right, left, up, down, space, rightArrow, leftArrow, upArrow, downArrow;
    private Wizard wiz;

    public KeyBoardLogic(Wizard wiz) {
        this.wiz = wiz;
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
            wiz.castSpell();
        }
        if (keyboardEvent.getKey() == rightArrow.getKey()) {
            wiz.setAim(Direction.RIGHT);
        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

}
