package com.hotmart.empresa.service;

import com.hotmart.empresa.model.Departamento;
import com.hotmart.empresa.repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartamentoService {

    @Autowired
    private DepartamentoRepository departamentoRepository;

    public List<Departamento> departamentos = new ArrayList<>();

}

