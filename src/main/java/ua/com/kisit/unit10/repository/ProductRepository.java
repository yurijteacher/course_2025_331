package ua.com.kisit.unit10.repository;

import ua.com.kisit.unit10.config.ConnectionToDb;
import ua.com.kisit.unit10.dao.ProductDao;
import ua.com.kisit.unit10.entity.Product;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository extends ConnectionToDb implements ProductDao {

    Connection connection;

    private final CategoryRepository categoryRepository;

    public ProductRepository() {
        this.categoryRepository = new CategoryRepository();
        this.connection = getConnection("jdbc:mysql://localhost:3306/test_331_2025", "root", "root1234");
    }

    @Override
    public List<Product> getAll() {

        List<Product> products = new ArrayList<>();

        PreparedStatement preparedStatement = null;

        ResultSet resultSet = null;

        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM `product`");
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Product product = new Product();
                product.setId(resultSet.getLong("id"));
                product.setName(resultSet.getString("name"));
                product.setDescription(resultSet.getString("description"));
                product.setImage(resultSet.getString("image"));
                product.setPrice(resultSet.getBigDecimal("price"));
                product.setCategory(categoryRepository.getById(resultSet.getLong("category_id")));

                products.add(product);
            }

            resultSet.close();
            preparedStatement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {}
            }
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {}
            }
        }


        return products;
    }

    @Override
    public Product getById(Long id) {

        Product product = new  Product();

        PreparedStatement preparedStatement = null;

        ResultSet resultSet = null;

        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM `product` WHERE id = ?");
            preparedStatement.setLong(1, id);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                product.setId(resultSet.getLong("id"));
                product.setName(resultSet.getString("name"));
                product.setDescription(resultSet.getString("description"));
                product.setImage(resultSet.getString("image"));
                product.setPrice(resultSet.getBigDecimal("price"));
                product.setCategory(categoryRepository.getById(resultSet.getLong("category_id")));

            }

            resultSet.close();
            preparedStatement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {}
            }
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {}
            }
        }


        return product;
    }

    @Override
    public void save(Product product) {
        PreparedStatement preparedStatement = null;

        String sql = "INSERT INTO `product` (`name`, `price`, `description`, `image`, `category_id`) VALUES (?, ?, ?, ?, ?)";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setBigDecimal(2, product.getPrice());
            preparedStatement.setString(3, product.getDescription());
            preparedStatement.setString(4, product.getImage());
            preparedStatement.setLong(5, product.getCategory().getId());
            preparedStatement.execute();

            preparedStatement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
             if (preparedStatement != null) {
                 try {
                     preparedStatement.close();
                 } catch (SQLException e) {
                     e.printStackTrace();
                 }
             }
        }

    }

    @Override
    public void delete(Long id) {
        PreparedStatement preparedStatement = null;
        String sql = "DELETE FROM `product` WHERE id = ?";


        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {}
            }
        }
    }

    @Override
    public void update(Product product) {
        PreparedStatement preparedStatement = null;

        String sql = "UPDATE `product` SET `name` = ?, `price` = ?, `description` = ?, `image` = ?, `category_id` = ? WHERE `id` = ?";

        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, product.getName());
            preparedStatement.setBigDecimal(2, product.getPrice());
            preparedStatement.setString(3, product.getDescription());
            preparedStatement.setString(4, product.getImage());
            preparedStatement.setLong(5, product.getCategory().getId());
            preparedStatement.setLong(6, product.getId());
            preparedStatement.execute();

            preparedStatement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void deleteAll() {
        PreparedStatement preparedStatement = null;
        String sql = "DELETE FROM `product`";
        
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {}
            }
        }
    }
}
