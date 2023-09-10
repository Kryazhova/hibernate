package org.example;


import org.example.repository.BookRepository;
import org.junit.jupiter.api.Test;

public class TestDataBase {

  BookRepository bookRepository = new BookRepository();


  @Test
  public void testRepository() {
    bookRepository.insertBook();
    bookRepository.insertBook();
    System.out.println(bookRepository.findAll());

    bookRepository.deleteAll();
    System.out.println(bookRepository.findAll());

    bookRepository.insertBook();
    System.out.println(bookRepository.findAll());
  }
}
