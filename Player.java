/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

/**
 *
 * @author divya
 */
public class Player {
    //atribut
    String name;
    int speed , healthPoin , damage , shield;
    
    //method
    void run(){
        System.out.println(name+" is running to find Uhayy");
        System.out.println("Speed = "+speed);
    }
    
    void attack(){
        System.out.println(name+ " is attacking");
        System.out.println("Attack = "+ damage);
    }
    
    void defense(){
        System.out.println(name+ " is defense");
        System.out.println("Defense = "+ shield);
    }
    
    boolean isDead(){
        if(healthPoin<=0)
            return true;
        return false;
        }
    }

