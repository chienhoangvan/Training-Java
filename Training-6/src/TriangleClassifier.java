package com.company;

import static java.lang.Math.abs;

public class TriangleClassifier {

    public static int classifier(int a, int b, int c) {

        int tmp = 0;
        if(a <= 0 || b <= 0 || c <= 0)  tmp = 0;
        else if(a >=( b + c) || a <= abs(b - c))  tmp = 0;
        if(a > abs(b - c) && a < (b + c))  tmp = 1;
        if(tmp == 1 ) {
            if(a == b) {
                if( b == c) tmp = 3;
                else tmp = 2;
            } else if( a == c) {
                if( b == c) tmp = 3;
                else tmp = 2;
            } else if( b == c) {
                if( a == c) tmp = 3;
                else tmp = 2;
            }
        }
        return tmp;
    }
}
