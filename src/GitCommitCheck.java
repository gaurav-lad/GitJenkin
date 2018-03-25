import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class GitCommitCheck {
	public static void main(String[]  args) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;
		for(int i = 0 ; i < 10; i++) {
			System.out.println("value of i is: "+i);
		}
		try {
			in = new FileInputStream("./src/Test.txt");
			out= new FileOutputStream("./src/Test2.txt");
			int c;
			while ((c = in.read()) != -1) {
	            out.write(c);
	         }
	      }finally {
	         if (in != null) {
	            in.close();
	         }
	         if (out != null) {
	            out.close();
	         }
	      }
	}
}