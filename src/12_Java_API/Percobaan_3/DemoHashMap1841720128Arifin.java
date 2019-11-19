/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arifin.Collection.Percobaan3;

import java.util.HashMap;

/**
 *
 * @author MuFin
 */
public class DemoHashMap1841720128Arifin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap hMapItem = new HashMap();
        hMapItem.put("1", "Biskuit");
        hMapItem.put("2", "Shampoo");
        hMapItem.put("3", "Soap");
        System.out.println(hMapItem);
        System.out.format("HashMap Item Total : %d\n", hMapItem.size());
        
        Object mObject = hMapItem.remove("1");
        System.out.format("%s remove Hashmap\n", mObject);
        System.out.format("HashMap Item Total : %d\n", hMapItem.size());
        System.out.println(hMapItem);
        
        hMapItem.clear();
        System.out.format("HashMap Item Total : %d\n", hMapItem.size());
    }
}
