package com.diconium.codingdojo;

import com.diconium.codingdojo.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution toTest = new Solution();

    @Test
    void test1() {
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1}
        };
        int i = toTest.maximumWealth(accounts);
        assertEquals(6, i);
    }

    @Test
    void test2() {
        int[][] accounts = {
                {1, 5},
                {7, 3},
                {3, 5}
        };
        int i = toTest.maximumWealth(accounts);
        assertEquals(10, i);
    }

    @Test
    void test3() {
        int[][] accounts = {
                {2, 8, 7},
                {7, 1, 3},
                {1, 9, 5}
        };
        int i = toTest.maximumWealth(accounts);
        assertEquals(17, i);
    }

    @Test
    void test4() {
        int[][] accounts = {
                {1, 2, 3},
                {4, 5, 6, 9},
                {7},
        };
        int i = toTest.maximumWealth(accounts);
        assertEquals(24,i);
    }

}