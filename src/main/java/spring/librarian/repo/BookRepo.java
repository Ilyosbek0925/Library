package spring.librarian.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.librarian.entity.Book;

import java.util.UUID;
@Repository
public interface BookRepo extends JpaRepository<Book, UUID> {
}
