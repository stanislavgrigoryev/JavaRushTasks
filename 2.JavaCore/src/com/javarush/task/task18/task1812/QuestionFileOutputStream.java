package com.javarush.task.task18.task1812;


import java.io.IOException;
import java.util.Scanner;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {
    AmigoOutputStream amigoOutputStream;
    Scanner scanner = new Scanner(System.in);

    public QuestionFileOutputStream(AmigoOutputStream amigoOutputStream) {
        this.amigoOutputStream = amigoOutputStream;
    }

    public QuestionFileOutputStream() {

    }

    public static void main(String[] args) {
        AmigoOutputStream amigoOutputStream1 = new QuestionFileOutputStream();
        try {
            amigoOutputStream1.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void flush() throws IOException {
        amigoOutputStream.flush();

    }

    @Override
    public void write(int b) throws IOException {
        amigoOutputStream.write(b);

    }

    @Override
    public void write(byte[] b) throws IOException {
        amigoOutputStream.write(b);

    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        amigoOutputStream.write(b,off,len);

    }

    @Override
    public void close() throws IOException {
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        String s = scanner.nextLine();
        if (s.equals("Д")){
            amigoOutputStream.close();
        }
    }
}

