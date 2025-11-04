package ua.com.kisit.unit10.repository;

import ua.com.kisit.unit10.dao.ProductHasOrderDao;
import ua.com.kisit.unit10.entity.ProductHasOrder;

import java.util.List;

public class ProductHasOrderRepository implements ProductHasOrderDao {

    @Override
    public List<ProductHasOrder> getAll() {
        return List.of();
    }

    @Override
    public ProductHasOrder getById(Long id) {
        return null;
    }

    @Override
    public void save(ProductHasOrder productHasOrder) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(ProductHasOrder productHasOrder) {

    }

    @Override
    public void deleteAll() {

    }
}
