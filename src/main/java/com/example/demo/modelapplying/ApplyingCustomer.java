package com.example.demo.modelapplying;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApplyingCustomer {

  private Integer id;
  private  List<ApplyingPerson> persons = new ArrayList<>();
  private  List<ApplyingCompany> companies = new ArrayList<>();
  private  List<ApplyingAddress> addresses = new ArrayList<>();
  private  List<Integer> applyingAccounts = new ArrayList<>();
  private String name;

}
