package com.demo.service;

import java.sql.SQLException;

import com.demo.model.Account;

public class AccSer implements AccountService {

	@Override
	public Long withdraw(int amount, Long accountNumber) throws SQLException {
		int withdrawAmount = 0;
		int Amount=amount-withdrawAmount;
		return null;
	}

	@Override
	public Long deposit(int amount, Long accountNumber) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createAccount(Account account) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deActivateAccount(Long accountNumber) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void activateAccount(Long accountNumber) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long transfer(Long fromAccount, Long toAccount, int amount) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	

}
