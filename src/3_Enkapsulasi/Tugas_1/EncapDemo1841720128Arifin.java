/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulation;

/**
 *
 * @author MuFin
 */
public class EncapDemo1841720128Arifin {
    private String name;
    private int age;
    
    public String getNameArifin(){
        return name;
    }
    
    public void setNameArifin(String newName){
        name = newName;
    }
    
    public int getAgeArifin(){
        return age;
    }
    
    public void setAge(int newAge){
        if(newAge > 30){
                age = 30;
        }
        else{
            age = newAge;
        }
    }
}
