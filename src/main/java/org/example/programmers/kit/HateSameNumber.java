package org.example.programmers.kit;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class HateSameNumber {
    public int[] solution(int[] arr) {
        List<Integer> arrayList = new ArrayList<>();

        arrayList.add(arr[0]);

        for(int i=1; i<arr.length; i++){
            if(arrayList.get(arrayList.size()-1) == arr[i]){

            }else{
                arrayList.add(arr[i]);
            }
        }

        return arrayList.stream().mapToInt(Integer::intValue).toArray();
    }
}
