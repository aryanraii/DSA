package Array;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeaders_GFG {
    ///  Time complexity-->O(N) and Space complexity-->O(N);
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        list.add(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=list.get(list.size()-1)){
                list.add(arr[i]);
            }
        }
        Collections.reverse(list);
        return list;
    }

}
