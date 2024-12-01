package com.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            var factory = new JsonFactory();
            var om = new ObjectMapper(factory);
            var glossary = om.readValue(new File("C:\\code\\java\\learn\\crap.json"), Glossary.class);
            System.out.println("Title: " + glossary.getTitle());
            glossary.getTheList().forEach(i -> {
                System.out.println("List Item: " + i);
            });
            
        } catch (FileNotFoundException e) {
            System.out.println("file not found!");
        }
        catch (IOException ioe) {
            System.out.println("input output exception!");
        }

        var a = new MyThread("a");
        var b = new MyThread("b");
        var c = new MyThread("c");

        var threadA = new Thread(a);
        var threadB = new Thread(b);
        var threadC = new Thread(c);

        threadA.start();
        try {
            threadA.join();   
        } catch (InterruptedException  e) {
            e.printStackTrace();
        }

        threadB.start();
        threadC.start();
    }

}
