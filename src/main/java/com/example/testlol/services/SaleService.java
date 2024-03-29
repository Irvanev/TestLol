package com.example.testlol.services;
import com.example.testlol.dtos.SaleDto;

import java.util.List;
import java.util.Optional;

public interface SaleService {
    SaleDto register(SaleDto sale);
    Optional<SaleDto> getSaleById(Long id);
    List<SaleDto> getAllSales();
    void delete(Long id);
    SaleDto update(SaleDto sale);
    List<SaleDto> findSaleByCarId(Long id);
    List<SaleDto> findSaleByCustomerId(Long id);
    List<SaleDto> findSalesByCarBrandAndYear(String brand, String date);
}
