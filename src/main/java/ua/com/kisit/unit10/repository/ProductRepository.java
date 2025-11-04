package ua.com.kisit.unit10.repository;

import ua.com.kisit.unit10.dao.ProductDao;
import ua.com.kisit.unit10.entity.Product;

import java.util.List;

public class ProductRepository implements ProductDao {


    @Override
    public List<Product> getAll() {
        return List.of();
    }

    @Override
    public Product getById(Long id) {
        return null;
    }

    @Override
    public void save(Product product) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void deleteAll() {

    }
}
