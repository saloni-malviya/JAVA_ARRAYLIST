/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//...........Print ArrayList using Loop................
package Arraylist_concept;
import java.util.ArrayList;

public class Print_ArrayList {
    public static void main(String[]args)
    {
        ArrayList<Integer> ll=new ArrayList<>();
        ll.add(2);
        ll.add(1);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        
        for(int i=0;i<ll.size();i++)
        {
            System.out.print(ll.get(i)+" ");
        }
        System.out.println();
    }
    
}
