package com.example.demospringweb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demospringweb.dao.TransactionRepo;

@Service
public class TransactionService {
	@Autowired
	private TransactionRepo txnRepo;
	public List getTxn() {
		return txnRepo.findAll();
	}
}
