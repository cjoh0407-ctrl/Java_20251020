package ex2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOStream01 {

	public static void main(String[] args) throws IOException {

		OutputStream out = new FileOutputStream("c:/data/data.dat");
		
		out.write(7);
		out.write(5);
		out.write(2);
		out.write(4);
		out.close();
		
		InputStream in = new FileInputStream("c:/data/data.dat");
		
		int data;
		
		while((data = in.read()) != -1) {
			System.out.println(data);
		}
		
		in.close();
		
	}

}
