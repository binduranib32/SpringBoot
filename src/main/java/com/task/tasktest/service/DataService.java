package com.task.tasktest.service;

import com.task.tasktest.model.TableA;
import com.task.tasktest.model.TableB;
import com.task.tasktest.model.TableC;
import com.task.tasktest.model.TableD;
import com.task.tasktest.repository.TableARepository;
import com.task.tasktest.repository.TableBRepository;
import com.task.tasktest.repository.TableCRepository;
import com.task.tasktest.repository.TableDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DataService {

    @Autowired
    private TableARepository tableARepository;

    @Autowired
    private TableBRepository tableBRepository;

    @Autowired
    private TableCRepository tableCRepository;

    @Autowired
    private TableDRepository tableDRepository;

    @Transactional
    public void saveData(String data) {

        TableA tableA = new TableA();
        tableA.setData(data);
        tableARepository.save(tableA);

        TableB tableB = new TableB();
        tableB.setData(data);
        tableBRepository.save(tableB);

        TableC tableC = new TableC();
        tableC.setData(data);
        tableCRepository.save(tableC);

        TableD tableD = new TableD();
        tableD.setData(data);
        tableDRepository.save(tableD);

    }
}
