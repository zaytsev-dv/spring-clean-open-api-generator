package com.example.architecture.application.presenter;


import com.example.architecture.application.model.CategoryDto;
import com.example.architecture.domain.Category;

public interface CategoryPresenter {
    CategoryDto toDto(final Category category);
}
