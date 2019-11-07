package cox_p2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCounter {
	   
	public Map<String, Integer> wordCounter;
	Scanner scnr;
	  
	   public DuplicateCounter(){
	       wordCounter = new HashMap<String,Integer>();
	   }
	  
	   public void Count(String dataFile) throws FileNotFoundException {
		   try {
			   scnr = new Scanner(new File(dataFile));
		   }
		   catch(FileNotFoundException e) {
			   System.out.println(e.getMessage());
			   return;
			   
		   }
		   while(scnr.hasNext()) {
			   String input = scnr.next().toString();
			   Integer count = wordCounter.get(input);
			   
			   if(count == null) {
				  count = 1;
			   }
			   else {
				   count = count + 1;
			   }
			   wordCounter.put(input, count);
		   }
		   scnr.close();
	   }
	   public void Write(String outputFile) throws IOException {
		   try {
			   PrintWriter p = new PrintWriter(new File(outputFile));
			   for(String a: wordCounter.keySet()) {
				   p.println("'" + a + "'" + " occurs " + wordCounter.get(a) + " times.");
			   }
			   p.close();
		   }
		   catch(FileNotFoundException e) {
			   System.out.print(e.getMessage());;
		   }
		   System.out.print("unique_word_counts.txt has been written.");
	   }
}