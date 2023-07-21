package com.debjani.Debjani.service;

import com.debjani.Debjani.entity.Employee;
import com.debjani.Debjani.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class EmpService {
    @Autowired
    private EmpRepo repo;

    public void addEmp(Employee e) {
        repo.save(e);
    }

    public List<Employee> getAllEmp() {
        return repo.findAll();
    }

    public Employee getEmpById(int id) {
        Optional<Employee> e = repo.findById(id);
        return e.orElse(null);
    }
    public void delete(int id) {
        repo.deleteById(id);
    }
}