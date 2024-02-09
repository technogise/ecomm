package org.example.api.dao;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class DummyDao {

  private Long id;
  private String name;

  public DummyDao(Long id, String name) {
    this.id = id;
    this.name = name;
  }
}
