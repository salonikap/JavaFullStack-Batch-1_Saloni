package com.verizon.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex3 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		//try with resource
		try(FileReader f=new FileReader("c:\\abc.txt");){
			
		}
		
	}
	}