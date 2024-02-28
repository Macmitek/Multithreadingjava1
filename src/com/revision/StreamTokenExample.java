package com.revision;


import java.io.*;
public class StreamTokenExample {
    public static void main(String[] args) throws IOException {
            String text = "Hello \n 123 world !";

            StringReader stringReader = new StringReader(text);
            StreamTokenizer tokenizer = new StreamTokenizer(stringReader);
            tokenizer.eolIsSignificant(true);

        int token;
        while ((token = tokenizer.nextToken()) != StreamTokenizer.TT_EOF) {
            switch (token) {
                case StreamTokenizer.TT_WORD:
                    System.out.println("Word: " + tokenizer.sval);
                    break;
                case StreamTokenizer.TT_NUMBER:
                    System.out.println("Number: " + tokenizer.nval);
                    break;
                case StreamTokenizer.TT_EOL:
                    System.out.println("End of Line");
                    break;
                default:
                    System.out.println("Other: " + (char) token);
            }
        }
    }
}
