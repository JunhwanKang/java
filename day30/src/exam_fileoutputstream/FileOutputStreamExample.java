package exam_fileoutputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
	public static void main(String[] args) throws Exception{
		String originalFileName = "C:\\Users\\wnsghks\\Documents\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\day30\\src\\exam_fileoutputstream\\one.png";
		String targetFileName = "C:/Temp/one.png";
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteNo;
		byte[] readBytes = new byte[100];
		while((readByteNo = fis.read(readBytes))!=-1) {
			fos.write(readBytes, 0, readByteNo);
		}
		fos.flush();
		fis.close();
		fos.close();
		
		System.out.println("복사를 완료했습니다.");
	}
}
