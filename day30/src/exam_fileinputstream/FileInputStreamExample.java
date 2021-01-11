package exam_fileinputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\wnsghks\\Documents\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\day30\\src\\exam_fileinputstream\\FileInputStreamExample.java");
		 int data;
		while((data = fis.read()) != -1) {
			System.out.write(data);
		}
		System.out.flush();
		fis.close();
	}

}
