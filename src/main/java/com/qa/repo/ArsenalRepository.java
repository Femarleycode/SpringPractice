package com.qa.repo;

import com.qa.domain.Arsenal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArsenalRepository extends JpaRepository<Arsenal, Long> {

}