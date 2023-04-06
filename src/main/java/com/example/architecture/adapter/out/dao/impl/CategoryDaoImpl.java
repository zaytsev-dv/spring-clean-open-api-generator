package com.example.architecture.adapter.out.dao.impl;

import com.example.architecture.adapter.out.dao.CategoryDao;
import com.example.architecture.adapter.out.repository.CategoryRepository;
import com.example.architecture.domain.Category;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CategoryDaoImpl implements CategoryDao {
    private final CategoryRepository categoryRepository;

    public final Category getById(final int id) {
        return categoryRepository.getReferenceById((long) id);
    }
}
