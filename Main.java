package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        String sciezka = "C:\\Users\\papie\\IdeaProjects\\PanTadeusz\\Pan_Tadeusz.txt";
        Path inputPath= Paths.get("C:\\Users\\papie\\IdeaProjects\\PanTadeusz\\Pan_Tadeusz.txt");
      //  List<String> linessssss = Files.readAllLines(inputPath, Charset.forName("UTF-8"));
        Stream<String> stream=new ArrayList<String>().stream();
        try (Stream<String> lines = new BufferedReader(
               new FileReader(sciezka)).lines()){
                List<String> linie=lines.collect(Collectors.toList());
                Stream<String> wyrazyA= Pattern.compile("((\\s)+([a-zA-z]+)(\\s)+)").splitAsStream(String.join(" ",linie));

            System.out.println(
                    wyrazyA
                    .count());
            System.out.println("///////////////////////////////");


            Stream<String> najdluzszy=Pattern.compile("((\\s)+([a-zA-z]+)(\\s)+)").splitAsStream(String.join(" ",linie));
            System.out.println(
                    najdluzszy
                            .filter(s->s.matches("([a-zA-Z]+)"))
                            .max((f1,f2)->f1.length()-f2.length())
            );


            System.out.println("///////////////////////////////");



            System.out.println("///////////////////////////////");


            Stream<String> najdluzszy2=Pattern.compile("((\\s)+([a-zA-z]+)(\\s)+)").splitAsStream(String.join(" ",linie));
            System.out.println(
                    najdluzszy2
                            .filter(s->s.matches("([a-zA-Z]+)"))
                            .filter(s->s.matches("(([^n][a-zA-Z])[a-zA-Z]+)"))
                            .max((f1,f2)->f1.length()-f2.length())
            );


            System.out.println("///////////////////////////////");
            System.out.println("///////////////////////////////");


            Stream<String> najdluzszy3=Pattern.compile("((\\s)+([a-zA-z]+)(\\s)+)").splitAsStream(String.join(" ",linie));


            System.out.println(
                    najdluzszy3

                            .filter(s->s.matches("([a-zA-Z]+)"))
                            .max((f1,f2)->f1.length()-f2.length())
            );
            


            System.out.println("///////////////////////////////");



            Stream<String> wyrazyB=Pattern.compile("((\\s)+([a-zA-z]+)(\\s)+)").splitAsStream(String.join(" ",linie));
            System.out.println(
                    wyrazyB
                            .filter(s->s.length()>5)
                            .count()
            );

            Stream<String> wyrazyC=Pattern.compile("((\\s)+([a-zA-z]+)(\\s)+)").splitAsStream(String.join(" ",linie));
            System.out.println(
                    wyrazyC
                    .filter(s->s.length()<3)
                    .count()
            );
            Stream<String> wyrazyD=Pattern.compile("((\\s)+([a-zA-z]+)(\\s)+)").splitAsStream(String.join(" ",linie));
            System.out.println(
                    wyrazyD
                    .filter(s->s.length()%2==1)
                    .count()
            );
            Pattern pattern=Pattern.compile("[1-9]?[0-9]{7}");
            Matcher matcher= pattern.matcher("12345678");
           // System.out.println(matcher.matches());

            Pattern pattern1=Pattern.compile("([A-Z]){1}[a-z]+");
            Matcher matcher1=pattern1.matcher("polska");
           // System.out.println(matcher1.matches());
            Pattern pattern2=Pattern.compile("([a-zA-Z]{5,})(r$)");
            Matcher matcher2=pattern2.matcher("gokard");
          //  System.out.println(matcher2.matches());

            Pattern pattern3=Pattern.compile("[0-1]+");
            Matcher matcher3=pattern3.matcher("00010");
          //  System.out.println(matcher3.matches());

            Pattern pattern4=Pattern.compile("(^[a-z])(.{3})(w)(op)\\s([2-9]{5})");
            Matcher matcher4=pattern4.matcher("a...wop 55555");
            System.out.println(matcher4.matches());



            /*
            System.out.println("pdkt E /////////////////////");
            Stream<String> wyrazyE=Pattern.compile("((\\s)+([a-zA-z]+)(\\s)+)").splitAsStream(String.join(" ",linie));
            List<String> listawyrazow=

                    wyrazyE
                    .filter(s->s.matches("(^[A-Z])([a-z]+)"))
                    .collect(Collectors.toList());
            for (String s:listawyrazow) {
                System.out.println(s);
            }
            Stream<String> wyrazyE2=Pattern.compile("((\\s)+([a-zA-z]+)(\\s)+)").splitAsStream(String.join(" ",linie));
            List<String> listawyrazow2=

                    wyrazyE2
                            .filter(s->s.matches("(^[A-Z])([a-z]+)"))
                            .collect(Collectors.toList());
            for (String s:listawyrazow2) {
                System.out.print(s+";");
            }

             */


            /*
            System.out.println("pdkt F /////////////////////");
            Stream<String> wyrazyF=Pattern.compile("((\\s)+([a-zA-z]+)(\\s)+)").splitAsStream(String.join(" ",linie));
                    List<String> wyrazydoF=
                            wyrazyF
                            .filter(s->s.length()>7)
                                    .filter(s->s.matches("([a-zA-Z]+)"))
                            .collect(Collectors.toList());
            for (String t:wyrazydoF
                 ) {
                System.out.println(t);
            }
            System.out.println("pdkt G /////////////////////");
            Stream<String> wyrazyG=Pattern.compile("((\\s)+([a-zA-z]+)(\\s)+)").splitAsStream(String.join(" ",linie));
            List<String> wyrazdydoG=
                    wyrazyG
                    .filter(s -> s.length()==1)
                            .filter(s->s.matches("([a-zA-Z]+)"))
                    .collect(Collectors.toList());
            for (String q:wyrazdydoG
                 ) {
                System.out.println(q);
            }

            System.out.println("pdpkt H //////////////////////");
            Stream<String> wyrazyH=Pattern.compile("((\\s)+([a-zA-z]+)(\\s)+)").splitAsStream(String.join(" ",linie));

                    wyrazyH

                    .map(s->s.toLowerCase())
                    .forEach(System.out::println);


            System.out.println("pdpkt I //////////////////////");
            Stream<String> wyrazyI=Pattern.compile("((\\s)+([a-zA-z]+)(\\s)+)").splitAsStream(String.join(" ",linie));

            wyrazyI

                    .map(s->s.toUpperCase())
                    .forEach(System.out::println);

             */
                    





            }






        catch(IOException e) {
            e.printStackTrace();
        }
    }
    public static String znajdzNadluzszy()
    {
        return null;
    }


        /*
        for (int i = 0; i <lines.size() ; i++) {
            System.out.println(lines.get(i));
        }

         */
       // System.out.println(String.join(" ",lines));
      //  System.out.println(lines.stream()
               // .filter(s->s.matches("(\\s[a-zA-z]+)\\s"))
             //   .count());




             //  System.out.println(lines.stream().filter(s->s.contains(" ")).count()); ilosc spacji w ksiazce xd
            // Scanner scanner=new Scanner(inputPath);
            // System.out.println(lines.stream().filter(s->s.matches("([a-zA-Z]+)+\\s")).count());











    }


