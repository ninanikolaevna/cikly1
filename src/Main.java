//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //task1
        {
            System.out.println("Задача1");
        }
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(i);
        }
        //task2
        {
            System.out.println("Задача2");
        }
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.println(i);
        }
        //task3
        {
            System.out.println("Задача3");
        }
        for (int i = 2; i < 17; i = i + 2) {
            System.out.println(i);
        }
//task4
        {
            System.out.println("Задача4");
        }
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(i);
        }
//task5
        {
            System.out.println("Задача5");
        }
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i);
        }
//task6
        {
            System.out.println("Задача6");
        }
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
//task7
        {
            System.out.println("Задача7");
        }
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
//task8
        {
            System.out.println("Задача8");
        }
//«Месяц …, сумма накоплений равна … рублей».
        {
            int money = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + i * money;
            System.out.println("Месяц " + i + " , сумма накоплений "+ total + " рублей");
        }}
        //task9
        {
            System.out.println("Задача9");
            //«Месяц …, сумма накоплений равна … рублей».
            int money = 29_000;
            int total = 0;
            double percent = 1D / 100;
            for (int month = 1; month <= 12; month++) {
                total += money;
                total = (int) (total * (1 + percent));
                System.out.println("Месяц " + month + " Итого " + total);
            }
            //task10
            System.out.println("Задача 10");
            {
                for (int i = 2; i <= 20; i += 2) {
                    System.out.println( " 2 * " + i/2 +" = " + i );
                }

            }
        }

    }
}







