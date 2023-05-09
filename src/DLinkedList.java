/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmenttwo;

import java.util.LinkedList;

/**
 *
 * @author 22816
 */
class Node<T extends Comparable<T>> {
 T data;
 Node<T> prev;
 Node<T> next;
 Node(T d){ data=d; }

 
 }

public class DLinkedList<T extends Comparable> {
 Node head;

 public boolean isEmpty(){
 if(head==null)return true;
 return false;
 }
 
 public int length(){
 int count=0;
 Node temp=head;
 while(temp.next!=null){
 count++;
 temp=temp.next;
 }
 return count;
 } 

    @Override
    public String toString() {
    String str="";
    Node temp=head;
    while(temp!=null){
    str+=temp.data+" , ";
    temp=temp.next;
    } 
        return str;
    }
    
public Node find(T i){
Node temp=head;
    while(temp.next!=null){
        if(temp.data==i)return temp;
        temp=temp.next;
    }
    return null;
}

    public void Remove(T value) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.data == value) {
                break;}
                temp = temp.next;
            }
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;

    }


public void InsertInOrder(T i) {
Node newN = new Node(i);
    if(head==null){head=newN;}
    else{
    Node temp=head; Node temp2=head;
    while(temp!=null && temp.data.compareTo(newN.data)<0){temp2=temp;temp=temp.next;}
    if(temp==head){
        head.prev=newN;
        newN.next=head;
        head=newN;
    }
    else if(temp==null){
        temp2.next=newN;
        newN.prev=temp2;
    }
    else{
     newN.next=temp;
     temp2.next=newN;
    }
    }
}

public void reverse(){
 
    Node temp = null;
    Node current = head;
    while (current != null)
    {
        temp = current.next;
        current.next = current.prev;
        current.prev = temp;            
        
        if(current.prev==null)
            break;
        current = current.prev;
                
    }
head=current;    
}


public void addAll(DLinkedList i){
  Node temp = head;
     if(temp == null){
        temp=i.head;
     }
     if(temp.next == null){ 
         head.next = i.head;
     }
     while(temp.next != null){ 
         temp = temp.next;
     }
     temp.next = i.head;  

}
 
 
  
   
    
}
