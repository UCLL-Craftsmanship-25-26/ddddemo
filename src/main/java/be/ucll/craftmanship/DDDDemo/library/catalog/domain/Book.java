package be.ucll.craftmanship.DDDDemo.library.catalog.domain;

import jakarta.persistence.*;

@Entity
public class Book {

    @EmbeddedId
    private BookId id;
    private String title;
    @Embedded
    @AttributeOverride(name = "value", column = @Column(name = "isbn"))
    private Isbn isbn;

    protected Book(){
        //for jpa
    }

}
