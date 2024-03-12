package org.example;

import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;

public class Main {


    public static void main(String[] args) {

        figlet("Hello World");
    }


    public static void figlet(String text) {
        String asciiArt2 = null;

        try {
            asciiArt2 = FigletFont.convertOneLine(text);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(asciiArt2);
    }
}
