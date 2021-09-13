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
           Scanner in = new Scanner(System.in);
        System.out.print("If u want to play write 2 if u want to leave write 1:");             
        int LeaveOrNo = in.nextInt();
        int Try=0;
        while(LeaveOrNo==2){
        // TODO code application logic here
        Random random=new Random();
                int RandomNumber=random.nextInt(20);
                        System.out.println("RandomNumber:"+RandomNumber);
        System.out.print("Input a number: ");             
        int Lucku = in.nextInt(); 
                 
        if(RandomNumber==Lucku){
            System.out.println("You Win");    
            break;
       }
        else{
            
          System.out.println("New Number u failed:"+Lucku);
            Try++;
            System.out.println("Try:"+Try);
        }
        if( Try == 3) {

                      System.out.println("YOU FAILED");
                      break;
        }
        
        }
} 
}
    
