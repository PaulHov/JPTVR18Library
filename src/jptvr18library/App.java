/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr18library;

import myclasses.BookProvider;
import entity.Book;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author Hovinen
 */
public class App {

public class Book{
    public void run(){
        System.out.println();
        System.out.println("Консольная библиотека");
        OUTER:
        do {
            System.out.println("0. ");
            System.out.println("1. Новая книга");
            System.out.println("2. Список книг");
            System.out.println("3. Новый читатель");
            System.out.println("4. Выдать книгу");
            System.out.println("5. Вернуть книгу");
            System.out.println("Выберите задачу: ");
            Scanner scanner = new Scanner(System.in);
            int task = scanner.nextInt();
            switch (task) {
                case 0:
                    System.out.println("Закрытие прогрпаммы");
                    break OUTER;
            //Новая книга
                case 1:
                    BookProvider bookProvider = new BookProvider();
                    break;
            //Список книг
                case 2:
                    break;
            //Новый читатель
                case 3:
                    break;
            //Выдать книгу
                case 4:
                    break;
            //Вернуть книгу
                case 5:
                    break;
                default:
                    System.out.println("Закрытие прогрпаммы");
                    break;
                }
            }while(true);
        }
    }
}
/* ===================================================================== */
/*
        Scanner scanner = new Scanner(System.in);
        String operation = "0";
        boolean badOperation;
        List<Book> newArrayList = null;
        List<Book> ListBooks = newArrayList<>();
        do{
            do{
                System.out.println("Выберите операцию:");
                System.out.println("0. Выход");
                System.out.println("1. Добавить книгу");
                System.out.println("2. Добавить читателя");
                System.out.println("3. Выдать книгу");
                System.out.println("4. Вернуть книгу");
                System.out.println("5. Список книг");
                System.out.println("6. Список читателя ");
                badOperation = false;
                operation = scanner.next();
                switch (operation) {
                    case "0":
                        badOperation = false;
                        break;
                    case "1":
                        BookProvider bookProvider = new BookProvider();
                        System.out.println("Выполняем операцию 1");
                        break;
                    case "2":
                        System.out.println("Выполняем операцию 2");
                        break;
                    case "3":
                        System.out.println("Выполняем операцию 3");
                        break; 
                    case "4":
                        System.out.println("Выполняем операцию 4");
                        break;
                        case "5":
                        System.out.println("Выполняем операцию 5");
                        break;
                        case "6":
                        System.out.println("Выполняем операцию 6");
                        break;
                    default:
                        System.out.println("Неправильная операция!");
                        System.out.println("Выберите правильную операцию");
                        badOperation = true;
                }
            }while(badOperation);
            if(operation.equals("0"))break;
            
        }while(true);
        
//        Book book = new Book();
//        book.setId(1L);
//        book.setTitle("Voina i mir");
//        book.setAuthor("L.Tolstoy");
//        book.setYear(2010);
//        System.out.println(book.getId());
//        System.out.println(book.getTitle());
//        System.out.println(book.getAuthor());
//        System.out.println(book.getYear());
//        System.out.println("Вывод метода toString(): ");
//        System.out.println(book.toString());
//        
//        Book book2 = new Book(2L, "Otsi i deti", "I.Turgenev", 2011);
//        System.out.println(book2.toString());
//        
//        book.setYear(2012);
//        System.out.println(book.toString());
//        
//        Reader reader = new Reader(1L, "Ivan", "Ivanov", 10, 10, 2000);
//        System.out.println(reader.toString());
//                
//        System.out.println("Выдача книги:");
//        History history = new History();
//        history.setId(1L);
//        history.setBook(book);
//        history.setReader(reader);
//        history.setTakeOnDate(new Date());
//        System.out.println(history.toString());
//        System.out.println("Возврат книги:");
//        history.setReturnDate(new Date());
//        System.out.println(history.toString());

*/
