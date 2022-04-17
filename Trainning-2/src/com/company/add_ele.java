package com.company;

public class add_ele {
    public void add_ele(int[] a, int n, int k, int j ) {
        for(int i = n; i > j; i--){
            a[i] = a[i-1];
        }
        a[j] = k;
        for(int i = 0; i <= n; i++){
            System.out.println(a[i] + ", ");
        }
    }
}
