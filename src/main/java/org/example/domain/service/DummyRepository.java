package org.example.domain.service;

import org.example.domain.DummyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DummyRepository extends JpaRepository<DummyEntity, Long> {

}
