package spring.librarian.service;

import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.persister.entity.SingleTableEntityPersister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import spring.librarian.entity.Book;
import spring.librarian.repo.BookRepo;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Service
public class BookService {
@Autowired
    BookRepo bookRepo;
public Book createBook(Book book) {
bookRepo.save(book);
return book;
}

public Book findBookById(@PathVariable String id) {
    return bookRepo.findById(UUID.fromString(id)).orElse(null);

}

public List<Book> findAllBooks() {
    return bookRepo.findAll();
}

public Book updateBook( Book book) {

        return bookRepo.save(book);

}

public void deleteBook(@PathVariable String id) {
    bookRepo.deleteById(UUID.fromString(id));
}






}
