package com.example.demo.modelapplying;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Data
@ToString(callSuper = true)
@SuperBuilder(toBuilder = true)
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
