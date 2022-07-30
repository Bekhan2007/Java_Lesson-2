package com.company;

import java.util.Comparator;

public class Math implements Solutions, Comparator<Math> {

    String name;
    int grade;


    int res;

    public Math() {
    }

    public Math(String name, int grade) {
        this.name = name;
        this.grade = grade;

    }


    @Override
    public void answors(int a, int b, int n) {


        switch (n) {
            case 0 -> {
                res = a + b;
                System.out.println(a + " + " + b + " = ");
            }
            case 1 -> {
                res = a - b;
                System.out.println(a + " - " + b + " = ");
            }
            case 2 -> {
                res = a * b;
                System.out.println(a + " * " + b + " = ");
            }
            case 3 -> {
                res = a / b;
                System.out.println(a + " / " + b + " = ");
            }
        }


    }


    @Override
    public int compare(Math o1, Math o2) {
        if (o1.grade == o2.grade) {
            return 0;
        } else if (o1.grade > o2.grade) {
            return 1;
        } else {
            return -1;

        }


    }
}
