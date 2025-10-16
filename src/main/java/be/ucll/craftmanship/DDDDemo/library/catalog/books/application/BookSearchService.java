package be.ucll.craftmanship.DDDDemo.library.catalog.books.application;

import be.ucll.craftmanship.DDDDemo.library.catalog.books.domain.Isbn;

public interface BookSearchService {
    BookInformation search(Isbn isbn);
}
