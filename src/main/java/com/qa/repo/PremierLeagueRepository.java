package com.qa.repo;

import com.qa.domain.PremierLeague;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PremierLeagueRepository extends JpaRepository<PremierLeague, Long> {
}
