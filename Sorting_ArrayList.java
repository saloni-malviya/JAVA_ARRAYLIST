/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//...............Program to sort list in ascending and desending order..................
package Arraylist_concept;
import java.util.*;
public class Sorting_ArrayList {
    public static void main(String[]args)
    {
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(2);
        list2.add(9);
        list2.add(5);
        list2.add(3);
        list2.add(12);
        
        System.out.println(list2);
        Collections.sort(list2);
        System.out.println("sorting in ascending order");
        System.out.println(list2);
        
        //desending order
        Collections.sort(list2,Collections.reverseOrder());
        System.out.println("sorting in descending order");
        System.out.println(list2);
    }
}
