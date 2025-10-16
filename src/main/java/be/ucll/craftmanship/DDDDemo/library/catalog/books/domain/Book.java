package be.ucll.craftmanship.DDDDemo.library.catalog.books.domain;


import jakarta.persistence.*;
import org.springframework.util.Assert;

@Entity
public class Book {
    @EmbeddedId
    private BookId id;

    private String title;

    @Embedded
    @AttributeOverride(name = "value", column = @Column(name = "isbn"))
    private Isbn isbn;

    public Book( String title, Isbn isbn) {
        Assert.notNull(title, "title must not be null");
        Assert.notNull(isbn, "isbn must not be null");
        this.id = new BookId();
        this.title = title;
        this.isbn = isbn;
    }

    protected Book() {
    }
}
