package spring.librarian.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@MappedSuperclass
@Getter
@Setter


public class BaseEntity  {

    @GeneratedValue
    @Id
    protected UUID uuid;
    @CreationTimestamp
    LocalDateTime created;
    @UpdateTimestamp
    LocalDateTime modified;



}
