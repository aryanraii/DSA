package Array;

import java.util.ArrayList;
import java.util.List;

public class DesignHashSet_Lc705 {
    List[]bucket;
    int m;
    int getIndex(int key){
        return key%10;
    }
    boolean search(int idx,int key){
        List<Integer>list=bucket[idx];
        for(int ele:list){
            if(ele==key)return true;
        }
        return false;
    }
    public void MyHashSet() {
        bucket=new List[10];
        m=15000;
        for(int i=0; i<10; i++){
            bucket[i]=new ArrayList<>();
        }
    }

    public void add(int key) {
        int idx=getIndex(key);
        if(!search(idx,key)){
            bucket[idx].add(key);
        }
    }

    public void remove(int key) {
        int idx=getIndex(key);
        if(search(idx,key)){
            bucket[idx].remove(Integer.valueOf(key));
        }
    }

    public boolean contains(int key) {
        int idx=getIndex(key);
        return search(idx,key);
    }

    // Boolean []mark;
    // public MyHashSet() {
    //     mark=new Boolean[1000001];
    //     Arrays.fill(mark,false);
    // }

    // public void add(int key) {
    //     mark[key]=true;
    // }

    // public void remove(int key) {
    //     mark[key]=false;
    // }

    // public boolean contains(int key) {
    //     return mark[key];
    // }
}
