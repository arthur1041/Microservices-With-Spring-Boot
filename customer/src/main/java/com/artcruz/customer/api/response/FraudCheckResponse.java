package com.artcruz.customer.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FraudCheckResponse {

    @Accessors(fluent = true)
    @JsonProperty("fraudster")
    private Boolean isFraudster;

}
