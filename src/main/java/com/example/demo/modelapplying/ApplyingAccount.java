package com.example.demo.modelapplying;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDate;

@ToString(callSuper = true)
@SuperBuilder(toBuilder = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApplyingAccount {

  private Integer id;
  private ApplyingCustomer applyingCustomer;
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
