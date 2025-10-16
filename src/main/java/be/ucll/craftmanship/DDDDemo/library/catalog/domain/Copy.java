package be.ucll.craftmanship.DDDDemo.library.catalog.domain;

import jakarta.persistence.*;

@Entity
public class Copy {
    @EmbeddedId
    private CopyId id;
    @Embedded
    private BarCode barCode;

    @Embedded
    @AttributeOverride(name = "id", column = @Column(name = "book_id"))
    private BookId book;

    protected Copy() {
        // for jpa
    }
}
