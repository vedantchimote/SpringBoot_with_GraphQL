package tech.vedantchimote.pratice.repositories;

import tech.vedantchimote.pratice.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Vedant Chimote
 * @mailto : vedantc.code@gmail.com
 * @created : 03-12-2022, Saturday
 **/
public interface BookRep extends JpaRepository<Book, Integer> {
}
