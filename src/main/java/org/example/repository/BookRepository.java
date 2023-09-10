package org.example.repository;

import java.util.List;

import org.example.entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;

import static org.example.config.LibraryDatabaseConfiguration.*;

public class BookRepository {

    Session session;

    public BookRepository() {
        session = getSession();
    }

    public List<Book> findAll() {
        final String hql = """
                SELECT b FROM Book b
                """;

        return session.createQuery(hql, Book.class)
                .getResultList();
    }

    public void deleteAll() {
        final String hql = """
                DELETE FROM book
                """;

    Transaction tr = session.beginTransaction();
    session.createNativeQuery(hql, Book.class)
        .executeUpdate();
    tr.commit();
  }

    public void insertBook() {
        final String hql = """
                INSERT INTO book
                (book_title, author_id)
                VALUES('Кладбище', 2)
                """;

    Transaction tr = session.beginTransaction();
    session.createNativeQuery(hql, Book.class)
        .executeUpdate();
    tr.commit();
  }
}
