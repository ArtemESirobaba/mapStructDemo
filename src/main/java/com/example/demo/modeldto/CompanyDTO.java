package com.example.demo.modeldto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CompanyDTO {

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
  private List<AddressDTO> addresses = new ArrayList<>();

}
