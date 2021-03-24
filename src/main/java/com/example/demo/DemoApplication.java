package com.example.demo;

import com.example.demo.mapper.AccountMapper;
import com.example.demo.modelapplying.ApplyingAccount;
import com.example.demo.modeldto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Collections;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

//	@Autowired
//	private AccountMapper accountMapper;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		AddressDTO addressDTO = AddressDTO.builder()
				.dateTo(LocalDate.now())
				.id(1)
				.careOf("careOf")
				.county("Ukraine")
				.build();

		CompanyDTO companyDTO = CompanyDTO.builder()
				.companyName("name")
				.id(1)
				.bankAccountNumber(234234242)
				.email("email@email.com")
				.addresses(Collections.singletonList(addressDTO))
				.build();

		PersonDTO personDTO = PersonDTO.builder()
				.addresses(Collections.singletonList(addressDTO))
				.contactStatus("status")
				.dateOfBirth(LocalDate.now().minus(20, ChronoUnit.YEARS))
				.build();

		CustomerDTO customerDTO = CustomerDTO.builder()
				.name("name")
				.id(1)
				.accounts(Arrays.asList(1,2,3,4,5))
				.addresses(Collections.singletonList(addressDTO))
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

//		ApplyingAccount applyingAccount = accountMapper.toApplying(accountDTO);

//		System.out.println(applyingAccount);

	}
}
