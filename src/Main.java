public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    /**
     * Бухгалтеры попросили посчитать сумму всех выплат за месяц.
     * Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате:
     * «Сумма трат за месяц составила … рублей».
     */
    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.printf("Сумма трат за месяц составила %d рублей\n", sum);
    }

    /**
     * Также бухгалтерия попросила найти минимальную и максимальную трату за день.
     * Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате:
     * «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».
     */
    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int minArr = 200_001;
        int maxArr = -1;
        for (int i = 0; i < arr.length; i++) {
            final int current = arr[i];
            if (current < minArr) {
                minArr = current;
            }
            if (current > maxArr) {
                maxArr = current;
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день составила %d рублей\n", minArr, maxArr);
    }

    /**
     * Теперь бухгалтерия хочет понять, какую в среднем сумму компания тратила в течение 30 дней.
     * Напишите программу, которая посчитает среднее значение трат за месяц
     * (то есть сумму всех трат за месяц поделить на количество дней), и выведите в консоль результат в формате:
     * «Средняя сумма трат за месяц составила … рублей».
     */
    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        int sum = 0;
        int days = 30;
        double averageSum = 0;
        for (int j : arr) {
            sum = sum + j;
        }
        averageSum = (double) sum / days;
        System.out.printf("Средняя сумма трат за месяц составила %f рублей\n",averageSum);
    }

    /**
     * Напишите код, который в случае такого бага будет выводить фамилии и имена сотрудников в корректном виде.
     * В результате в консоль должно быть выведено: Ivanov Ivan.
     * не используйте дополнительные массивы для решения этой задачи. Необходимо корректно пройти по массиву циклом и
     * распечатать его элементы в правильном порядке.
     */
    public static void task4() {
        System.out.println("Задача 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }




}