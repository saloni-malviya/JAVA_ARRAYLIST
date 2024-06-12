/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//..............Program for multidimentional arraylist......................
package Arraylist_concept;
import java.util.ArrayList;
public class MultiDimentional_ArrayList {
    public static void main(String[]args)
    {
        ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
        ArrayList<Integer> listt=new ArrayList<>();
        listt.add(1);
        listt.add(2);
        listt.add(3);
        listt.add(4);
        listt.add(5);
        mainlist.add(listt);
        
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(10);
        mainlist.add(list2);
        
        //print list
        for(int i=0;i<mainlist.size();i++)
        {
            ArrayList<Integer> currlist=mainlist.get(i);
            for(int j=0;j<currlist.size();j++)
            {
                System.out.print(currlist.get(j)+" ");
            }
            System.out.println();
        }
        System.out.println(mainlist);
    }
    
}
