package com.company;
import java.util.*;

public class Delete {
    public Delete() {

    }
    public void Delete(int[] a, int x, int n) {
        int index = 0 ;
        for(int i = 0; i < n; i++){
            if(a[i] == x) {
                index = i;
                break;
            }
        }
        System.out.println(index);
        for(int j = index; j < n; j++ ) {
            a[j] = a[j +1];
        }


        for(int i = 0; i < n -1 ; i++) {
            System.out.println(a[i] + ", ");
        }
    }
}

