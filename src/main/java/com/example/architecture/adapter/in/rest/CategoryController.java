/*
 * Copyright (zaytsev_dv)
 *  *|
 *  *|
 *  *|(•.•). i'm watching for you.....
 *  *|⊂ﾉ
 *  *|
 *  *|
 */

package com.example.architecture.adapter.in.rest;

import com.example.architecture.application.model.CategoryDto;
import com.example.architecture.application.usecase.CategoryUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CategoryController {
    private final CategoryUseCase categoryUseCase;

    @GetMapping("/{id}")
    public ResponseEntity<CategoryDto> getCategory(@PathVariable int id) {
        return ResponseEntity.ok(categoryUseCase.getById(id));
    }
}
