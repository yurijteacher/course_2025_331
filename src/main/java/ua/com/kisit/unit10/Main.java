package ua.com.kisit.unit10;

import ua.com.kisit.unit10.config.ConnectionToDb;
import ua.com.kisit.unit10.entity.Category;
import ua.com.kisit.unit10.entity.Product;
import ua.com.kisit.unit10.repository.CategoryRepository;
import ua.com.kisit.unit10.repository.ProductRepository;

import java.math.BigDecimal;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ConnectionToDb connectionToDb = new ConnectionToDb();

        connectionToDb.getConnection("jdbc:mysql://localhost:3306/test_331_2025", "root", "root1234");

        CategoryRepository categoryRepository = new CategoryRepository();
        List<Category> categories = categoryRepository.getAll();

        for (Category category : categories) {
            System.out.println(category);
        }

        Category category = categoryRepository.getById(1L);
        System.out.println(category);

        Category category1 = new Category();
        category1.setId(1L);
        category1.setName("apple");
        category1.setDescription("description");
        category1.setImage("/static/apple.jpg");

//        categoryRepository.save(category1);


        System.out.println(categoryRepository.getById(1L));

        Category category2 = categoryRepository.getById(1L);
        category2.setName("car");
        category2.setDescription("description banana");

        categoryRepository.update(category2);

        for (Category category3 : categoryRepository.getAll()) {
            System.out.println(category3);
        }

//        categoryRepository.delete(1L);

        for (Category category3 : categoryRepository.getAll()) {
            System.out.println("after delete:" + category3);
        }

        ProductRepository productRepository = new ProductRepository();
        List<Product> products = productRepository.getAll();
        for (Product product : products) {
            System.out.println(product);
        }

        System.out.println(">>" + productRepository.getById(1L));

        Product product = new Product();
        product.setName("bmw-7000");
        product.setDescription("BMW 7000 description");
        product.setImage("/static/bmw.jpg");
        product.setPrice(new BigDecimal(7000000.45));
        product.setCategory(category1);

//        productRepository.save(product);

        List<Product> products2 = productRepository.getAll();

        for (Product product2 : products2) {
            System.out.println(product2);
        }

        Product product3 = productRepository.getById(2L);
        product3.setName("bmw-8000");
//        productRepository.update(product3);

        for (Product product2 : productRepository.getAll()) {
            System.out.println(product2);
        }

        productRepository.delete(2L);

        for (Product product2 : productRepository.getAll()) {
            System.out.println(">>>"+ product2);
        }

    }

}