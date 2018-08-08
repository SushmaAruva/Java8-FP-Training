package com.bank.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.bank.model.Txn;

public interface TxnService {
	
	public  List<Txn> getTxns(double amount);
	public  List<Txn> getTxns(double minAmount,double maxAmount);
	public  List<Txn> getTxns(LocalDate date);
	public  List<Txn> getTxns(LocalDate from,LocalDate to);
	public  List<Txn> getTxns(LocalDateTime from, double amount);

}
