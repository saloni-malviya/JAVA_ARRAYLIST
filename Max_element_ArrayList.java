/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//..............Program to find maximum element in arraylist....................
package Arraylist_concept;
import java.util.ArrayList;
public class Max_element_ArrayList {
    public static void main(String[]args)
    {
        ArrayList<Integer> n1=new ArrayList<>();
        n1.add(23);
        n1.add(45);
        n1.add(22);
        n1.add(34);
        n1.add(12);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n1.size();i++)
        {
            if(n1.get(i)>max)
            {
                max=n1.get(i);
            }
        }
        System.out.println("The max element is:"+max);
    }
    
}
