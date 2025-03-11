package spring.librarian.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty("bookName")
    private String bookName;
    @JsonProperty("bookAuthor")
    private String bookAuthor;
    @JsonProperty("bookPrice")
    private int bookPrice;
    @JsonProperty("bookQuantity")
    private int bookQuantity;

}
