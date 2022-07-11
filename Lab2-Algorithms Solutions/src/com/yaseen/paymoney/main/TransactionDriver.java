package com.yaseen.paymoney.main;
import java.util.Scanner;

import com.yaseen.paymoney.services.Transaction;

public class TransactionDriver 
{

	public static void main(String[] args)
	{


		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the size of transaction array");

		int size = sc.nextInt();

		int arr[]=new int[size];

		// array of elements
		System.out.println("Enter the values of array");

		for (int i = 0; i < size; i++)

			arr[i] = sc.nextInt();

		System.out.println("Enter the total no of targets that needs to be achieved");

		int targetNo = sc.nextInt();

		//creating objects of transaction class
		Transaction  transaction=new Transaction();

		//calling method of transaction class by using object of transaction class
		transaction.checkTransaction(arr, targetNo);

		// close connection otherwise it will give warning
		sc.close();


	}

}
