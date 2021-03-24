package com.example.demo.modeldto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountDTO {

  private Integer id;
  private CustomerDTO customer;
  private Integer productId;
  private String accountNumber;
  private String legacyAccountNumber;
  private String status;
  private LocalDate closureDate;
  private BigDecimal advanceGranted;
  private String bankSortCode;
  private String bankAccountNumber;
  private String department;
  private LocalDate inceptionDate;
  private LocalDate reversionDate;
  private String paymentMethod;
  private String regulatedStatus;
  private BigDecimal contractualMonthlyInstalment;
  private BigDecimal totalFeeAddedToLoan;
  private BigDecimal lastInstalmentAmount;
  private LocalDate lastInstalmentDate;
  private LocalDate annualStatementDate;
  private LocalDate applicationDate;
  private BigDecimal contractMargin;
  private LocalDate lastInterestApplicationDate;
  private LocalDate lastStatementDate;
  private LocalDate loanTermEndDate;
  private LocalDate nextInterestApplicationDate;
  private LocalDate nextInstalmentDate;
  private Integer preferredPaymentDay;
  private BigDecimal memorandumRate;

  private BigDecimal arrearsBalance;
  private BigDecimal capitalBalance;
  private BigDecimal nonInterestBearingFeesBalance;
  private BigDecimal feesBalance;

  private BigDecimal originalLoanAmount;

}

