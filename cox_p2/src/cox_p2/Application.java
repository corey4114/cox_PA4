package cox_p2;

import java.io.IOException;

public class Application {
	
	public static void main(String[] args) throws IOException {
		String i_file = "problem2.txt";
		String o_file = "unique_word_counts.txt";
	    DuplicateCounter c = new DuplicateCounter();      
	    c.Count(i_file);
	    c.Write(o_file);
	}
}