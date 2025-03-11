package spring.librarian.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.librarian.entity.Book;
import spring.librarian.entity.BookOrder;
import spring.librarian.service.BookService;
import spring.librarian.service.OrderService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("/createBook")
    public BookOrder createBook(@RequestBody BookOrder order) {
        return orderService.createOrder(order);
    }

    @GetMapping("/findById/{id}")
    public BookOrder findBookById(@PathVariable String id) {
        return orderService.findOrderById(id);
    }

    @PutMapping("/updateBook")
    public BookOrder updateBook(@RequestBody BookOrder order) {
        return orderService.updateOrder(order);
    }

    @GetMapping("/getAll")
    public List<BookOrder> allBooks() {
        return orderService.findAllOrders();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBook(@PathVariable String id) {
        orderService.deleteOrder(id);
    }




}
