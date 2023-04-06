package com.example.architecture.application.usecase.beanunion;

import com.example.architecture.adapter.out.dao.CategoryDao;
import com.example.architecture.application.presenter.CategoryPresenter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class CategoryBeans {
    protected CategoryPresenter categoryPresenter;
    protected CategoryDao categoryDao;
}
