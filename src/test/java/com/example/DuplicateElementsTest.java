package com.example;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class DuplicateElementsTest {

    @Test
    public void DuplicateElementsTest1() {
        //Given
        List<Integer> l1 = new ArrayList<>(Arrays.asList(2,5,9,12));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(1,3,5,7,9));
        List<Integer> expected = new ArrayList<>(Arrays.asList(5,9));

        //When
        List<Integer> actual = DuplicateElements.numExistsInBothLists(l1, l2);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void DuplicateElementsTest2() {
        //Given
        List<Integer> l1 = new ArrayList<>(Arrays.asList(9,5,8,2,7));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(2,5,7,8,9));
        List<Integer> expected = new ArrayList<>(Arrays.asList(2,5,7,8,9));

        //When
        List<Integer> actual = DuplicateElements.numExistsInBothLists(l1, l2);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void DuplicateElementsTest3() {
        //Given
        List<Integer> l1 = new ArrayList<>(Arrays.asList(1,3,5,7,9));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(2,4,6,8,10));
        List<Integer> expected = new ArrayList<>();

        //When
        List<Integer> actual = DuplicateElements.numExistsInBothLists(l1, l2);

        //Then
        assertEquals(expected, actual);
    }
    
}
