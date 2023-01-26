package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 *
 */
public class DuplicateElements 
{
    public static void main( String[] args )
    {
        List<Integer> arrListOne = new ArrayList<>(Arrays.asList(1,3,6,9,11));
        List<Integer> arrListTwo = new ArrayList<>(Arrays.asList(1,4,9,12));
        System.out.println(numExistsInBothLists(arrListOne, arrListTwo));
    }

    public static ArrayList<Integer> numExistsInBothLists(List<Integer> l1, List<Integer> l2) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < l1.size(); i++) {
            for (int j = 0; j < l2.size(); j++) {
                if (l1.get(i).equals(l2.get(j))) {
                    result.add(l1.get(i));
                }
            }
        }
        Collections.sort(result);
        return result;
    }
}

//1 list: 1,3,6,9,11
//2 list: 1,4,9,12
