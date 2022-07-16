package com.devsuperior.dsmeta.services;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    private SaleRepository repository;

    public List<Sale> findSale(){
        return repository.findAll();
    }

    public SaleService(SaleRepository repository) {
        this.repository = repository;
    }
}
