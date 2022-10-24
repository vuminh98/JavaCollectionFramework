package EX4;

import EX3.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManager {
    private final ArrayList<Product> products;

    public ProductManager() {
        products = new ArrayList<>();
    }

    public void addProduct(Scanner scanner) {
        System.out.println("Input a ID: ");
        String id = scanner.nextLine();
        System.out.println("Input a name: ");
        String name = scanner.nextLine();
        System.out.println("Input a price: ");
        int price = Integer.parseInt(scanner.nextLine());
        products.add(new Product(id, name, price));
    }

    public void updateProductById(Scanner scanner) {
        System.out.println("Input ID to update: ");
        String id = scanner.nextLine();
        for (Product product : products) {
            if (product != null) {
                if (id.equals(product.getId())) {
                    System.out.println("Input new name: ");
                    String name = scanner.nextLine();
                    System.out.println("Input new price: ");
                    int price = Integer.parseInt(scanner.nextLine());
                    product.setName(name);
                    product.setPrice(price);
                }
            }
        }
        System.out.println("Update success!");
    }

    public void deleteProductById(Scanner scanner) {
        System.out.println("Input ID to delete: ");
        String id = scanner.nextLine();
        Product p = null;
        for (Product product : products) {
            if (id.equals(product.getId())) {
                p = product;
            }
        }
        products.remove(p);
        System.out.println("Delete success!");
    }

    public void displayProduct() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void arrangeUp() {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
        displayProduct();
    }

    public void arrangeDown() {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });
        displayProduct();
    }

    public void searchProduct(Scanner scanner) {
        System.out.println("Input a name product: ");
        String name = scanner.nextLine();
        for (Product product : products) {
            if (name.equals(product.getName())) {
                System.out.println("Product found: ");
                System.out.println(product);
                break;
            }
        }
    }
}

