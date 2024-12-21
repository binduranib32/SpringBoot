package com.task.tasktest.repository;

import com.task.tasktest.model.TableA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableARepository extends JpaRepository<TableA, Long> {
}