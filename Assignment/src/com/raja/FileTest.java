package com.raja;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Date;

public class FileTest {

	public static void main(String args[]) {
		
		final File folder=new File("D:\\Test");
		int[] monthsCount=new int[13];
		String[] months = {"Jan","Feb","Mar","Apr","May","June","July","Aug","Sep","Oct","Nov","Dec"};
		
		for(final File fileEntry:folder.listFiles()) {
			
			BasicFileAttributes attributes=null;
			try {
				
				attributes=Files.readAttributes(fileEntry.toPath(), BasicFileAttributes.class);
				FileTime time=attributes.creationTime();
				Date date=new Date(time.toMillis());
				int month =date.getMonth();
				monthsCount[month+1]++;
			}
				
					
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		for(int i=1;i<13;i++) {
			
			System.out.println(months[i-1]+"="+monthsCount[i]);
		}
	}
	
	
}
