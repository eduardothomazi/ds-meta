package com.devsuperior.dsmeta.controllers;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.services.SaleService;
import com.devsuperior.dsmeta.services.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sales")
public class SaleController {
    @Autowired
    private SaleService saleService;
    @Autowired
    private SmsService smsService;

    @GetMapping
    private Page<Sale> findSales(@RequestParam(value = "minDate", defaultValue = "") String minDate,
                                 @RequestParam(value = "maxDate", defaultValue = "") String maxDate,
                                 Pageable pageable){

        return saleService.findSale(minDate, maxDate, pageable);
    }
    @GetMapping("/{id}/notification")
    public void notifySms(@PathVariable Long id){
        smsService.sendSms(id);
    }
}
