package com.example.architecture.application.usecase.impl;

import com.example.architecture.application.model.CategoryDto;
import com.example.architecture.application.usecase.CategoryUseCase;
import com.example.architecture.application.usecase.beanunion.CategoryBeans;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CategoryUseCaseImpl extends CategoryBeans implements CategoryUseCase {

    @Override
    public CategoryDto getById(int id) {
        return super.categoryPresenter.toDto(super.categoryDao.getById(id));
    }
}
