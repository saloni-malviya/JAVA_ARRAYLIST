/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arraylist_concept;
import java.util.ArrayList;

public class ArrayList_Operations {
    public static void main(String[]args)
    {
        ArrayList<Integer> list=new ArrayList<>();
        //Add operations....
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("The list is");
        System.out.println(list);
        
        //get operations(to access the element use get() method)
        int result=list.get(2);
        System.out.println(result);
        
        //remove operations
        list.remove(2);
        System.out.println("After removing element, the list is");
        System.out.println(list);
        
        //set operations[ to modify or change element, use set() method]
        list.set(1, 22);
        System.out.println("After exchange element");
        System.out.println(list);
        
        //contains element [if any element exist in arraylist or not, we use contains() method]
        System.out.println(list.contains(10));
        System.out.println(list.contains(11));
        
        list.add(3, 34);
        System.out.println(list);
        
    }
}
