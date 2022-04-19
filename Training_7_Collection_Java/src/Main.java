package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Product prd1 = new Product("Vay", 1, 3000);
        Product prd2 = new Product("Quan", 2, 4000);
        Product prd3 = new Product("Ao", 3, 5000);

        ProductManager prm = new ProductManager();
        prm.addProduct(prd1);
        prm.addProduct(prd2);
        prm.addProduct(prd3);

        System.out.println(prm.list);

        prm.fixProductWithId();

        prm.deleteProductWithId();
        //Testing hashMap
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap vao danh sach ten va tuoi: ");
//        Map<String, Integer> hashMap = new HashMap<>();
//        for(int i = 0; i < 5; i++) {
//            hashMap.put(sc.next(), sc.nextInt());
//        }
//        System.out.println("Hien thi danh sach: ");
//        System.out.println(hashMap + "\n");

    //Testing treeMap
//        Map<String, Integer> treeMap = new TreeMap<>();
//        System.out.println("Display entries in ascending order of key");
//        treeMap = hashMap;
//        System.out.println(treeMap);

    }
}
