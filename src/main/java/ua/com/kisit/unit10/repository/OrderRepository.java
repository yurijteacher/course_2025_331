package ua.com.kisit.unit10.repository;

import ua.com.kisit.unit10.dao.OrderDao;
import ua.com.kisit.unit10.entity.Order;

import java.util.List;

public class OrderRepository implements OrderDao {

    @Override
    public List<Order> getAll() {
        return List.of();
    }

    @Override
    public Order getById(Long id) {
        return null;
    }

    @Override
    public void save(Order order) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(Order order) {

    }

    @Override
    public void deleteAll() {

    }
}
