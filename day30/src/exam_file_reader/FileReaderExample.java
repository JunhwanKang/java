package exam_file_reader;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderExample {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("C:\\Users\\wnsghks\\Documents\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\day30\\src\\exam_file_reader\\FileReaderExample.java");
		
		int readCharNo;
		char[] cbuf = new char[100];
		while((readCharNo=fr.read(cbuf))!= -1) {
			String data = new String(cbuf,0,readCharNo);
			System.out.println(data);
		}
		fr.close();
	}

}
