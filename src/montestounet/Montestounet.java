/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montestounet;

/**
 *
 * @author Adrien
 */
public class Montestounet {

    /**
     * @param args the command line arguments
     */
    static int i = 0;
    public static void main(String[] args) {
        // TODO code application logic here
        Lapin lap = new Lapin("Lola", 4);
        while(i <= 10){
            lap.lapinCretin();
            i = i +1;
        }
    }
    
    public static void printWelcome() {
        System.out.println("Hello world !");
    }
          
}
