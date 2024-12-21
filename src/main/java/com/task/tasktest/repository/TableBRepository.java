package com.task.tasktest.repository;

import com.task.tasktest.model.TableB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableBRepository extends JpaRepository<TableB, Long> {
}
