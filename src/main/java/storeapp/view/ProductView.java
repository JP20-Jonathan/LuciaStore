package storeapp.view;

import storeapp.domain.Category;
import storeapp.domain.Product;
import storeapp.services.StateSelector;

import java.util.Scanner;

public class ProductView {

    Scanner scanner = new Scanner(System.in);
    StateSelector stateSelector = new StateSelector();
    Category category = new Category();


    public Product createProduct(Product product){
        System.out.println("Creating product...");
        System.out.println("Ingrese el id del priducto");
        int id = scanner.nextInt();
        scanner.nextLine();
        product.setIdProduct(id);
        System.out.println("Ingrese el nombre del producto");
        String name = scanner.nextLine();
        product.setDescription(name);
        System.out.println("Ingrese el precio del producto");
        double price = scanner.nextDouble();
        product.setPrice(price);
        System.out.println("Ingrese la cantidad del producto");
        int stock = scanner.nextInt();
        product.setStock(stock);
        System.out.println("INgrese el estado del producto");
        boolean status = stateSelector.ProductState();
        product.setState(status);
        System.out.println("Ingrese el id de la categoria del producto");
        product.setCategory(category);

        return product;
    }



}
