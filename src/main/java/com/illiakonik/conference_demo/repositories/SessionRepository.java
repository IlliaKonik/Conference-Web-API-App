package com.illiakonik.conference_demo.repositories;

import com.illiakonik.conference_demo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
