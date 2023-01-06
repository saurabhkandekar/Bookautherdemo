package com.manytomany.bookautherdemo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long bookId;
    @Column(name = "book_Name")
    private String bookName;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "book_Author", joinColumns = {@JoinColumn(name = "book_Id")},
            inverseJoinColumns = {@JoinColumn(name = "author_Id")})
    private List<AuthorEntity> authorEntities;
}
