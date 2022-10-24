package EX4;

import java.util.Scanner;

public class ProductSystem {
        private static ProductManager productManager;

        private static  Scanner scanner;

    public ProductSystem() {
        this.productManager = new ProductManager();
        this.scanner = new Scanner(System.in);
    }

    public static void menuProductManager() {
        do {
            System.out.println("MENU");
            System.out.println("1. Create a product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Display All Product");
            System.out.println("5. Search Product");
            System.out.println("6. Arrange Price Product Up");
            System.out.println("7. Arrange Price Product Down");
            System.out.println("8. Quit");
            System.out.println("Input a select: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productManager.addProduct(scanner);
                    break;
                case 2:
                    productManager.updateProductById(scanner);
                    break;
                case 3:
                    productManager.deleteProductById(scanner);
                    break;
                case 4:
                    productManager.displayProduct();
                    break;
                case 5:
                    productManager.searchProduct(scanner);
                    break;
                case 6:
                    productManager.arrangeUp();
                    break;
                case 7:
                    productManager.arrangeDown();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }
}
