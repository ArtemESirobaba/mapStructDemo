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
public class CustomerDTO {
  private Integer id;
  private List<PersonDTO> persons = new ArrayList<>();
  private List<CompanyDTO> companies = new ArrayList<>();
  private List<AddressDTO> addresses = new ArrayList<>();
  private List<Integer> accounts = new ArrayList<>();
  private String name;
}

