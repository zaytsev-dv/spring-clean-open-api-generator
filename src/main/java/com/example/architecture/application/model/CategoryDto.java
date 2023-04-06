/*
 * Copyright (zaytsev_dv)
 *  *|
 *  *|
 *  *|(•.•). i'm watching for you.....
 *  *|⊂ﾉ
 *  *|
 *  *|
 */

package com.example.architecture.application.model;


import lombok.Setter;

@Setter
public class CategoryDto {
    private Long id;

    private String title;

    public CategoryDto() {
    }

    public CategoryDto(String title) {
        this.title = title;
    }
}
