package org.academiadecodigo.wizards.objects;

import java.util.LinkedList;

public class CollisionDetection {
    public static class Pos{
        private int x, y;
        public Pos(int x, int y){
            this.x = x;
            this.y = y;
        }
        public int getX(){
            return this.x;
        }
        public int getY(){
            return this.y;
        }
    }
    public static void spellCollision(LinkedList<Spell> spells, LinkedList<Enemy> enemies){
        for(int s = 0; s < spells.size(); s++){
            for(int e = 0; e < spells.size(); e++){
                if(checkCollision(spells.get(s), enemies.get(e))){
                    enemies.get(e).hit();
                }
            }
        }
    }

    private static boolean checkCollision(Spell spell, Enemy enemy){
        LinkedList<Pos> spellPixels = new LinkedList<>();
        LinkedList<Pos> enemyPixels = new LinkedList<>();
        // spell
        for(int x = 0; x < spell.getWidth(); x++){
            for(int y = 0; y < spell.getHeight(); y++){
                spellPixels.add(new Pos(spell.getX() + x, spell.getY() + y));
            }
        }
        // enemy
        for(int x = 0; x < enemy.getWidth(); x++){
            for(int y = 0; y < enemy.getHeight(); y++){
                enemyPixels.add(new Pos(enemy.getX() + x, enemy.getY() + y));
            }
        }

        // check collision
        boolean hasCollided = false;

        for(Pos spellPixel : spellPixels){
            if(enemyPixels.contains(spellPixel)){
                hasCollided = true;
            }
        }
        return hasCollided;
    }
}
