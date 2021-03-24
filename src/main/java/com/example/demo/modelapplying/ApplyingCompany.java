package com.example.demo.modelapplying;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApplyingCompany {

    private Integer id;
    private String email;
    private String companyName;
    private String natureOfBusiness;
    private String vatRegistrationNumber;
    private String registrationNumber;
    private Integer registrationCountry; // TODO link to country table
    private String websiteAddress;
    private String sortCode;
    private Integer bankAccountNumber;
    private String bankAccountName;
    private List<ApplyingAddress> addresses = new ArrayList<>();
}
