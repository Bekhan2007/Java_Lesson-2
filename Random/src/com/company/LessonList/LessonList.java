package com.company.LessonList;

import java.util.LinkedList;
import java.util.Scanner;

public class LessonList {
    public static void main(String[] args) {
        Book book=new Book(System.in);
        Scanner scanner=new Scanner(System.in);
        LinkedList<Book>bookLinkedList=new LinkedList<>();
        System.out.println("kitoblarni tanlang");
        int a=scanner.nextInt();

        bookLinkedList.add(new Book("din nasihatlari",100));
        bookLinkedList.add(new Book("ertaklar olami",10));
        bookLinkedList.add(new Book("tragediya",15));
        bookLinkedList.add(new Book("badiiy",20));

        while (true){
            System.out.println("1->kitoblar ro'yhati");
            System.out.println("2-> kitoblarni ko'rish");
            System.out.println("3->kitob qidirish");
            System.out.println("4->chiqish");
            System.out.println("==");
            int n=scanner.nextInt();
            switch (n){
                case 1->{
                    book.BookList(bookLinkedList);
                    book.BookList(bookLinkedList);
                }
            }



        }
}
        }
