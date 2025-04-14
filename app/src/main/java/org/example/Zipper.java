package org.example;

import java.util.ArrayList;
import java.util.List;

public class Zipper {
    
    public static <T> List<T> zip(List<T> list1, List<T> list2){
        List<T> newlist = new ArrayList<>();
        int size1 = list1.size();
        int size2 = list2.size();
        int size = Math.min(size1, size2);

        for (int i = 0; i < size; i++){
            newlist.add(list1.get(i));
            newlist.add(list2.get(i));
        }

        return newlist;
    }

}
