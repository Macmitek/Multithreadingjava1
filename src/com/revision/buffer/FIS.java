package com.revision.buffer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FIS {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("C:\\Users\\jadav\\Desktop\\javacode\\textdoc.txt");
        int i;
        while((i=fis.read())!=-1){
            System.out.print(i + " ");
        }
    }
}
