package main;

import model.Car;
import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingApp {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Sản phẩm 1", 10000);
        Product p2 = new Product(2, "Sản phẩm 2", 20000);
        Product p3 = new Product(3, "Sản phẩm 3", 30000);

        List<Product> productList = new ArrayList<>();

        productList.add(p1);
        productList.add(p2);
        productList.add(p3);

        Car c = new Car();

        c.setListProduct(productList);


        // Thông tin sản phẩm trong giỏ hàng
        for (Product p : productList){
            System.out.println(p.toString());
        }
        int total = 0;
        for (Product p : productList){
            total += p.getPrice();
        }

        System.out.println("Tổng giá trị giỏ hàng : " + total);


    }
}
