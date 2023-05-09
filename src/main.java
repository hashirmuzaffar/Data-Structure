/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmenttwo;

/**
 *
 * @author BABAR
 */
public class main {
 public static void main(String[] args){
     DLinkedList<Integer> LL = new DLinkedList<Integer>();
  
     
     LL.InsertInOrder(2);
     LL.InsertInOrder(3);
     LL.InsertInOrder(13);
     LL.InsertInOrder(6);
     LL.InsertInOrder(8);
     LL.InsertInOrder(4);
     System.out.println(LL);
     //LL.Remove(3);
    LL.reverse();
    System.out.print(LL);
     
 }
 
}
