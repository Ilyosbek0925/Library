package spring.librarian.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import spring.librarian.entity.BookOrder;

import java.util.UUID;
@Repository
public interface OrderRepo extends JpaRepository<BookOrder, UUID> {
}
