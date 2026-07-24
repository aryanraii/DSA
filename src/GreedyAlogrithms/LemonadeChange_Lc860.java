package GreedyAlogrithms;

import java.util.Arrays;

public class LemonadeChange_Lc860 {
    //Time complexity-->O(n)  space complexity-->O(n)
    public boolean lemonadeChange(int[] bills) {
        int n=bills.length;
        int five=0;
        int ten=0;
        for(int i=0;i<n;i++){
             if(bills[i]==5){
                 five++;
             }else if(bills[i]==10){
                 if(five!=0){
                     five-=1;
                     ten=ten+1;
                 }else{
                     return false;
                 }
             }else{
                 if(five!=0 && ten!=0){
                     ten-=1;
                     five-=1;
                 }else if(five>=3){
                     five-=3;
                 }else{
                     return false;
                 }
             }
        }
        return true;
    }
}
