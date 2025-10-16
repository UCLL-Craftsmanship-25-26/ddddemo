package be.ucll.craftmanship.DDDDemo.library.catalog.copies.commands;

import be.ucll.craftmanship.DDDDemo.library.catalog.copies.domain.BarCode;
import be.ucll.craftmanship.DDDDemo.library.catalog.books.domain.BookId;

public record RegisterBookCopyCommand(BookId bookId, BarCode barCode) {
}
