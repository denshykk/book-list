package com.denshyk.book_list.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(notes = "The unique id of the book")
    private Long id;

    @Column(name = "title")
    @ApiModelProperty(notes = "The book's title")
    private String title;

    @Column(name = "author")
    @ApiModelProperty(notes = "The book's author")
    private String author;
}