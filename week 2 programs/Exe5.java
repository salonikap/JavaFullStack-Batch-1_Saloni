package com.verizon.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exe5 {

	public void show() throws FileNotFoundException,InterruptedException 
	{
		FileReader f=new FileReader("c:\\abc.txt");
		Thread.sleep(5000);
	}
	public static void main(String[] args)throws FileNotFoundException,InterruptedException{
		Exe5 el=new Exe5();
		el.show();
		System.out.println("done");
	}

}
