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

    private KeyboardEvent right, left, up, down, space;
    private Character wiz;
    public KeyBoardLogic (Character wiz) {
        this.wiz = wiz;
        this.keyboard = new Keyboard(this);
        right = new KeyboardEvent();
        right.setKey(KeyboardEvent.KEY_D);
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        this.keyboard.addEventListener(right);

        left = new KeyboardEvent();
        left.setKey(KeyboardEvent.KEY_A);
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        this.keyboard.addEventListener(left);


        up = new KeyboardEvent();
        up.setKey(KeyboardEvent.KEY_W);
        up.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        this.keyboard.addEventListener(up);


        down = new KeyboardEvent();
        down.setKey(KeyboardEvent.KEY_S);
        down.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        this.keyboard.addEventListener(down);

        space = new KeyboardEvent();
        space.setKey(KeyboardEvent.KEY_SPACE);
        space.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        this.keyboard.addEventListener(space);
    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        if(keyboardEvent.getKey() == right.getKey()){
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
            System.out.println("FIREBALL"); 
        }

    }
    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

}
