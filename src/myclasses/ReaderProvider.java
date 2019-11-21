/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;
import entity.Reader;
import java.util.Scanner;
/**
 *
 * @author Hovinen
 */
public class ReaderProvider {
    public Reader createReader(){
    Reader reader=new Reader();
    Scanner scanner = new Scanner(System.in);
    System.out.println("--------запись читателя в библиотеку-------");
    System.out.println("Название книги:");
    book.setTitle(scanner.nextLine());
    System.out.println("Автокниги:");
    book.setAuthor(scanner.nextLine());
    System.out.println("год издания книги:");
    book.setYear(new Integer(scanner.nextLine()));
    return reader ;
   
}
}
