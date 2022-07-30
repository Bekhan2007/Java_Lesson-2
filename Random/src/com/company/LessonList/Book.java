package com.company.LessonList;

import java.io.InputStream;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

    public class Book implements List {
    String name;
    int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

        public Book(InputStream in) {
        }


        @Override
        public void BookList() {
            
        }

        @Override
        public void Booksearch() {

        }

        @Override
    public void BookList(LinkedList<Book> List) {
        System.out.println("add List");
        for (Book book: List){
            System.out.println(book.name+" "+book.price);
        }
        System.out.println();
    }

    @Override
    public void Booksearch(LinkedList<Book>List) {
        boolean isHave=false;
        Scanner scanner=new Scanner(System.in);
        System.out.println("==Search==");
        System.out.println("Mutolaa uchun kitob tanlang->2");
        String name=scanner.nextLine();
        for (Book book:List){
            if (Objects.equals(book.name,name)){
                isHave=true;
                break;
            }
        }
        if (isHave){
            System.out.println("book have");
            System.out.println();
        }else {
            System.out.println("book no");
            System.out.println();
        }
    }

        @Override
        public void Bookyesorno() {
            
        }

        @Override
    public void Bookyesorno(LinkedList<Book> List) {
        System.out.println("Bor yoki yo'q->3");

    }

    @Override
    public void stop() {
        System.out.println("tugatish->4");
    }
}
