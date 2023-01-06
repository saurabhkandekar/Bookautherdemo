package com.manytomany.bookautherdemo.controller;


import com.manytomany.bookautherdemo.model.BookResponce;
import com.manytomany.bookautherdemo.services.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    private final BookServices bookServices;

@Autowired
    public BookController(BookServices bookServices) {
        this.bookServices = bookServices;
    }
    @PostMapping(value ="/book")
    public ResponseEntity<BookResponce> createBook(@RequestBody )
}
