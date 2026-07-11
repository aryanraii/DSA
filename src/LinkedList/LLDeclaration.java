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
    void removeAtTail(){
        if(head==null){
            System.out.println("List is empty");
        }
        if(head.next==null){
            head=tail=null;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
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
    void removeElement(int ele){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.data==ele){
            head=head.next;
            size--;
            return;
        }
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            if(temp.data==ele){
                prev.next=temp.next;
                size--;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
    }
    void insertBeforeValue(int ele,int key){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.data==ele){
            addAtHead(key);
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            if(temp.next.data==ele){
                Node newNode=new Node(key);
                newNode.next=temp.next;
                temp.next=newNode;
                size++;
                break;
            }
            temp=temp.next;
        }
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
        ll.Display();
        System.out.println(ll.size);
        ll.removeAtTail();
        ll.Display();
        System.out.println(ll.size);
        ll.removeElement(20);
        ll.Display();
        System.out.println(ll.size);
        ll.removeElement(10);
        ll.Display();
        System.out.println(ll.size);
        ll.insertBeforeValue(40,35);
        ll.Display();
    }
}
