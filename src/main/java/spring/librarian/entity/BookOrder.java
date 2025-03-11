package spring.librarian.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookOrder extends BaseEntity{
    private String bookName;
    private String bookAuthor;
    private int bookPrice;
    private int bookQuantity;

}
