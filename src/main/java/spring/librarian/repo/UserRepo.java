package spring.librarian.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.librarian.entity.Users;

import java.util.Optional;
import java.util.UUID;
@Repository
public interface UserRepo extends JpaRepository<Users, UUID> {
    Optional<Users> findByUsername(String username);
}
