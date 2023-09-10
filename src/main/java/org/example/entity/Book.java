package org.example.entity;

import java.io.Serializable;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name = "book")
public class Book implements Serializable  {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "book_title")
  private String bookTitle;

  @Column(name = "author_id")
  private Long authorId;

  @Column(name = "customer_id")
  private Long customerId;

  @Column(name = "updated")
  private String updated;
}