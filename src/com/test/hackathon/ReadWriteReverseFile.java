//Q31. Read a file content and write it to a new file in reverse order.(reverse line 1-10 to line 10-1) 
package com.test.hackathon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteReverseFile {
	public static void main(String[] args) {

		try {

			FileInputStream instream = new FileInputStream(System.getProperty("user.dir") + "/Hackathon.txt");
			FileOutputStream outstream = new FileOutputStream(System.getProperty("user.dir") + "/HackCopy.txt");
			BufferedWriter bwriter = new BufferedWriter(new OutputStreamWriter(outstream));
			BufferedReader br = new BufferedReader(new InputStreamReader(instream));
			
			int numlines = 0;
			String sLine = null;
			List<String> tmp = new ArrayList<String>();
// Read the lines of the file
			while ((sLine = br.readLine()) != null) {
				System.out.println(sLine);
				tmp.add(sLine);

				numlines++;
			}
			//System.out.println(numlines);

			System.out.println("**************reverse*********************");
			//Reverse of the file Content(line 10 to 1)
			for (int i = numlines - 1; i >= 0; i--) {
				System.out.println(tmp.get(i));				
			}
			//Copying the content to another file
			for (String str : tmp) {
				bwriter.write(str + System.lineSeparator());
			}

			bwriter.close();
			instream.close();
			outstream.close();
			System.out.println("\n******************************");
			System.out.println("File copied successfully to the new file in Reverse order!!");

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
