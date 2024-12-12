package com.example.demo.service;

import com.example.demo.entity.Types;

import java.util.List;

public interface TypesService {

    Types getTypesById(Long id);

    void addTypes(Types types);

    void updateTypes(Types types);

    void deleteTypes(Long id);

    List<Types> getAllTypes();
}
