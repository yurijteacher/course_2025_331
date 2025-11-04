package ua.com.kisit.unit10.repository;

import ua.com.kisit.unit10.config.ConnectionToDb;
import ua.com.kisit.unit10.dao.CategoryDao;
import ua.com.kisit.unit10.entity.Category;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

public class CategoryRepository extends ConnectionToDb implements CategoryDao {

    private Connection connection;

    // Statement (sql (values))
    // PreparedStatement
    // CallableStatement


    public CategoryRepository() {
        this.connection = getConnection("jdbc:mysql://localhost:3306/test_331_2025", "root", "root1234");
    }

    @Override
    public List<Category> getAll() {
        return List.of();
    }

    @Override
    public Category getById(Long id) {
        return null;
    }

    @Override
    public void save(Category category) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(Category category) {

    }

    @Override
    public void deleteAll() {

    }
}
