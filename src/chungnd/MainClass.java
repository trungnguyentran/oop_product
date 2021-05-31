package chungnd;

import mngProduct.Product;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        Product product1 = new Product("sp1","Laptop",234,3);
        Product product2 = new Product("sp2","Desktop",135,20);
        Product product3 = new Product("sp3","Phone",124,21);
        Product product4 = new Product("sp4","Pen",10,40);
        Product product5 = new Product("sp5","Book",100,30);

        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);

        Bill bill1 = new Bill(productList);
        bill1.orderByAmount().printBill();

        Bill bill2 = new Bill(productList);
        bill2.orderByAmountDesc();
        bill2.printBill();

        Bill bill3 = new Bill(productList);
        bill3.orderByMount().printBill();
    }
}
