package com.bank.service;

import java.time.LocalDate;
import java.util.List;

import org.apache.log4j.Logger;

import com.bank.model.Txn;
import com.bank.repository.TxnRepository;

public class TxnServiceIml implements TxnService {

	private static Logger logger = Logger.getLogger("bank");
	private TxnRepository txnRepository;

	public TxnServiceIml(TxnRepository txnRepository) {
		super();
		this.txnRepository = txnRepository;
		logger.info("TxnServiceIml instance created");
	}
	
	@Override
	public List<Txn> getTxns(double amount) {
		logger.info("Find based on amount");
		return txnRepository.findByAmount(amount);
	}

	@Override
	public List<Txn> getTxns(double minAmount, double maxAmount) {
		logger.info("Find based on min and max amount");
		return txnRepository.findByMinMaxAmt(minAmount, maxAmount);
	}

	@Override
	public List<Txn> getTxns(LocalDate date) {
		return null;
	}

	@Override
	public List<Txn> getTxns(LocalDate from, LocalDate to) {
		return null;
	}

}
