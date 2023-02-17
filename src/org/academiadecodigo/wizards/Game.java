package org.academiadecodigo.wizards;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.wizards.objects.*;
import org.academiadecodigo.wizards.position.Direction;

import java.util.LinkedList;

public class Game {
    private final int WIDTH;
    private final int HEIGHT;

    private LinkedList<Enemy> enemies;
    private LinkedList<Spell> spells;
    private Wizard wiz;

    private KeyBoardLogic keyBoardLogic;

    public Game(int width, int height) {
        Picture background = new Picture(10, 10, "resources/grass2.png");
        background.draw();
        wiz = new Wizard();
        enemies = new LinkedList<>();
        spells = new LinkedList<>();
        keyBoardLogic = new KeyBoardLogic(wiz, this);
        WIDTH = width;
        HEIGHT = height;
        //Rectangle map = new Rectangle(10, 10, WIDTH, HEIGHT);
        //map.draw();
        enemiesSpawn(2);
        gameLoop();
    }
    public void enemiesSpawn(int numOfEnemies) {
        for (int i = 0; i < numOfEnemies; i++) {
            int x = (int) (Math.random() * (WIDTH - 30) + 10);
            int y = (int) (Math.random() * (HEIGHT - 30) + 10);
            enemies.add(new Enemy(x, y));
        }
    }
    public void enemyMovement() {
        for (Enemy enemy : enemies) {
            if (wiz.getX() < enemy.getX()) {
                enemy.move(Direction.LEFT);
                if (wiz.getY() < enemy.getY()) {
                    enemy.move(Direction.UP);
                } else if (wiz.getY() > enemy.getY()) {
                    enemy.move(Direction.DOWN);
                }
            }
            if (wiz.getX() > enemy.getX()) {
                enemy.move(Direction.RIGHT);
                if (wiz.getY() > enemy.getY()) {
                    enemy.move(Direction.DOWN);
                } else if (wiz.getY() < enemy.getY()) {
                    enemy.move(Direction.UP);
                }
            }
            if (wiz.getX() == enemy.getX()) {
                if (wiz.getY() > enemy.getY()) {
                    enemy.move(Direction.DOWN);
                } else if (wiz.getY() < enemy.getY()) {
                    enemy.move(Direction.UP);
                }
            }
        }
    }
     public void spellMovement (){
        for(Spell spell : spells){
            spell.move(spell.getDirection());
        }
     }
    public void createSpell (){
        spells.add(wiz.castSpell());
    }
    public void objectCollision(Spell spell, Enemy enemy) {
        int enemyXi = enemy.getX();
        int enemyXf = enemyXi + enemy.getWidth();
        if (spell.getX() == enemy.getX() && spell.getY() == enemy.getY()) {
            spell.setCollision();
        }
    }

    public void gameLoop() {
        while (true) {
            enemyMovement();
            spellMovement();
            try{
                Thread.sleep(100);
            }
            catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }

}
