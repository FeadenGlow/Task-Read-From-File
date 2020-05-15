package com.company;
import java.io.*;
public class Main
{
    public static void main(String[] args) throws Exception
    {
        File file = new File("file.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null) {
            if(st.indexOf('W') == 0) {
                String replace = st.replace('W','w');
                System.out.println(replace);
            }
        }
    }
}
