package com.dev.prosolution.dblist.repositories;

import com.dev.prosolution.dblist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
