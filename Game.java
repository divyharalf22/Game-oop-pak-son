/*
 *
 */
package game;

/**
 *
 * @author divya
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Buat objek
       Player Hero = new Player();
       Player Enemy = new Player();
       
       //memberi nilai atribut
       Hero.name = "Kwiran";
       Hero.speed = 20;
       Hero.healthPoin = 100;
       Hero.damage = 1000;
       Hero.shield = 150;
       
       //Enemy
       Enemy.name = "Uhayy";
       Enemy.speed = 25;
       Enemy.healthPoin = 100;
       Enemy.damage = 500;
       Enemy.shield = 200;
       
       Hero.run();
       
       if(Hero.isDead()){
           System.out.println(Hero.name+" is Dead, Game is over :) ");
       }
       Hero.attack();
        System.out.println(Hero.name+" Attacking " + Enemy.name);
        System.out.println(Enemy.name+" Attacking Back " + Hero.name);
        
        Hero.defense();
        System.out.println(Hero.name+" Shield = 50 ");
        System.out.println(Hero.name+" Attack again to " + Enemy.name);
        System.out.println(Enemy.name+" HP = 0 ");
        System.out.println(Enemy.name+" is Dead");
    }
    
}
