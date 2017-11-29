package com.blue.boot.service;

import com.blue.boot.domain.Girl;
import com.blue.boot.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GirlService {
    @Autowired
    GirlRepository girlRepository;

    public Girl get(Integer id){
        return girlRepository.findOne(id);
    }
}
