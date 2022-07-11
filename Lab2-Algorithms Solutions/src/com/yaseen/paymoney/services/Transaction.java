package com.yaseen.paymoney.services;

import java.util.Scanner;

public class Transaction
{
	public void checkTransaction(int[] arr, int targetNo) 
	{

		Scanner sc=new Scanner(System.in);

		while(targetNo-- != 0) 
		{
			int flag=0;

			int target;

			System.out.println("Enter the value of target");

			target=sc.nextInt();

			int sum=0;

			for (int i = 0; i < arr.length; i++ ) //linear iteration, linear searching
			{
				sum += arr[i]; //sum=sum+arr[i] //0+20=20+12=32

				if (sum >= target)
				{
					System.out.println("Target achieved after " +(i + 1)+" transactions \n");

					flag=1;

					break;
				}
			}

			if(flag == 0)
			{
				System.out.println("Given target is not achieved");

			}
		} 
		sc.close();
	}

}
