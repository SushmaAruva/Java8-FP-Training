package com.bank;

import java.util.List;

import com.bank.model.Txn;
import com.bank.repository.JpaTxnRepository;
import com.bank.repository.TxnRepository;
import com.bank.service.TxnService;
import com.bank.service.TxnServiceIml;

public class App {

	public static void main(String[] args) {

		// init

		// AccountRepository accountRepository = new JdbcAccountRepository();
		// TxrService txrService = new TxrServiceImpl(accountRepository);
		TxnRepository txnRepository = new JpaTxnRepository();
		TxnService txnService = new TxnServiceIml(txnRepository);

		// use
		// ------------------------------------------------------------
		// txrService.txr(100, "1", "2");
		// System.out.println();
		// txrService.txr(200, "3", "4");
		// ------------------------------------------------------------

		List<Txn> txns1 = txnService.getTxns(1000);
		System.out.println("Find by Amount : "+txns1);

		List<Txn> txns2 = txnService.getTxns(1000, 2000);
		System.out.println("Find by Min and Max Amount : "+txns2);
		// destroy
		// ..

	}

}
