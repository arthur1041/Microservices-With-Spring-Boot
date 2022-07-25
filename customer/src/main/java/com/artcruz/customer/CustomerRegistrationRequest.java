package com.artcruz.customer;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomerRegistrationRequest {

    private String firstName;
    private String lastName;
    private String email;

}
