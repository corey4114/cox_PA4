package cox_p1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class DuplicateRemover {
	
	   public Set<String> uniqueWords;
	   Scanner scnr;
	   String word;
	   
	   public DuplicateRemover() {
		   uniqueWords = new HashSet<String>();
	   }
	   
	   public void Remove(String dataFile) throws FileNotFoundException {    
	       scnr = new Scanner(new File(dataFile));
	       while(scnr.hasNext()) {
	           word = scnr.next();
	           uniqueWords.add(word);
	       }
	       scnr.close();	      
	   }	
	   
	   public void Write(String outputFile) throws IOException {
		   File a;
		   FileWriter f = null;
		   a = new File(outputFile);		
		   try {
			   f = new FileWriter(a);
			   Iterator<String> it = uniqueWords.iterator();

			   while(it.hasNext()) {
				   String tmp = (String)it.next();
				   f.write(tmp + "\n");     
			   }
			   f.close();
		   }
		   catch(FileNotFoundException e) {
			   System.out.print(e.getMessage());
		   }
		   System.out.println("unique_words.txt has been written.");
	   }
}