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

        @Override
        public String toString(){
            return x + "," + y;
        }
    }
    public static void spellCollision(LinkedList<Spell> spells, LinkedList<Enemy> enemies){
        if(spells.isEmpty() || enemies.isEmpty()){
            return;
        }
        for(int s = 0; s < spells.size(); s++){
            for(int e = 0; e < spells.size(); e++){
                if (checkCollision(spells.get(s), enemies.get(e))) {
                    enemies.get(e).hit();
                    spells.get(s).delete();
                    spells.remove(s);
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
        for(int s = 0; s < spellPixels.size(); s++){
           if(spellPixels.get(s).getX() >= enemy.getX() && spellPixels.get(s).getX() <= enemy.getX() + enemy.getWidth()){
               if(spellPixels.get(s).getY() >= enemy.getY() && spellPixels.get(s).getY() <= enemy.getY() + enemy.getHeight()) {
                   System.out.println("hey hey! bam bam!");
                   return true;
               }
           }
        }
        return false;
    }
}
