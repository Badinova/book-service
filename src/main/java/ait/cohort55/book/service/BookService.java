package ait.cohort55.book.service;

import ait.cohort55.book.dto.AuthorDto;
import ait.cohort55.book.dto.BookDto;

import java.awt.print.Book;

public interface BookService {
    void addBook(BookDto bookDto);

    BookDto findBookByIsbn(String isbn);

    BookDto deleteBookByIsbn(String isbn);

    BookDto updateBookTitle(String isbn, String title);

    Iterable<BookDto> findAllBooksByAuthor(String authorName);

    Iterable<BookDto> findAllBooksByPublisher(String publisherName);

    Iterable<AuthorDto> findBookAuthors(String isbn);

    Iterable<String> findPublisherByAuthor(String authorName);

    AuthorDto deleteAuthor(String authorName);

}
