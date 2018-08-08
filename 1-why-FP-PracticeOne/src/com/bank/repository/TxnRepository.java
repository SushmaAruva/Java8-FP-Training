package com.bank.repository;

import java.util.List;

import com.bank.model.Txn;

public interface TxnRepository {
	
	List<Txn> findAll();
	List<Txn> findByAmount(double amount);
	List<Txn> findByMinMaxAmt(double minAmount,double maxAmount);

}
