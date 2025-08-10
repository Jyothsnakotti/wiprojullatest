package com.wipro.thread;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercise_5 {
	public static void main(String[] args) {
        String i1 = "\"C:\\Users\\chait\\OneDrive\\Pictures\\photo.jpg\"";        
        String i2 = "\"D:\\JAVA\"";   

        try (
            FileInputStream fis = new FileInputStream(i1);
            FileOutputStream fos = new FileOutputStream(i2);
        ) {
            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("Image copied successfully.");
        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }
}
