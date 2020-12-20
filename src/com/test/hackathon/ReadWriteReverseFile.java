//Q31. Read a file content and write it to a new file in reverse order.(reverse line 1-10 to line 10-1) 
package com.test.hackathon;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadWriteReverseFile {
	public static void main(String[] args) {

		try {

			FileInputStream instream = new FileInputStream(System.getProperty("user.dir") + "/Hackathon.txt");
			FileOutputStream outstream = new FileOutputStream(System.getProperty("user.dir") + "/HackCopy.txt");

			byte[] buffer = new byte[1024];

			int length;

			BufferedReader br = new BufferedReader(new InputStreamReader(instream));

			String sLine;
			while ((sLine = br.readLine()) != null) {
				System.out.println(sLine);
			}

			while ((length = instream.read(buffer)) > 0) {
				outstream.write(buffer, 0, length);

			}

			instream.close();
			outstream.close();
			System.out.println("\n******************************");
			System.out.println("File copied successfully to the new file!!");

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
