package com.example.demo.mapper;

import com.example.demo.modelapplying.ApplyingCompany;
import com.example.demo.modeldto.CompanyDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring",
  uses = AddressMapper.class)
public interface CompanyMapper {

  ApplyingCompany companyDTOToApplyingCompany(CompanyDTO dto);

  List<ApplyingCompany> companyDTOToApplyingCompany(List<CompanyDTO> dto);

}
