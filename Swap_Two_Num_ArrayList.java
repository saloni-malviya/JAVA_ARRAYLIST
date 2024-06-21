/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//...............Program to swap two numbers in arraylist.........................
package Arraylist_concept;
import java.util.ArrayList;
public class Swap_Two_Num_ArrayList {
    public static void swap(ArrayList<Integer> n2, int index1, int index2)
    {
        int temp=n2.get(index1);
        n2.set(index1, n2.get(index2));
        n2.set(index2, temp);
    }
    public static void main(String[]args)
    {
        ArrayList<Integer> n2=new ArrayList<>();
        n2.add(1);
        n2.add(2);
        n2.add(3);
        n2.add(4);
        n2.add(5);
        int index1=2;
        int index2=3;
        System.out.println("before swapping the list is:");
        System.out.println(n2);
        
        System.out.println("after swapping the list is:");
        swap(n2,index1,index2);
        System.out.println(n2);
    }
    
}
