/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//......TIME COMPLEXITY = O(N)
// find if any pair in a sorted and rotated arraylist has a target sum
package Arraylist_concept;
import java.util.ArrayList;
public class Optimized_Pairsum2 {
    public static boolean pairsum2(ArrayList<Integer> l,int target)
    {
        int pivot=-1;
        int n=l.size();
        for(int i=0;i<l.size();i++)
        {
            if(l.get(i)>l.get(i+1))
            {
                pivot=i;
                break;
            }
            
        }
        int lp=pivot+1;
        int rp=pivot;
        
        while(lp!=rp)
        {
            //case1
            if(l.get(lp)+l.get(rp)==target)
            {
                return true;
            }
            //case 2
            if(l.get(lp)+l.get(rp)<target)
            {
                lp=(lp+1)%n;
            }
            else
            {
                rp=(n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String[]args)
    {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(11);
        l.add(15);
        l.add(6);
        l.add(8);
        l.add(9);
        l.add(10);
        int target=16;
        System.out.println(pairsum2(l,target));
    }
}
