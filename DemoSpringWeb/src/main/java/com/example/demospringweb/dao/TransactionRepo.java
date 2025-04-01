package com.example.demospringweb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demospringweb.entity.TransactionEntity;

@Repository
public interface TransactionRepo extends JpaRepository<TransactionEntity,Integer>{
	

}
