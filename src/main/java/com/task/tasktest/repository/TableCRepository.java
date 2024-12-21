package com.task.tasktest.repository;

import com.task.tasktest.model.TableC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableCRepository extends JpaRepository<TableC, Long> {
}
