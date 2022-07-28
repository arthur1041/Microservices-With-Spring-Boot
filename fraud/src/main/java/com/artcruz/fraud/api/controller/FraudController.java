package com.artcruz.fraud.api.controller;

import com.artcruz.fraud.api.response.FraudCheckResponse;
import com.artcruz.fraud.service.FraudCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/fraud-check")
public class FraudController {

    @Autowired
    private FraudCheckService fraudCheckService;

    @GetMapping(path = "{customerId}")
    public FraudCheckResponse isFraudster(@PathVariable("customerId") Integer customerID ) {
        return new FraudCheckResponse(fraudCheckService.isFraudulentCustomer(customerID));
    }

}
