package com.manytomany.bookautherdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BookRequest {
    private String bookName;
    private List<AuthorRequest> authorEntity;
}
