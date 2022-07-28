package com.artcruz.fraud.api.response;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
public class FraudCheckResponse {

    private final Boolean isFraudster;

    public FraudCheckResponse(Boolean isFraudster) {
        this.isFraudster = isFraudster;
    }

}
