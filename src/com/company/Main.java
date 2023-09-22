package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(" Задача 1");
        int savings = 15_000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            i++;
            total = total + total/100;
            total = total + savings;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println(" Задача 2");
        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a + " " );
        }
        System.out.println();
        for (; a > 0; a--) {
            System.out.print(a + " ");
        }
        System.out.println();

        System.out.println(" Задача 3");
        int people = 12_000_000;
        int birthRate = people / 1_000 * 17;
        int mortalityRate = people / 1_000 * 8;
        for (int year = 1; year <= 10; year++) {
            people = people + birthRate - mortalityRate;
            System.out.println("Год " + year + ", численность населения составляет " + people);
        }

        System.out.println(" Задача 4");

        System.out.println(" Задача 5");
        System.out.println(" Задача 6");
        System.out.println(" Задача 7");
        int friday = 5;
        int day = 1;
        while (friday != day) {
            day++;
        }
        for (; day<= 31; day = day + 7) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
            }

        System.out.println(" Задача 8");
        int yearNow = 2023;
        int start = yearNow - 200;
        int end = yearNow + 100;
        int year = 0;
        while (year < end){
            year = year + 79;
            if (year > start && year < end) {
                System.out.println(year);
            }
        }
    }
}
