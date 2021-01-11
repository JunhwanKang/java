package com.icia.full.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyUtils {
	public void copy(String src, String dest) {
		File srcFile = new File(src);
		File destFile = new File(dest);
		try {
			InputStream in = new FileInputStream(srcFile);
			OutputStream out = new FileOutputStream(destFile);
			while(true) {
				int data = in.read();
				if(data == -1)
					break;
				out.write(data);
			}
			in.close();
			out.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("파일을 읽을 수 없습니다.");
		}
	}
}
