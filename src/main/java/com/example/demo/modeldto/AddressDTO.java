package com.example.demo.modeldto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressDTO {

  private Integer id;
  private String name;
  private String careOf;
  private String street;
  private String district;
  private String town;
  private String county;
  private String postcode;
  private String countryCode;
  private boolean suppressCorrespondence;
  private LocalDate dateFrom;
  private LocalDate dateTo;

}
