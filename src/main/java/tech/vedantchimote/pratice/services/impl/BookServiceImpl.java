package tech.vedantchimote.pratice.services.impl;

import tech.vedantchimote.pratice.entities.Book;
import tech.vedantchimote.pratice.repositories.BookRep;
import tech.vedantchimote.pratice.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : Vedant Chimote
 * @mailto : vedantc.code@gmail.com
 * @created : 03-12-2022, Saturday
 **/

@Service
public class BookServiceImpl implements BookService {


    private BookRep bookRep;

    @Autowired
    public BookServiceImpl(BookRep bookRep) {
        this.bookRep = bookRep;
    }

    @Override
    public Book create(Book book) {
        return this.bookRep.save(book);
    }

    @Override
    public List<Book> getAll() {
        return this.bookRep.findAll();
    }

    @Override
    public Book get(int bookId) {
        return this.bookRep.findById(bookId).orElseThrow(() -> new RuntimeException("Book you are looking for not found on server !!"));
    }
}
