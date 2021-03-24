package com.example.demo.mapper;


import com.example.demo.modelapplying.ApplyingCompany;
import com.example.demo.modelapplying.ApplyingCustomer;
import com.example.demo.modeldto.CompanyDTO;
import com.example.demo.modeldto.CustomerDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper extends DtoMapper<CustomerDTO, ApplyingCustomer> {

  @Override
  ApplyingCustomer toApplying(CustomerDTO dto);

  @Override
  List<ApplyingCustomer> toApplying(List<CustomerDTO> dto);

  default CustomerDTO fromId (Integer id) {
    if (id == null) {
      return null;
    }
    CustomerDTO customer = new CustomerDTO();
    customer.setId(id);
    return customer;
  }
}
