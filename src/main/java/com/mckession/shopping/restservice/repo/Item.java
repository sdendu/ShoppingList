package com.mckession.shopping.restservice.repo;

import javax.persistence.*;

import lombok.Data;


@Data
@Entity
public class Item {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;
  private String name;
  private String description;
  private String category;
}
