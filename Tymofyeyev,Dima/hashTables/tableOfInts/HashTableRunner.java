package tableOfInts;


import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

import static java.lang.System.*;

public class HashTableRunner
{
  public static void main ( String[] args ) throws FileNotFoundException{
	  HashTable test = new HashTable(new File("H:\\workspace\\src\\hashTables\\tableOfInts\\numbers.dat"));
	  System.out.println(test);
		
  }
}