/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//You are given an integer arraylist nums. A number x is lonely when it appears only once, and
//no adjacent numbers (i.e. x + 1 and x - 1) appear in the arraylist.
//Return all lonely numbers in nums. You may return the answer in any order

package Arraylist_concept;
import java.util.*;
public class Lonely_number_ArrayList {
    public ArrayList<Integer> lonely(ArrayList<Integer> nums)
    {
        //store lonely
        ArrayList<Integer> list=new ArrayList<>();
        Collections.sort(nums);
        //5,6,7,8,10
        //check middle element
        for(int i=1;i<nums.size()-1;i++)
        {
            if(nums.get(i-1)+1 < nums.get(i) && nums.get(i)+1 < nums.get(i+1))
            {
                list.add(nums.get(i));
            }
        }
        
        //only one num in list
        if(nums.size()==1)
        {
            list.add(nums.get(0));
        }
        
        //check first last element
        if(nums.size()>1)
        {
            if(nums.get(0)+1 < nums.get(1))
            {
                list.add(nums.get(0));
            }
            if(nums.get(nums.size()-2)+1 <nums.get(nums.size()-1)){
                list.add(nums.get(nums.size()-1));
            }
        }
        return list;
    }
    
    public static void main(String[]args)
    {
        ArrayList<Integer> list=new ArrayList<>();
        Lonely_number_ArrayList l=new Lonely_number_ArrayList();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
        ArrayList<Integer> lonly=l.lonely(list);
        System.out.println("The list of lonely numbers is: "+lonly);
    }
}
