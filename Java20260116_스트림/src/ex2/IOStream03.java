package ex2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class IOStream03 {

	public static void main(String[] args) throws IOException {

		BufferedWriter out = new BufferedWriter(new FileWriter("c:/data/data.txt"));
		
		out.write("안녕하세요!");
		out.newLine();
		out.write("자바 입출력 학습 중");
		out.newLine();
		out.write("문장 단위 입출력 예제");
		out.close();
		
		BufferedReader in = new BufferedReader(new FileReader("c:/data/data.txt"));
		
		String line;
		
		while((line = in.readLine()) != null) {
			System.out.println(line);
		}
		
		
	}

}
