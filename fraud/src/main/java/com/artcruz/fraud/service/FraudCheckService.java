package com.artcruz.fraud.service;

import com.artcruz.fraud.model.entity.FraudCheckHistory;
import com.artcruz.fraud.model.repository.FraudCheckHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class FraudCheckService  {

    @Autowired
    private FraudCheckHistoryRepository fraudCheckHistoryRepository;


    public boolean isFraudulentCustomer(Integer customerId) {
        fraudCheckHistoryRepository.save(
                FraudCheckHistory.builder()
                        .customerId(customerId)
                        .isFraudster(false)
                        .createdAt(LocalDateTime.now())
                        .build()
        );

        return false;
    }


}
