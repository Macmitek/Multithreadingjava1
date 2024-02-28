package com.revision.buffer;
import java.io.*;
public class BufferExample {
    public static void main(String[] args) throws Exception {

        FileWriter fw =  new FileWriter("C:\\Users\\jadav\\Desktop\\javacode\\textdoc.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Hello, world");
        bw.write("This is Buffer Class Example");
        bw.close();

        FileReader fr =  new FileReader("C:\\Users\\jadav\\Desktop\\javacode\\textdoc.txt");
        BufferedReader br =  new BufferedReader(fr);
        int i;
        while((i=br.read())!=-1){
            System.out.print((char)i);
        }
        br.close();
    }
}
