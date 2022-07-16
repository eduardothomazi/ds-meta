package com.devsuperior.dsmeta.controllers;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.services.SaleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sales")
public class SaleController {

    private SaleService service;

    @GetMapping
    private ResponseEntity<List<Sale>> findSales(){
        List<Sale> saleList = service.findSale();
        return ResponseEntity.ok().body(saleList);
    }

    public SaleController(SaleService service) {
        this.service = service;
    }
}
