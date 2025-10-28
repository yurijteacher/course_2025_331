package ua.com.kisit.unit9.association.one_to_many.v1;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Category category = new Category();
        category.setId(1L);
        category.setName("car");
        category.setDescription("car description");
        category.setImage("/static/1.jpg");

        Product product = new Product();
        product.setId(1L);
        product.setName("BMW-7");
        product.setDescription("car description ..");
        product.setPrice(new BigDecimal(100000000));
        product.setCategory(category);


        Product product2 = new Product();
        product2.setId(2L);
        product2.setName("BMW-5");
        product2.setDescription("car description ..");
        product2.setPrice(new BigDecimal(200000000));
        product2.setCategory(category);


        List<Product> products = new ArrayList<>();
        category.setProductList(products);

        System.out.println(product);
        System.out.println(product2);

    }

}
