/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//....TIME COMPLEXITY = O(N)
package Arraylist_concept;
import java.util.ArrayList;
public class Optimized_PairSum1 {
    public static boolean pairsum(ArrayList<Integer> l,int target)
    {
        int lp=0;
        int rp=l.size()-1;
        while(lp<rp)
        {
            if(l.get(lp)+l.get(rp)==target)
            {
                return true;
            }
            if(l.get(lp)+l.get(rp)<target)
            {
                lp++;
            }
            else
            {
                rp--;
            }
        }
        return false;
    }
    
    public static void main(String[]args)
    {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        int target=5;
        System.out.println(pairsum(l,target));
    }
}
