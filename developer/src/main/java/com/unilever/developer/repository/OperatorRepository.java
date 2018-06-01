package com.unilever.developer.repository;

import com.unilever.developer.domain.Operator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperatorRepository extends JpaRepository<Operator,Long> {
}
