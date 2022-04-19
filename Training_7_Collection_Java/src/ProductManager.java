package com.company;
import java.util.*;

public class ProductManager  {
    Scanner sc = new Scanner(System.in);
    ArrayList<Product> list = new ArrayList<>();

    public ProductManager() {

    }
    //Method add product
    public void addProduct(Product prd){
        list.add(prd);
    }
    //Method fix Product with id
    public void fixProductWithId() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id san pham can sua: ");
        int id = sc.nextInt();
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getId() == id) {
                System.out.println("Sua thong tin san pham: " );
                System.out.println("Ten: " );
                list.get(i).setName(sc.next());
                System.out.println("Gia: " );
                list.get(i).setPrice(sc.nextInt());
            }
        }
        System.out.println(list);
    }

        //Method delete Product with id
    public void deleteProductWithId() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id san pham can xoa: ");
        int id = sc.nextInt();
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getId() == id) {
                list.remove(i);
            }
        }
        System.out.println("Danh sach sau khi xoa phan tu la: ");
        System.out.println(list);
    }

//
//    public void deleteProduct(Product prd) {
//        if()
//    }
}
