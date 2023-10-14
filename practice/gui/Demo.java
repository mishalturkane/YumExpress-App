/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.gui;

import java.util.ArrayList;

/**
 *
 * @author misha
 */
public class Demo {
    public static void main(String[] args) {
          ArrayList<String> mylist=new ArrayList<>();
          mylist.add("Mishal");
          mylist.add("Vilash");
          mylist.add("Cricket");
          mylist.add("Kabaddi");
        
        System.out.println(mylist.contains("Kabaddi"));
    }
    
}
