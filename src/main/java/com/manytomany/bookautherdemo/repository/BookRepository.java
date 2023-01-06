package com.manytomany.bookautherdemo.repository;

import com.manytomany.bookautherdemo.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<BookEntity,Long> {
}
