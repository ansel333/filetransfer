package interview.test;

import java.io.*;
import java.nio.CharBuffer;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

//
// 请把在source.txt中的字符抄到output.txt中并且把source.txt中所有的HELLO替换成WORLD（大小写敏感）。
// 假设source.txt的尺寸可能很大（几百M甚至超过1G）并且source.txt和output.txt存放在不同的物理机械硬盘上。在设计程序时请考虑这个假设并且
// 对程序性能作出优化。
//
public class FileTransfer {

    private static final String HELLO = "HELLO";

    private static final String WORLD = "WORLD";

    public static void main(String[] args) throws IOException, InterruptedException {

        File sourceFile = new File("./source.txt");

        File outputFile = new File("./output.txt");



    }
}
