package chungnd;

import mngProduct.Product;

import java.util.Comparator;
import java.util.List;

public class Bill {
    private List<Product> productList;

    public Bill(List<Product> productList) {
        this.productList = productList;
    }

    public Bill orderByAmount() {
        // sap xep
        productList.sort(Comparator.comparing(Product::getAmount));
        return this;
    }

    public Bill orderByMount(){
        productList.sort(Comparator.comparing(Product::getMount));
        return this;
    }
    public void orderByAmountDesc() {
        productList.sort(Comparator.comparing(Product::getAmount).reversed());
    }

    public void printBill() {
        double totalAmount = 0.0;
        for (Product product : productList) {
            System.out.println(product);
            totalAmount = totalAmount + product.getAmount();
        }
        System.out.println("-------------------------");
        System.out.println("Total amount = " + totalAmount);
    }
}
