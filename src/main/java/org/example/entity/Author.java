package org.example.entity;

import java.io.Serializable;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "author")
public class Author implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  Long id;

  @Column(name = "first_name")
  String firstName;

  @Column(name = "second_name")
  String secondName;
}