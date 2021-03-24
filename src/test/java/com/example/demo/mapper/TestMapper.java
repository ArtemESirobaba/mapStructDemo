package com.example.demo.mapper;

import com.example.demo.modelapplying.ApplyingAccount;
import com.example.demo.modelapplying.ApplyingCustomer;
import com.example.demo.modelapplying.ApplyingPerson;
import com.example.demo.modeldto.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class TestMapper {

  @Autowired
  private AccountMapper accountMapper;

  @Test
  public void mapperTest(){
    AddressDTO addressDTO1 = AddressDTO.builder()
        .dateTo(LocalDate.now())
        .id(1)
        .careOf("careOf")
        .county("Ukraine")
        .build();

    AddressDTO addressDTO2 = AddressDTO.builder()
        .dateTo(LocalDate.now())
        .id(2)
        .careOf("other careOf")
        .county("UK")
        .build();

    CompanyDTO companyDTO = CompanyDTO.builder()
        .companyName("name")
        .id(1)
        .bankAccountNumber(234234242)
        .email("email@email.com")
        .addresses(Arrays.asList(addressDTO1, addressDTO2))
        .build();

    PersonDTO personDTO = PersonDTO.builder()
        .addresses(Collections.singletonList(addressDTO1))
        .contactStatus("status")
        .dateOfBirth(LocalDate.now().minus(20, ChronoUnit.YEARS))
        .build();

    CustomerDTO customerDTO = CustomerDTO.builder()
        .name("name")
        .id(1)
        .accounts(Arrays.asList(1, 2, 3, 4, 5))
        .addresses(Collections.singletonList(addressDTO1))
        .companies(Collections.singletonList(companyDTO))
        .persons(Collections.singletonList(personDTO))
        .build();

    AccountDTO accountDTO = AccountDTO.builder()
        .accountNumber("lkwersfjhwe949304wf")
        .customer(customerDTO)
        .applicationDate(LocalDate.now())
        .capitalBalance(BigDecimal.TEN)
        .department("department")
        .build();

    ApplyingAccount resultAccount = accountMapper.accountDTOToApplyingAccount(accountDTO);
    ApplyingCustomer resultCustomer = resultAccount.getApplyingCustomer();
    List<ApplyingPerson> resultPersons = resultCustomer.getPersons();


    Assertions.assertEquals(resultAccount.getAccountNumber(), accountDTO.getAccountNumber());
    Assertions.assertEquals(resultCustomer.getName(), customerDTO.getName());
    Assertions.assertEquals(resultCustomer.getApplyingAccounts().size(), customerDTO.getAccounts().size());
    Assertions.assertEquals(resultPersons.size(), customerDTO.getPersons().size());
    Assertions.assertEquals(resultPersons.get(0).getId(), personDTO.getId());
    Assertions.assertEquals(resultPersons.get(0).getId(), personDTO.getId());
    Assertions.assertEquals(resultPersons.get(0).getAddresses().size(), personDTO.getAddresses().size());
  }
}
