package cox_p1;

import java.io.IOException;

public class Application {

   public static void main(String[] args) throws IOException {
	   String i_file = "problem1.txt";
	   String o_file = "unique_words.txt";
       DuplicateRemover r = new DuplicateRemover();      
       r.Remove(i_file);
       r.Write(o_file);
   }
}