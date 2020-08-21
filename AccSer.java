package com.demo.service;

import java.sql.SQLException;

import com.demo.model.Account;

public class AccSer implements AccountService {
	
	int balance;

	@Override
	public Long withdraw(int amount, Long accountNumber) throws SQLException {
		System.out.println("enter the amount to be withdrawn");
		balance -=amount;
		//int Amount=amount-withdrawAmount;
		System.out.println("The amount after withdrawn : ");
		return (long) balance;
	}

	@Override
	public Long deposit(int amount, Long accountNumber ) throws SQLException {
		System.out.println("enter the amount to be deposited");
		balance +=amount;
		System.out.println("The amount after deposition : ");
		return (long) balance;
		//amount = amount + depositedAmount; 
		//return (long) amount;
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
