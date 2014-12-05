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



public class Lapin {
   private String nom;
   private int age;

    public Lapin(String n, int a) {
        nom = n;
        age = a;
    }
    
    public String getName(){
        return nom;
    }
 
    public int getAge(){
        return age;
    }
    
    public void setName(String name){
        nom = name;
    }
    
    public void setAge(int a){
        age = a;
    }
    
    public void lapinCretin(){
        System.out.println("HAAAAA");
    }
    
}