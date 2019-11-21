/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import entity.Book;
import java.util.Scanner;

/**
 *
 * @author Hovinen
 */
public class BookProvider {
    public Book createBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("--- Создание книги ---");
        System.out.println("Название книги");
        String name == scanner.nextLine();
        System.out.println("Автор книги");
        String author == scanner.nextLine();
        System.out.println("Год издания");
        String year == scanner.nextLine();
        int publishedYear = scanner.nextInt();
        System.out.println();
        String isbn = scanner.nextLine();
        
        
        return Book;
        
    }
    
}










/*

package classes;
import entity.Book;
import static java.lang.System.in;
import java.util.Scanner;


public class BookProvider {
    public Book createBook();
    Scanner scanner = new Scanner(System in);
    System.out.printLn("--------создание новой книги-------");
    System.out.printLn("Название книги:");
    book.setTitle(scanner.nextLine());
    System.out.printLn("Автокниги:");
    book.setAuthor(scanner.nextLine());
    System.out.printLn("год издания книги:");
    book.setYear(new Integer(scanner.nextLine()));
    return book;
   
}
*/
