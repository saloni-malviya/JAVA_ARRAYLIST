/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//        TIME COMPLEXITY = O(N^N)
//..............Find if any pair in sorted ArrayList has a target sum................
//                   List=[1,2,3,4,5,6]     target=5
package Arraylist_concept;
import java.util.ArrayList;
public class Pair_Sum1 {
    public static boolean pairsum(ArrayList<Integer> l, int target)
    {
        for(int i=0;i<l.size();i++)
        {
            for(int j=i+1;j<l.size();j++)
            {
                if(l.get(i)+l.get(j)==target)
                {
                    return true;
                }
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
