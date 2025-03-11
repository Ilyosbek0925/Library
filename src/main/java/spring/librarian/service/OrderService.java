package spring.librarian.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.librarian.entity.BookOrder;
import spring.librarian.repo.BookRepo;
import spring.librarian.repo.OrderRepo;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Service
public class OrderService {

    @Autowired
    OrderRepo orderRepo;


public BookOrder createOrder(BookOrder order) {
  return orderRepo.save(order);
}

public BookOrder findOrderById(String id) {
    return orderRepo.findById(UUID.fromString(id)).orElse(null);
}

public BookOrder updateOrder( BookOrder order) {
    return orderRepo.save(order);
}

public void deleteOrder(String uuid) {
    orderRepo.deleteById(UUID.fromString(uuid));
}

public List<BookOrder> findAllOrders() {
    return orderRepo.findAll();
}


}
