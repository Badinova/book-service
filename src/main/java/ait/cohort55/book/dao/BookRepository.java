package ait.cohort55.book.dao;

import ait.cohort55.book.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.stream.Stream;

public interface BookRepository extends JpaRepository<Book, String> {
//    @Query("select b from Book b join b.authors a where lower(a.name) = lower(:author)")
//    Stream<Book> findAllBooksByAuthorsIgnoreCase(@Param("author") String name);
//

//    @Query("select b from Book b where lower(b.publisher.publisherName) = lower(:publisher)")
//    Stream<Book> findAllBooksByPublisherIgnoreCase(@Param("publisher") String publisher);

    Stream<Book> findBookByAuthorsNameIgnoreCase(String authorsName);

    Stream<Book> findBookByPublisherPublisherName(String publisherName);
    void deleteBookByAuthorsNameIgnoreCase(String authorsName);
}
