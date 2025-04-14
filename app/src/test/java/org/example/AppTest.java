package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class AppTest {

    @Test 
    void ZipInt() {
        List<Integer> nums1 = List.of(1, 3, 5, 7, 9);
        List<Integer> nums2 = List.of(2, 4, 6, 8, 10);
        List<Integer> mergedNumbers = Zipper.zip(nums1, nums2);

        List<Integer> expected = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(expected, mergedNumbers);
    }

    @Test 
    void ZipString(){
        List<String> nums1 = List.of("Awesome", "lemon", "Paris", "France");
        List<String> nums2 = List.of("Apples", "Amazing", "Love", "Charle");
        List<String> mergedNumbers = Zipper.zip(nums1, nums2);
        
        List<String> expected = List.of("Awesome","Apples", "lemon", "Amazing", "Paris", "Love", "France", "Charle");
        assertEquals(expected, mergedNumbers);
    }
}
