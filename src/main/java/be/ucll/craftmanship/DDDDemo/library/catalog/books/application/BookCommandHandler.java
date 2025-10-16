package be.ucll.craftmanship.DDDDemo.library.catalog.books.application;

import be.ucll.craftmanship.DDDDemo.library.catalog.books.commands.AddBookToCatalogCommand;
import be.ucll.craftmanship.DDDDemo.library.catalog.books.domain.Book;
import be.ucll.craftmanship.DDDDemo.library.catalog.books.infrastructure.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookCommandHandler {
    private final BookSearchService bookSearchService;
    private final BookRepository bookRepository;


    public BookCommandHandler(BookSearchService bookSearchService, BookRepository bookRepository) {
        this.bookSearchService = bookSearchService;
        this.bookRepository = bookRepository;
    }

    public Book handle(AddBookToCatalogCommand command) {
       BookInformation bookInformation = bookSearchService.search(command.isbn());
       var newBook = new Book(bookInformation.title(), command.isbn());
        return bookRepository.save(newBook);
    }
}
