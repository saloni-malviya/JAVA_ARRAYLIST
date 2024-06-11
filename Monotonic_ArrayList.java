/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Monotonic ArrayList (EASY)
//An Arraylist is monotonic if it is either monotone increasing or monotone decreasing.
//An Arraylist nums is monotone increasing if for all i <= j, nums.get(i) <= nums.get(j). An
//Arraylist nums is monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j).

//Given an integer Arraylist nums, return true if the given list is monotonic, or false otherwise.

package Arraylist_concept;
import java.util.*;
public class Monotonic_ArrayList {
    public static boolean monotonic(ArrayList<Integer> A)
    {
        boolean incr=true;
        boolean decre=true;
        for(int i=0;i<A.size()-1;i++)
        {
            if(A.get(i)>A.get(i+1))
            {
                incr= false;
            }
            if(A.get(i)<A.get(i+1))
            {
                decre= false;
            }
        }
        return incr || decre;
    }
    public static void main(String[]args)
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(3);
       System.out.println(monotonic(list));
           
    }
}
