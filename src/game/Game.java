/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author pupil
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random=new Random()
                int RandomNumber=random.nextInt(20)
                        System.out.println(RandomNumber);
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");             
        int Lucku = in.nextInt(); 
                 
       while(Lucku != RandomNumber){
            System.out.print("Input a number: ");             
        int Lucku = in.nextInt(); 
           
       } 
       }
    }
    
}
