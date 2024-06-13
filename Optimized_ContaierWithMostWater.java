/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//............Time Complexity:- O(n)
package Arraylist_concept;
import java.util.ArrayList;
public class Optimized_ContaierWithMostWater {
    public static int maxwaterr(ArrayList<Integer> heights)
    {
        int lp=0;
        int rp=heights.size()-1;
        int max=0;
        while(lp<rp)
        {
            int ht=Math.min(heights.get(lp), heights.get(rp));
            int width=rp-lp;
            int water=ht*width;
            max=Math.max(max,water);
            
            //update ptr
            if(heights.get(lp)<heights.get(rp))
            {
                lp++;
            }
            else
            {
                rp--;
            }
        }
        return max;
    }
    
    public static void main(String[]args)
    {
        ArrayList<Integer> heights=new ArrayList<>();
        heights.add(1);
        heights.add(8);
        heights.add(6);
        heights.add(2);
        heights.add(5);
        heights.add(4);
        heights.add(8);
        heights.add(3);
        heights.add(7);
        System.out.println(maxwaterr(heights));
        
    }
}
