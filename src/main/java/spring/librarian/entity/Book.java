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
public class Book extends BaseEntity {
    @JsonProperty(value = "title")
    private String title;
    @JsonProperty(value = "author")
    private String author;

    @JsonProperty(value = "publisher")
    private String publisher;

}
