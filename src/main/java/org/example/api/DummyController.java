package org.example.api;

import java.util.List;
import java.util.stream.Collectors;
import org.example.api.dao.DummyDao;
import org.example.domain.service.DummyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dummy")
public class DummyController {

  @Autowired private DummyRepository dummyRepository;

  @GetMapping
  public ResponseEntity<List<DummyDao>> getDummyEntity() {
    List<DummyDao> dummies = this.dummyRepository.findAll().stream().map(d -> new DummyDao(d.getId(), d.getName()))
        .toList();
    return ResponseEntity.ok(dummies);
  }
}
