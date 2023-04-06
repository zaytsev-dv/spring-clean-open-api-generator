package com.example.architecture.application.presenter.impl;

import com.example.architecture.application.model.CategoryDto;
import com.example.architecture.application.presenter.CategoryPresenter;
import com.example.architecture.domain.Category;
import org.springframework.stereotype.Service;

@Service
public class CategoryPresenterImpl implements CategoryPresenter {
    @Override
    public CategoryDto toDto(Category category) {
        return new CategoryDto(category.getTitle());
    }
}
