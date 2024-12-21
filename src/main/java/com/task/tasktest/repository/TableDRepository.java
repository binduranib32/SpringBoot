package com.task.tasktest.repository;


import com.task.tasktest.model.TableD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableDRepository extends JpaRepository<TableD, Long> {
}
