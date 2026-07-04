package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Element implements Comparable<Element>{
    char ch;
    int freq;
    public Element(char ch, int freq) {
        this.ch = ch;
        this.freq = freq;
    }
    @Override
    public int compareTo(Element that) {
        return that.freq - this.freq;// decreasing order
    }
}
//Time complexity-->O(N+klogk) space complexity-->O(N+K)
public class SortCharactersByFrequency_Lc451 {
    public String frequencySort(String s) {
       HashMap<Character,Integer> map = new HashMap<>();
       for(char ch: s.toCharArray()){
           map.put(ch,map.getOrDefault(ch,0)+1);
       }
       PriorityQueue<Element> pq = new PriorityQueue<>();
       for(Map.Entry<Character,Integer> entry: map.entrySet()){
           Element element=new Element(entry.getKey(),entry.getValue());
           pq.add(element);
       }
       //genrate result
        StringBuilder sb = new StringBuilder();
        while(pq.size()>0){
            Element element = pq.poll();
            while(element.freq>0){
                sb.append(element.ch);
                element.freq--;
            }
        }
        return sb.toString();
    }
}
