package mngProduct;

public class Product {
    String id;
    String nameProduct;
    double price;
    int mount;

    public Product() {
    }

    public Product(String id, String nameProduct, double price, int mount) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
        this.mount = mount;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setMount(int mount) {
        this.mount = mount;
    }


    public String getNameProduct() {
        return nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getMount() {
        return mount;
    }

    public double getAmount() {
        double amount = 0.0;
        if (mount > 20) {
            amount = mount * price * 0.85;
        }else {
            amount = mount * price;
        }
        return amount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                ", mount=" + mount +
                ", amount=" + getAmount() +
                '}';
    }
}
