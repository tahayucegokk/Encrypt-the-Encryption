package com.taha;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;
import java.util.Random;

public class Main {
    String pass = "";
        public static String yerlihash(String pass) {
         Random r=new Random();
            int sayi1 = (int)(Math.random()*100);
            int sayi2 = (int)(Math.random()*100);
            int sayi3 = (int)(Math.random()*100);
            int sayi4 = (int)(Math.random()*100);
            int sayi5 = (int)(Math.random()*100);
            int sayi6 = (int)(Math.random()*100);
            int sayi7 = (int)(Math.random()*100);
            int sayi8 = (int)(Math.random()*100);
            int sayi9 = (int)(Math.random()*100);
            int sayi10 = (int)(Math.random()*100);
            int sayi11 = (int)(Math.random()*100);
            int sayi12 = (int)(Math.random()*100);
            int a=r.nextInt(10);
        String hash1 = Integer.toString(sayi1);;
        String hash2 = Integer.toString(sayi2);
        String hash3 = Integer.toString(sayi3);
        String hash4 = Integer.toString(sayi4);
        String hash5 = Integer.toString(sayi5);
        String hash6 = Integer.toString(sayi6);
        String hash7 = Integer.toString(sayi7);
        String hash8 = Integer.toString(sayi8);
        String hash9 = Integer.toString(sayi9);
        String hash10 = Integer.toString(sayi10);
        String hash11 = Integer.toString(sayi11);
        String hash12 = Integer.toString(sayi12);
      String[] hash = new String[]{hash1,hash2,hash3,hash4,hash5,hash6,hash7,hash8,hash9,hash10,hash11,hash12};
         int x = 0;
           StringBuilder str = new StringBuilder();
                for (char c : pass.toCharArray()) {
                     if (x < hash.length) {
                           str.append(hash[x] + c);
                             x++;
                }  else {
                x = 0;
            }
        }
        return str.toString();
    }
    public static void main(String args[])
    {
        String hashsayısı = "123";
        String hashsonuç = yerlihash(hashsayısı);
        System.out.println(hashsonuç);

    }

}
