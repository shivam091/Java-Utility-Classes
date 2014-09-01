package org.util.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/**
 * utility class containing method to compress files into gzip formated file.
 * @author shivam
 *
 */
public class GZipFile {

	/**
	 * method to compress specified file into gzip formatted file.
	 * @param filePath
	 * 		full path of the file to be compressed into gzip formatted file.
	 */
	 public static void doGzip(String filePath){
         
	        FileOutputStream fos = null;
	        GZIPOutputStream gos = null;
	        FileInputStream fis = null;
	        try {
	            fos = new FileOutputStream("/home/shivam/Documents/gzipTest.gzip");
	            gos = new GZIPOutputStream(fos);
	            fis = new FileInputStream(filePath);
	            byte[] tmp = new byte[4*1024];
	            int size = 0;
	            while ((size = fis.read(tmp)) != -1) {
	                gos.write(tmp, 0, size);
	            }
	            gos.finish();
	        } catch (IOException e) {
	             
	        } finally{
	            try{
	                if(fis != null) fis.close();
	                if(gos != null) gos.close();
	            } catch(Exception ex){}
	        }
	    }
}