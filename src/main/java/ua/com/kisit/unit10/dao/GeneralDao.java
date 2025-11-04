package ua.com.kisit.unit10.dao;

import java.util.List;

public interface GeneralDao<T> {

    List<T> getAll();
    T getById(Long id);
    void save(T t);
    void delete(Long id);
    void update(T t);
    void deleteAll();

}
