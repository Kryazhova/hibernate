package org.example.entity;

import java.io.Serializable;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "customer")
public class Customer implements Serializable {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;

  @Column(name = "first_name")
  String firstName;

  @Column(name = "second_name")
  String secondName;
}
