package day30;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyTest {
	public static void main(String[] args) {
		String src = "c:/windows/WindowsUpdate.log";
		String dest = "c:/copy.log";
		File inFile = new File(src);
		File outFile = new File(dest);
		
		try {
			InputStream in = new FileInputStream(inFile);
			OutputStream out = new FileOutputStream(outFile);
			while(true) {
				int data = in.read();
				if(data==-1)
					break;
				out.write(data);
			}
			out.close();
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
