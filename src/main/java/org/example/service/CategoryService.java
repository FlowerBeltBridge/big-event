package org.example.service;

import org.example.pojo.Category;

import java.util.List;

public interface CategoryService {
    //添加分类
    void add(Category category);

    List<Category> list();

    Category findById(Integer id);

    void update(Category category);
}
