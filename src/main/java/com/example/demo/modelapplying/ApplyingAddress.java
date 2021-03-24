package com.example.demo.modelapplying;

import lombok.*;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApplyingAddress {
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
