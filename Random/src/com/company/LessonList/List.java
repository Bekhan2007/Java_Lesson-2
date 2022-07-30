package com.company.LessonList;

import java.util.LinkedList;

public interface List  {
    void BookList();
    void Booksearch();

    void BookList(LinkedList<Book> List);

    void Booksearch(LinkedList<Book> List);

    void Bookyesorno();

    void Bookyesorno(LinkedList<Book> List);

    void stop();



}
