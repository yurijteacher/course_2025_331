package ua.com.kisit.unit10.repository;

import ua.com.kisit.unit10.dao.CustomerDao;
import ua.com.kisit.unit10.entity.Customer;

import java.util.List;

public class CustomerRepository implements CustomerDao {


    @Override
    public List<Customer> getAll() {
        return List.of();
    }

    @Override
    public Customer getById(Long id) {
        return null;
    }

    @Override
    public void save(Customer customer) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(Customer customer) {

    }

    @Override
    public void deleteAll() {

    }
}
