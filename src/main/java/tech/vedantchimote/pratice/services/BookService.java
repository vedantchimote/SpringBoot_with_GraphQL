package tech.vedantchimote.pratice.services;

import tech.vedantchimote.pratice.entities.Book;

import java.util.List;

/**
 * @author : Vedant Chimote
 * @mailto : vedantc.code@gmail.com
 * @created : 03-12-2022, Saturday
 **/

public interface BookService {

    //create
    Book create(Book book);

    //get all
    List<Book> getAll();

    //get single book
    Book get(int bookId);

}
