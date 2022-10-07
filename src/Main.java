public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 1");
        //Задача 1
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //Задача 2
        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        //Задача 3
        System.out.println("Задача 3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }

        //Задача 4
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println("Домашнее задание 2");

        //Задача 5
        System.out.println("Задача 1");
        for (int i = 1904; i <= 2096; i = i+4) {
            System.out.println(i + " год является високосным");
        }

        //Задача 6
        System.out.println("Задача 2");
        for (int i = 7; i <= 98; i = i+7) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Задача 7
        System.out.println("Задача 3");
        int number = 1;
        System.out.print(number + " ");
        for (int i = 0; i < 9; i++) {
            number = number * 2;
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println("Домашнее задание 3");
        //Задача 1
        System.out.println("Задача 1");
        int partOfSavings = 29000;
        int amountOfSavings = 0;
        for (int i = 1; i <= 12 ; i++) {
            amountOfSavings += partOfSavings;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + amountOfSavings + " рублей");
        }

        //Задача 2
        System.out.println("Задача 2");
        double amountOfSavingsInPercent = 0;
        double percent = 0.01;
        for (int i = 1; i <= 12 ; i++) {
            amountOfSavingsInPercent = (amountOfSavingsInPercent + partOfSavings) * (1 + percent);
            System.out.println("Месяц " + i + " , сумма накоплений равна " + amountOfSavingsInPercent + " рублей");
        }

        }

    }
