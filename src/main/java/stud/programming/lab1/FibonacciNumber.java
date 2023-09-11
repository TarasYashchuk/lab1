package stud.programming.lab1;

/**
 * Клас FibonacciNumber представляє об'єкт для обчислення чисел Фібоначчі та перевірки умови: F<sub>(n+2)</sub> &lt; 2<sup>n</sup>
 */
public class FibonacciNumber {

    /**
     * Значення першого числа Фібоначчі.
     */

    private long n1;

    /**
     * Значення другого числа Фібоначчі.
     */
    private long n2;

    /**
     * Конструктор класу FibonacciNumber, який ініціалізує початкові значення для чисел Фібоначчі.
     *
     * @param n1 Початкове значення першого числа Фібоначчі.
     * @param n2 Початкове значення другого числа Фібоначчі.
     */

    public FibonacciNumber(long n1, long n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    /**
     * Встановлює початкове значення першого числа Фібоначчі.
     *
     * @param n1 Початкове значення першого числа Фібоначчі.
     */

    public void setN1(long n1) {
        this.n1 = n1;
    }

    /**
     * Встановлює початкове значення другого числа Фібоначчі.
     *
     * @param n2 Початкове значення другого числа Фібоначчі.
     */

    public void setN2(long n2) {
        this.n2 = n2;
    }

    /**
     * Метод обчислює n-те число Фібоначчі за допомогою циклу.
     *
     * @param number число Фібоначчі, яке потрібно обчислити.
     * @return n-те число Фібоначчі.
     */

    public long calculateNumber(int number) {

        if (number <= 1) {
            return number;
        }
        long n3 = 0;
        for (int i = 2; i <= number; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n3;
    }

    /**
     * Метод перевіряє умову F<sub>(n+2)</sub> &lt; 2<sup>n</sup> та виводить відповідне повідомлення.
     *
     * @param number число Фібоначчі для перевірки умови.
     */

    public void checkNumber(int number) {
        long nNumber = calculateNumber(number + 2);
        double secondNumber = Math.pow(2.0, number);
        if (nNumber < secondNumber) {
            System.out.println("Умова F(n+2) < 2^n виконується");
        } else {
            System.out.println("Умова F(n+2) >= 2^n");
        }
    }
}
