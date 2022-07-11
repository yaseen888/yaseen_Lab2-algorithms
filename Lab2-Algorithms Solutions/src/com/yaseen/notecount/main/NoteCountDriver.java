package com.yaseen.notecount.main;

import java.util.Scanner;

import com.yaseen.notecount.services.MergeSortImplementation;

import com.yaseen.notecount.services.NotesCount;

public class NoteCountDriver {

	public static void main(String[] args) {

		MergeSortImplementation mergesort= new MergeSortImplementation();
		NotesCount notecount = new NotesCount();

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the size of currency denomination");
		int size = sc.nextInt();
		int[] notes = new int[size];

		System.out.println("Enter the currency denominations value");
		for (int i = 0; i < size; i++) 
		{
			notes[i] = sc.nextInt();

		}
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();

		//calling method of merge sort implementation class
		mergesort.sort(notes,0,notes.length-1);

		//calling method of Notes count class
		notecount.notesCountImplementation(notes,amount);

		//close connection otherwise it will give warning
		sc.close();

	}

}
