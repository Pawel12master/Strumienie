package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Random random=new Random();
        char tab2[][]=new char[5][5];
        int tab[][]=new int[2][2];
        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j < 2; j++) {
                int liczba = random.nextInt(10);
                tab[i][j] = liczba;
                System.out.print(" " + tab[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        int a=65;
            for (int k = 0; k <5 ; k++) {
                for (int l = 0; l <5 ; l++) {

                   char znak=(char)a;
                   tab2[k][l]=znak;
                    a++;

                }
                System.out.println();

        }
           // wypiszTabliceCharow(tab2);
       // System.out.println();
          //  sklejTabliceCharow(tab2);
      // pokazTablice(transpozycjaTablicy(tab));
        wypiszNapis(stringNaChary("Luksja"));

    }
    public static void wypiszTabliceCharow(char tablica[][])
    {
        for (int i = 0; i <tablica.length ; i++) {
            for (int j = 0; j <tablica.length ; j++) {
                System.out.print(" ");
                System.out.print(tablica[i][j]);

            }
            System.out.println();

        }
    }
    public static void sklejTabliceCharow(char tablica[][])
    {


        for (int i = 0; i <tablica.length ; i++) {
            String s = " ";
            StringBuilder stringBuilder = new StringBuilder(s);
            for (int j = 0; j <tablica.length ; j++) {


                stringBuilder.append(tablica[i][j]);

            }
            s=stringBuilder.toString();
            System.out.print(s);

            System.out.println();




        }
    }
    public static int[][] transpozycjaTablicy(int tablica[][])
    {

        int tab[][]=new int[tablica.length][tablica.length];
        for (int i = 0; i <tablica.length ; i++) {
            for (int j = 0; j <tablica.length ; j++) {
                tab[j][i]=tablica[i][j];


            }

        }
        return tab;
    }
    public static void pokazTablice(int tablica[][])
    {
        for (int i = 0; i <tablica.length ; i++) {
            for (int j = 0; j <tablica.length ; j++) {
                System.out.print(tablica[i][j]);

            }
            System.out.println();

        }
    }
    public static char[] stringNaChary(String napis)
    {
        char tab[]=new char[napis.length()];
        char znak;
        for (int i = 0; i <napis.length() ; i++) {
            znak=napis.charAt(i);
            tab[i]=znak;

        }
        return tab;
    }
    public static void wypiszNapis(char tablica[])
    {
        for (int i = 0; i <tablica.length ; i++) {
            System.out.print(" "+tablica[i]);
        }
    }

}
