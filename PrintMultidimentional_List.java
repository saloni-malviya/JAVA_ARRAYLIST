/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//...........Program to print arraylist in following manner........................
//                          [1,2,3,4,5]
//                          [2,4,6,8,10]
//                          [3,6,9,12,15]
package Arraylist_concept;
import java.util.ArrayList;
public class PrintMultidimentional_List {
    public static void main(String[]args)
    {
        ArrayList<ArrayList<Integer>> mainL=new ArrayList<>();
        ArrayList<Integer> listtt =new ArrayList<>();
        ArrayList<Integer> listtt2=new ArrayList<>();
        ArrayList<Integer> listtt3=new ArrayList<>();
        
        for(int i=1;i<=5;i++)
        {
            listtt.add(i*1);
            listtt2.add(i*2);
            listtt3.add(i*3);
        }
        mainL.add(listtt);
        mainL.add(listtt2);
        mainL.add(listtt3);
        System.out.println(mainL);
        
        //print
        for(int i=0;i<mainL.size();i++)
        {
            ArrayList<Integer> curlist=mainL.get(i);
            for(int j=0;j<curlist.size();j++)
            {
                System.out.print(curlist.get(j)+" ");
            }
            System.out.println();
        }
    }
}
