package com.example.demospringweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demospringweb.entity.TransactionEntity;
import com.example.demospringweb.services.TransactionService;
@Controller
public class TransactionController {

		@Autowired
		private TransactionService txnService;
		
		@GetMapping("/Trans")
		public String listOfTransaction() {
			List<TransactionEntity> listOfTxn= txnService.getTxn();
			for(TransactionEntity txn:listOfTxn) {
				System.out.println(txn);
			}
			return "home";
		}
}
