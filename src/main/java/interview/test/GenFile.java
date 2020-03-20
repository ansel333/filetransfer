package interview.test;

import java.io.*;
import java.util.Random;
import java.util.UUID;

public class GenFile {

    public static void main(String[] args) throws IOException {
        File file = new File("./source.txt");
        System.out.println(file.getAbsolutePath());
        FileOutputStream outputStream = new FileOutputStream(file);

        OutputStreamWriter writer = new OutputStreamWriter(outputStream);

        for(int i = 0 ; i < 10000; i++) {

            int times = (int) (Math.random() * 10 );
            for( int j = 0 ; j < times; j++ ) {
                char ch = (char)(Math.random() * 250);

                if(ch == '\r' || ch == '\n' || ch == '\t') {
                    continue;
                }

                writer.write(ch);
            }

            int len = (int) ("HELLO".length() * Math.random());
            writer.write("HELLO".substring(0, len));
        }


    }
}
