package com.unilever.developer.repository;

import com.unilever.developer.domain.Cards;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardsRepository extends JpaRepository<Cards,Long> {
}
