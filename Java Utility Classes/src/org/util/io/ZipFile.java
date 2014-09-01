package org.util.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * utility class containing method to compress single/multiple files into zip format.
 * @author shivam
 *
 */
public class ZipFile {

	/**
	 * method to compress single file into zip.
	 * @param filePath
	 * 			full path of the file to be added into the zip.
	 */
	public static void zipFile(String filePath){
        
        FileOutputStream fos = null;
        ZipOutputStream zipOut = null;
        FileInputStream fis = null;
        try {
            fos = new FileOutputStream("/home/shivam/Documents/test.zip");
            zipOut = new ZipOutputStream(new BufferedOutputStream(fos));
            File input = new File(filePath);
            fis = new FileInputStream(input);
            ZipEntry ze = new ZipEntry(input.getName());
            zipOut.putNextEntry(ze);
            byte[] tmp = new byte[4*1024];
            int size = 0;
            while((size = fis.read(tmp)) != -1){
                zipOut.write(tmp, 0, size);
            }
            zipOut.flush();
            zipOut.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try{
                if(fos != null) fos.close();
                if(fis != null) fis.close();
            } catch(Exception ex){
                 
            }
        }
    }
	
	/**
	 * method to compress multiple file into zip.
	 * @param files
	 * 			full path of each of the file to be added into the zip.
	 */
	public static void zipFiles(List<String> files){
        
        FileOutputStream fos = null;
        ZipOutputStream zipOut = null;
        FileInputStream fis = null;
        try {
            fos = new FileOutputStream("/home/shivam/Documents/test.zip");
            zipOut = new ZipOutputStream(new BufferedOutputStream(fos));
            for(String filePath:files){
                File input = new File(filePath);
                fis = new FileInputStream(input);
                ZipEntry ze = new ZipEntry(input.getName());
                zipOut.putNextEntry(ze);
                byte[] tmp = new byte[4*1024];
                int size = 0;
                while((size = fis.read(tmp)) != -1){
                    zipOut.write(tmp, 0, size);
                }
                zipOut.flush();
                fis.close();
            }
            zipOut.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try{
                if(fos != null) fos.close();
            } catch(Exception ex){
                 
            }
        }
    }
}