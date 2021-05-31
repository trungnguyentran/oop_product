package mngProduct;
import java.util.Scanner;

public class ProductList {
    public void inputProduct(Product[] arrProduct, int n) {
        try{
            for (int i=0; i< n; i++) {
                Scanner objScn = new Scanner(System.in);
                //khoi tao obj Product thu i
                arrProduct[i] = new Product();
                System.out.print("Ma san pham: ");
                arrProduct[i].setId(objScn.nextLine());

                System.out.print("Name san pham: ");
                arrProduct[i].setNameProduct(objScn.nextLine());

                System.out.print("Gia ban: ");
                arrProduct[i].setPrice(objScn.nextDouble());

                System.out.print("So luong: ");
                arrProduct[i].setMount(objScn.nextInt());
            }

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    public void displayProduct(Product[] arrProduct, int n) {
        for (int i=0; i<n; i++) {
            System.out.print("Ma San pham: " + arrProduct[i].getId());
            System.out.print("\nTen san pham: " + arrProduct[i].getNameProduct());
            System.out.print("\nGia ban: " + arrProduct[i].getPrice());
            System.out.print("\nSo luong: " + arrProduct[i].getMount() + "\n");
        }
    }

    private double calMoney (double price,
                             int mount,
                             int mountMax,
                             double phanTram) {
        double result = 0.0;
        if (mount >= mountMax) {
            result = price * mount * phanTram;
        } else {
            result = price * mount;
        }

        return result;
    }

    public void displayCalMoney(Product[] arrProduct, int n) {
        for (int i=0; i<n; i++) {
            System.out.println(arrProduct[i].getId());
            System.out.println(arrProduct[i].getNameProduct());
            double money = calMoney(arrProduct[i].getPrice(),
                                    arrProduct[i].getMount(),
                                    20,
                                    0.15);
            System.out.println("Thanh tien: " + money + "\n");
        }
    }

    public void BubbleSortProduct (Product[] arrProduct, int n) {
        for (int j=0; j<n; j++) {
            for (int i=n-1; i>j; i--) {
                double moneyCurrent = calMoney(arrProduct[i].getPrice(),
                                        arrProduct[i].getMount(),
                                        20,
                                        0.15);

                double moneyPrev = calMoney(arrProduct[i-1].getPrice(),
                                            arrProduct[i-1].getMount(),
                                        20,
                                        0.15);

                if (moneyCurrent > moneyPrev) {
                    Product temp = arrProduct[i];
                    arrProduct[i] = arrProduct[i-1];
                    arrProduct[i-1] = temp;
                }
            }
        }
    }
}
