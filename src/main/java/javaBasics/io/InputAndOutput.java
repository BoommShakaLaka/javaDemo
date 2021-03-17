package javaBasics.io;

import org.junit.Test;

import java.io.*;

public class InputAndOutput {
    @Test
    public void test1() throws IOException {
        InputStream is =null;
        OutputStream os = null;
        try {
            // 在try()中打开文件会在结尾自动关闭
            is = new FileInputStream("D:/FileInputStreamTest.txt");
            os = new FileOutputStream("D:/FileOutputStreamTest.txt");
            byte[] buf = new byte[4];
            int hasRead = 0;
            while ((hasRead = is.read(buf)) > 0) {
                os.write(buf, 0, hasRead);
            }
            System.out.println("write success");
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            os.close();
            is.close();
        }
    }
}
