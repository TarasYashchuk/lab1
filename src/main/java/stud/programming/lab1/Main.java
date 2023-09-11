package stud.programming.lab1;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Головний клас програми для обчислення та перевірки числа Фібоначчі.
 */
public class Main {
    /**
     * Головний метод програми, який виконує обчислення та перевірку числа Фібоначчі.
     * @param args Аргументи командного рядка (не використовуються в цій програмі).
     */
    public static void main(String[] args) {


        int number = 0;
        boolean validInput = false;

        // Контроль введення
        while (!validInput) {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Введіть значення N: ");
                number = scanner.nextInt();
                validInput = true; // Введення валідне, виходимо з циклу
            } catch (RuntimeException e) {
                System.out.println("Помилка: Ви ввели некоректне значення. Введіть ціле число.");
               // scanner.nextLine(); // Очистити буфер введення
            }
        }

        // Створюємо об'єкт класу FibonacciNumber з початковими значеннями
        FibonacciNumber fibonacciNumber = new FibonacciNumber(0,1);
        // Викликаємо метод для перевірки числа Фібоначчі та виведення результату
        fibonacciNumber.checkNumber(number);
    }
}
