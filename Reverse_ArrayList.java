/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//.............Program to Print Reverse of ArrayList.....................TC=O(n)
package Arraylist_concept;
import java.util.ArrayList;
public class Reverse_ArrayList {
    public static void main(String[]args)
    {
        ArrayList<Integer> n=new ArrayList<>();
        n.add(1);
        n.add(2);
        n.add(3);
        n.add(4);
        n.add(5);
        System.out.println("List before reversed");
        System.out.println(n);
        //reverse
        System.out.println("List after reverse");
        for(int i=n.size()-1;i>=0;i--)
        {
            
            System.out.print(+n.get(i)+" ");
        }
        System.out.println();
    }
    
}
