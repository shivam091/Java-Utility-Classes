package org.util.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

/**
 * utility class containing method to decompress files from zip.
 * @author shivam
 *
 */
public class UnGZipFile {

	/**
	 * method to decompress file.
	 * @param filePath
	 * 			full path of the file to be uncompressed.
	 */
	public void doUnGzipFile(String filePath) {
		 
        GZIPInputStream gis = null;
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(filePath);
            gis = new GZIPInputStream(fis);
            fos = new FileOutputStream("/home/shivam/Documents/test");
            byte[] tmp = new byte[4*1024];
            int size = 0;
            while ((size = gis.read(tmp)) > 0) {
                fos.write(tmp, 0, size);
            }
            fos.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try{
                if(gis != null) gis.close();
                if(fos != null) fos.close();
            } catch(Exception ex){}
        }
    }
}