package com.example.demo.mapper;

import com.example.demo.modelapplying.ApplyingAddress;
import com.example.demo.modelapplying.ApplyingCompany;
import com.example.demo.modeldto.AddressDTO;
import com.example.demo.modeldto.CompanyDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CompanyMapper extends DtoMapper<CompanyDTO, ApplyingCompany> {
  @Override
  ApplyingCompany toApplying(CompanyDTO dto);

  @Override
  List<ApplyingCompany> toApplying(List<CompanyDTO> dto);

  default CompanyDTO fromId (Integer id) {
    if (id == null) {
      return null;
    }
    CompanyDTO company = new CompanyDTO();
    company.setId(id);
    return company;
  }
}
