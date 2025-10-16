package be.ucll.craftmanship.DDDDemo.library.catalog.books.infrastructure;

import be.ucll.craftmanship.DDDDemo.library.catalog.books.domain.Book;
import be.ucll.craftmanship.DDDDemo.library.catalog.books.domain.BookId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, BookId> {
}
