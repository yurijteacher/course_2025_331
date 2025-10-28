package ua.com.kisit.lab5;

import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Roles role1 = new Roles(1L, "Admin");
        Roles role2 = new Roles(2L, "User");

        Roles role3 = new Roles();
        role3.setId(3L);
        role3.setName("Manager");

        Users user = new Users();
        user.setId(1L);
        user.setUsername("Vasya");
        user.setPassword("1234");

        Set<Roles> roles = new HashSet<>();
        roles.add(role1);
        roles.add(role2);
        user.setRoles(roles);

        System.out.println(roles);
        System.out.println(user);

        Customers customer = new Customers();
        customer.setId(1L);
        customer.setFirstName("Vasya");
        customer.setLastName("Pypkin");
        customer.setPhone("51323");
        customer.setEmail("va@ukr.net");
        customer.setUser(user);
        System.out.println(customer);


        Categories category = new Categories();
        category.setId(1L);
        category.setName("car");
        category.setDescription("car description");
        category.setImages("/images/car.jpg");


        Categories category2 = new Categories();
        category2.setId(2L);
        category2.setName("beer");
        category2.setDescription("beer description");
        category2.setImages("/images/beer.jpg");

        Products product = new Products();
        product.setId(1L);
        product.setDescription("car description");
        product.setName("BMW 7");
        product.setPrice(new BigDecimal(1000000));
        product.setImage("/images/bmw7.jpg");
        product.setCategory(category);

        Products product2 = new Products();
        product2.setId(2L);
        product2.setDescription("car description");
        product2.setName("BMW 5");
        product2.setPrice(new BigDecimal(1200000));
        product2.setImage("/images/bmw5.jpg");
        product2.setCategory(category);

        List<Products> productsList = new ArrayList<>();
        productsList.add(product);
        productsList.add(product2);

        category.setProducts(productsList);

        System.out.println(category);

        System.out.println(productsList);
        System.out.println(product);
        System.out.println(product2);

        Products product3 = new Products();
        product3.setId(3L);
        product3.setName("Beer1");
        product3.setDescription("beer description");
        product3.setPrice(new BigDecimal(10));
        product3.setImage("/images/beer.jpg");
        product3.setCategory(category2);

        productsList.add(product3);


        productsList
                .stream()
                .filter(e->e.getCategory().getName().equals("beer"))
                .forEach(e-> System.out.println(e));


        Orders order =new Orders();
        order.setId(1L);
        order.setDateCreated(new Date());
        order.setCustomer(customer);
        order.setDelivery(new Delivery(1L, "Nova Pr"));
        order.setPayment(new Payment(1L, "Cash"));

        ProductsHasOrders productHasOrder = new ProductsHasOrders();
        productHasOrder.setId(1L);
        productHasOrder.setOrder(order);
        productHasOrder.setProduct(product);
        productHasOrder.setQuantity(1);

        ProductsHasOrders productHasOrder2 = new ProductsHasOrders();
        productHasOrder2.setId(2L);
        productHasOrder2.setOrder(order);
        productHasOrder2.setProduct(product3);
        productHasOrder2.setQuantity(4);

        List<ProductsHasOrders> productsHasOrdersList = new ArrayList<>();
        productsHasOrdersList.add(productHasOrder);
        productsHasOrdersList.add(productHasOrder2);

        System.out.println(productsHasOrdersList);

    }


}
