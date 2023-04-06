package com.example.architecture.application.usecase;


import com.example.architecture.application.model.CategoryDto;

public interface CategoryUseCase {
    CategoryDto getById(final int id);
}
