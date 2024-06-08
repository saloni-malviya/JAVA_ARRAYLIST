/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//.......Container with most water   Time Complexity=O(n^n)
//for given n lines on x-axis,use 2 lines to form a container such that it holds maximum water
//......height=[1,8,6,2,5,4,8,3,7
package Arraylist_concept;
import java.util.ArrayList;
public class Container_With_MostWater {
    public static int maxwater(ArrayList<Integer> height)
    {
        int max=0;
        for(int i=0;i<height.size();i++)
        {
            for(int j=i+1;j<height.size();j++)
            {
                int ht=Math.min(height.get(i), height.get(j));
                int width=j-i;
               int water_area=width*ht; 
               max=Math.max(max, water_area);
            }
        }
        return max;
        
    }
    public static void main(String[]args)
    {
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(maxwater(height));
    }
}
