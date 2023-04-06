/*
 * Copyright (zaytsev_dv)
 *  *|
 *  *|
 *  *|(•.•). i'm watching for you.....
 *  *|⊂ﾉ
 *  *|
 *  *|
 */

package com.example.architecture.domain;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "category")
@Getter
@Setter
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    public Category() {
    }

    //TODO: сделать конструктор с передачей пользователя
    public Category(String title) {
        this.title = title;
    }
}
