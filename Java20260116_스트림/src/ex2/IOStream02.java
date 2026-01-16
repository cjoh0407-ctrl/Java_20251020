package ex2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class IOStream02 {

	public static void main(String[] args) throws IOException {

		Writer out = new FileWriter("c:/data/data.txt");
		
		out.write("안녕하세요!\n");
		out.write("자바 입출력 학습 중\n");
		out.write("문장 단위 입출력 예제\n");
		out.close();
		
		out.close();
		
		Reader in = new FileReader("c:/data/data.txt");
		
		int ch;
		
		while((ch = in.read()) != -1) {
			System.out.print((char)ch);
		}
		
		in.close();
		
		
	}

}
