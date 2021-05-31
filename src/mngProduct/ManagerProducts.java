package mngProduct;
import java.util.Scanner;

public class ManagerProducts {
    public static void main(String[] args) {
        Product[] arrProduct = new Product[100];
        int n;

        try {
            Scanner objScn = new Scanner(System.in);
            System.out.print("Nhap so san pham: n = ");
            n = objScn.nextInt();

            //khoi tao object Danh sach san pham
            ProductList objProList = new ProductList();

            //goi phuong thuc input Product cua objProList de nhap thong tin San pham
            objProList.inputProduct(arrProduct, n);

            System.out.println("============================");
            //goi phuong thuc Display Product cua objProList de hien thi thong tin san pham
            objProList.displayProduct(arrProduct, n);

            System.out.println("============================");
            //goi phuong thuc hien thi thong tinh thanh tien cua san pham
            objProList.displayCalMoney(arrProduct, n);

            System.out.println("============================");
            //goi phuong thuc sap xep san pham theo chieu giam dan cua san pham
            objProList.BubbleSortProduct(arrProduct, n);
            //goi phuong thuc hien thi thong tin san pham sau khi da tinh thanh tien
            objProList.displayCalMoney(arrProduct, n);

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
