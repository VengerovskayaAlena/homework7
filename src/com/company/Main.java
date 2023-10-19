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
        for (int year = 1; year <= 10; year++) {
            int birthRate = people / 1_000 * 17;
            int mortalityRate = people / 1_000 * 8;
            people = people + birthRate - mortalityRate;
            System.out.println("Год " + year + ", численность населения составляет " + people);
        }

        System.out.println(" Задача 4");
        int savings4 = 15_000;
        int total4 = 0;
        int i4 = 0;
        while (total4 < 12_000_000) {
            i4++;
            total4 = total4 + (total4/100)*7;
            total4 = total4 + savings4;
            System.out.println("Месяц " + i4 + ", сумма накоплений равна " + total4 + " рублей");
        }

        System.out.println(" Задача 5");
        int savings5 = 15_000;
        int total5 = 0;
        int i5 = 0;
        while (total5 < 12_000_000) {
            i5++;
            total5 = total5 + (total5/100)*7;
            total5 = total5 + savings5;
            if (i5 %6 == 0){
            System.out.println("Месяц " + i5 + ", сумма накоплений равна " + total5 + " рублей");
        }}

        System.out.println(" Задача 6");
        int savings6 = 15_000;
        int total6 = 0;
        int i6 = 0;
        int months = 12 * 9;
        while (i6 < months) {
            i6++;
            total6 = total6 + (total6/100)*7;
            total6 = total6 + savings6;
            if (i6 %6 == 0){
                System.out.println("Месяц " + i6 + ", сумма накоплений равна " + total6 + " рублей");
            }}

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
