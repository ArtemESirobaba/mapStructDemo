package com.example.demo.modeldto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PersonDTO {

  private Integer id;
  private String forename;
  private String surname;
  private String initials;
  private String middleNames;
  private String email;
  private String salutation;
  private LocalDate dateOfBirth;
  private String title;
  private LocalDate dateOfDeath;
  private LocalDate dateOfLongTermCare;
  private String taxIdentificationNumber;
  private String gender;
  private String nationality;
  private String countryOfBirthCode;
  private String maritalStatus;
  private String contactStatus;
  private String nationalInsuranceNumber;
  private String residentialStatus;
  private String employmentStatus;
  private String marketingPreferences;
  private String marketingTypeRestrictions;
  private boolean vulnerable;
  private String vulnerabilityComment;
  private List<AddressDTO> addresses = new ArrayList<>();

}

