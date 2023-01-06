package com.manytomany.bookautherdemo.mapper;

import com.manytomany.bookautherdemo.entity.BookEntity;
import com.manytomany.bookautherdemo.model.BookRequest;
import com.manytomany.bookautherdemo.model.BookResponce;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookMapper {

    public BookEntity modelToEntity(BookRequest bookRequest);
    public BookRequest entityToModel(BookResponce bookResponce);
    public
}
