package com.example.demo.service.impl;

import com.example.demo.entity.Types;
import com.example.demo.mapper.TypesMapper;
import com.example.demo.service.TypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypesServiceImpl implements TypesService {

    @Autowired
    private TypesMapper typesMapper;

    @Override
    public Types getTypesById(Long id) {
        return typesMapper.selectById(id);
    }

    @Override
    public void addTypes(Types types) {
        typesMapper.insert(types);
    }

    @Override
    public void updateTypes(Types types) {
        typesMapper.update(types);
    }

    @Override
    public void deleteTypes(Long id) {
        typesMapper.deleteById(id);
    }

    @Override
    public List<Types> getAllTypes() {
        return typesMapper.selectAll();
    }
}
