package com.manytomany.bookautherdemo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "author")
public class AuthorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long authorId;
    @Column(name = "first_Name")
    private String firstName;

    @ManyToMany(mappedBy = "authorEntities")
    private List<BookEntity> bookEntities;

}
