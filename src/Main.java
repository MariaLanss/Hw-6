public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }
    public static void task1() {
        for(int i = 1; i <= 10; i = i + 1) {
            System.out.println(i);
        }
    }
    public static void task2() {
        for(int i = 10; i >= 1; i = i - 1) {
            System.out.println(i);
        }
    }
    public static void task3 () {
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
    }
    public static void task4 () {
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(i);
        }
    }
    public static void task5() {
        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.println(year + " год является високосным");
        }
    }
    public static void task6() {
        for (int number = 7; number <= 98; number = number + 7) {
            System.out.println(number);
        }
    }
    public static void task7() {
        for (int number = 1; number <= 512; number = number * 2) {
            System.out.println(number);
        }
    }
    public static void task8() {
        int sum = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total += sum;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task9() {
        int sum = 29000;
        double sumWithPercent = 0;
        double percent = 0.01;
        for (int i = 1; i <=12; i++) {
            sumWithPercent = (sumWithPercent + sum) * (1 + percent);
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sumWithPercent + " рублей");
        }
    }
    public static void task10() {
        for (int i = 2; i <= 10; i++) {
                System.out.println("2 x " + i + " = " + 2 * i);
            }
        }

    }


