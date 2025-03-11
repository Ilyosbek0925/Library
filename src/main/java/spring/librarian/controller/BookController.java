package spring.librarian.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authorization.method.AuthorizeReturnObject;
import org.springframework.web.bind.annotation.*;
import spring.librarian.entity.Book;
import spring.librarian.entity.Users;
import spring.librarian.service.BookService;
import spring.librarian.service.LoginService;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/createBook")
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }

    @GetMapping("/findById/{id}")
    public Book findBookById(@PathVariable String id) {
        return bookService.findBookById(id);
    }

    @PutMapping("/updateBook")
    public Book updateBook(@RequestBody Book book) {
        return bookService.updateBook(book);
    }

    @GetMapping("/getAll")
    public List<Book> allBooks() {
        return bookService.findAllBooks();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBook(@PathVariable String id) {
        bookService.deleteBook(id);
    }


}
