package LinkedList;

import java.util.LinkedList;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LL{
    Node head;
    Node tail;
    int size;
    int searchInLL(int key){
        if(head==null) return -1;
        int idx=0;
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){
                return idx;
            }
            idx++;
            temp=temp.next;
        }
        return -1;
    }
    void addAtTail(int key){
        Node temp=new Node(key);
        if(head==null){
            head=tail=temp;
        }
        else{
            tail.next=temp;
            tail=temp;
        }
        size++;
    }
    void addAtHead(int key){
        Node temp=new Node(key);
        if(head==null){
            head=tail=temp;
        }
        else{
            temp.next=head;
            head=temp;
        }
        size++;
    }
    void removeAtHead(){
        if(head==null){
            System.out.println("List is empty");
        }
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
    }
    void Display(){
        if(head==null)return;
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void insert(int idx,int key){
        if(idx<0||idx>size){
            System.out.println("Index out of bounds");
        }else if(idx==0){
            addAtHead(key);
        }else if(idx==size){
            addAtTail(key);
        }else{
            Node temp=head;
            for(int i=1; i<idx; i++){
                temp=temp.next;
            }
            Node t=new Node(key);
            t.next=temp.next;
            temp.next=t;
            size++;
        }
    }
    int get(int idx){
        if(idx<0||idx>size){
            System.out.println("Index out of bounds");
        }
        Node temp=head;
        for(int i=1; i<idx; i++){
            temp=head.next;
        }
        return temp.data;
    }
    void delete(int idx){
        if(idx<0||idx>size){
            System.out.println("Index out of bounds");
            return;
        }
        if(idx==0){
            removeAtHead();
            return;
        }
        Node temp=head;
        for(int i=1; i<idx; i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;//delete
        if(idx==size-1){
            tail=temp;
        }
        size--;
    }

}
public class LLDeclaration {
    public static void main(String[] args) {
        LL ll=new LL();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40);
        ll.addAtTail(50);
        ll.Display();
        System.out.println(ll.searchInLL(20));
        System.out.println(ll.searchInLL(30));
        ll.insert(5,20);
        ll.Display();
        ll.delete(5);
        ll.Display();
        System.out.println(ll.tail.data);
    }
}
