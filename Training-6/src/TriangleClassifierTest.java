package com.company;

import static org.junit.jupiter.api.Assertions.*;


//Creat testcase with JUnit
class TriangleClassifierTest {

    @org.junit.jupiter.api.Test
    void testTriangleClassifier() {
        int a = -1, b = 3, c = 2;
        int expected = 0;

        int result = TriangleClassifier.classifier(a,b,c);
        assertEquals(result, expected);
    }

    @org.junit.jupiter.api.Test
    void testTriangleClassifier1() {
        int a = 3, b = 2, c = 4;
        int expected = 1;

        int result = TriangleClassifier.classifier(a,b,c);
        assertEquals(result, expected);
    }
    @org.junit.jupiter.api.Test
    void testTriangleClassifier2() {
        int a = 3, b = 3, c = 2;
        int expected = 2;

        int result = TriangleClassifier.classifier(a,b,c);
        assertEquals(result, expected);
    }
    @org.junit.jupiter.api.Test
    void testTriangleClassifier3() {
        int a = 3, b = 3, c = 3;
        int expected = 3;

        int result = TriangleClassifier.classifier(a,b,c);
        assertEquals(result, expected);
    }
}