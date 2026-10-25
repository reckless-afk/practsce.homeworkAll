package semestr1.practice5;

import java.util.Arrays;
import java.util.Scanner;
public class Practice5 {
    public static void main(String[] argst) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Завдаяння 1 мазафака");
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(" " + numbers[i]);
        }
        System.out.println();
        numbers[0] = 10;
        numbers[2] = 30;
        numbers[4] = 50;
        System.out.println(Arrays.toString(numbers));

        System.out.println("Завдаяння 2 мазафака");
        String[] days = {
                "Понеділок", "Вівторок", "Середа", "Четвер", "П'ятниця", "Субота", "Неділя"
        };
        System.out.println(days.length);
        System.out.print(days[0] + "; ");
        System.out.println(days[6]);
        for (int i = 0; i < 7; i++) ;
        days[5] = "Вихідний (Сб)";
        days[6] = "Вихідний (Нд)";
        System.out.println(Arrays.toString(days));

        System.out.println("Завдаяння 3 мазафака");
        double[] prices = {120.50, 45.00, 890.99, 15.30, 420.00};
        System.out.println("Початкові ціни:");
        System.out.println(Arrays.toString(prices));
        prices[2] = prices[2] * 0.8;
        System.out.println("Ціни після знижки:");
        System.out.println(Arrays.toString(prices));

        System.out.println("Завдаяння 4 мазафака");

        int number = scanner.nextInt();

        if (number > 0) {
            int[] number1 = new int[number];

            for (int i = 0; i < number1.length; i++) {
                number1[i] = i + 1;
            }
            System.out.println(Arrays.toString(number1));

        } else {
            System.out.println("Ішак, число має бути більше нуля");
        }
        System.out.println("Завдаяння 5 мазафака");

        int[] figure1 = {4, 8, 15, 16, 23, 42};
        for (int i = figure1.length - 1; i >= 0; i--) {
            System.out.print(figure1[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println("Завдаяння 6 мазафака");
        int[] set = new int[10];
        set[0] = 1;
        for (int i = 1; i < 10; i++) {
            set[i] = set[i - 1] * 2;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(set[i]);
        }
        System.out.println();
        System.out.println("Завдаяння 7 мазафака");
        int[] original = {3, 7, 1, 9, 4};
        int[] copy = new int[5];
        for (int i = 1; i < 5; i++) {
            copy[i] = original[i];
        }
        copy[0] = 999;
        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(copy));
        System.out.println("Завдаяння 8 мазафака");
        int[] grades = {95, 84, 70, 99, 65, 88, 92};
        int sum = 0;
        double medium;
        for (int i = 0; i < grades.length; i++) {
            sum = sum + grades[i];
        }
        medium = (double) sum / grades.length;
        System.out.println("Сума: " + sum + "," + "Середній бал: " + medium);

        System.out.println("Завдання 9 мазафака");
        int[] temps = {18, 21, 15, 24, 13, 27, 20};
        int min = temps[0];
        int max = temps[0];
        String[] days1 = {"Понеділок", "Вівторок", "Середа", "Четвер", "П'ятниця", "Субота", "Неділя"};
        for (int i = 1; i < temps.length; i++) {
            if (temps[i] < min) {
                min = temps[i];
            }
            if (temps[i] > max) {
                max = temps[i];
            }
        }
        System.out.println("Мінімальна температура: " + min);
        System.out.println("Максимальна температура: " + max);
        System.out.println("Завдання 10 мазафака");
        int[] data = {12, -5, 0, 43, -19, 0, -2, 8, 0, 15};
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > 0) {
                positive++;
            }
            if (data[i] < 0) {
                negative++;
            }
            if (data[i] == 0) {
                zero++;
            }
        }
        System.out.println("Додатнє: " + positive + "," + "Від'ємне: " + negative + "," + "Нульове: " + zero + ",");

        System.out.println("Завдання 11 мазафака");
        int[] numeric = {10, 20, 11, 62, 45, 71, 2, 128, 1, 19};
        int evenCount = 0;
        int oddSum = 0;

        for (int i = 0; i < numeric.length; i++) {
            if (numeric[i] % 2 == 0) {
                evenCount++;
            }
            if (numeric[i] % 2 != 0) {
                oddSum = oddSum + numeric[i];
            }
        }
        System.out.println("Кількість парних: " + evenCount);
        System.out.println("Сума непарних: " + oddSum);

        System.out.println("Завдання 12 мазафака");
        int[] students = {1042, 2031, 3055, 4018, 5099};

        System.out.println("Ведіть номер кімнати: ");
        int position = 0;
        int nunber = scanner.nextInt();
        for (int i = 0; i < students.length; i++) {
            if (number == students[i]) {
                position = i;
                break;
            }
        }
        if (position != -1) {
            System.out.println("Студент знайдений. Індекс: " + position);
        } else {
            System.out.println("Студента з таким номером не знайдено");
        }

        System.out.println("Завдання 13 мазафака");
        int[] rolls = {3, 6, 2, 6, 1, 4, 6, 5, 2, 6};
        System.out.println("Виберіть число від 1 до 6: ");
        int result1 = 0;
        int question = scanner.nextInt();
        for (int i = 0; i < rolls.length; i++) {
            if (question == rolls[i]) {
                result1++;
            }
            System.out.println("Число випало " + result1 + " разів");
        }
        System.out.println("Завдання 14 мазафака");
        int medium1 = 0;
        int[] salaries = {18000, 25000, 32000, 15000, 41000, 29000};
        for (int i = 0; i < salaries.length; i++) {
            medium1 = medium1 + salaries[i];
        }
        medium1 = medium1 / salaries.length;

        System.out.println("Середня зарплата: " + medium1);

        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] > medium1) {
                System.out.println(salaries[i]);
            }
        }

        System.out.println("Завдання 15 мазафака");
        double[] prices1 = {42.5, 41.8, 44.1, 40.9, 43.6, 45.0};
        double max1 = prices1[0];
        double min1 = prices1[0];
        double difference;
        for (int i = 0; i < prices1.length; i++) {
            if (prices1[i] > max) {
                max1 = prices1[i];
            }
            if (prices[i] < min1) {
                min1 = prices[i];
            }
            difference = (double) max1 - min1;

            System.out.println(difference);
        }
        System.out.println("Завдання 16 мазафака");
        String[] cities = {"Київ", "Львів", "Харків", "Одеса", "Дніпро"};

        for (String city : cities) {
            System.out.println("Ласкаво просимо до міста " + city + "!");
        }
        System.out.println("Завдання 17 мазафака");
        double[] salaries1 = {20000.0, 25000.0, 18000.0, 30000.0};
        for (int i = 0; i < salaries1.length; i++) {
            salaries1[i] *= 1.10;
            System.out.println(salaries1.toString());
        }
        System.out.println("Завдання 18 мазафака");
        int[] arr = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Завдання 19 мазафака");
        int[] base = {2, 4, 6, 8, 10};
        int[] squares = new int[5];
        for (int i = 0; i < base.length; i++) {
            squares[i] = base[i] * base[i];
            System.out.println(Arrays.toString(base));
            System.out.println(Arrays.toString(squares));
        }
        System.out.println("Завдання 20 мазафака ");
        int[] arr2 = {4, 1, 6, 7, 8};
        boolean isSorted = true;
        for (int i = 0; i < arr2.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        System.out.println(isSorted);
        System.out.println("Завдання 21 мазафака ");
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6, 7};
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }

        System.out.println("Завдання 22 мазафака ");
        int[] test = {45, 12, 89, 3, 27};
        System.out.println(Arrays.toString(test));
        Arrays.sort(test);
        System.out.println(Arrays.toString(test));
        Arrays.fill(test, -1);
        System.out.println(Arrays.toString(test));

        System.out.println("Завдання 23 мазафака ");
        int[][] table = new int[3][3];
        table[0][0] = 1;
        table[0][1] = 2;
        table[0][2] = 3;
        table[1][0] = 4;
        table[1][1] = 5;
        table[1][2] = 6;
        table[2][0] = 7;
        table[2][1] = 8;
        table[2][2] = 9;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Завдання 24 мазафака ");
        int[][] matrix = {
                {10, 20, 30, 40},
                {50, 60, 70, 80}};
        System.out.println("Кількість рядків: " + matrix.length);
        System.out.println("Кількість стовпців: " + matrix[0].length);

        System.out.println("Лівий верхній: " + matrix[0][0]);
        System.out.println("Правий верхній: " + matrix[0][3]);
        System.out.println("Лівий нижній: " + matrix[1][0]);
        System.out.println("Правий нижній: " + matrix[1][3]);

        System.out.println("Завдання 25 мазафака ");
        int[][] grid = new int[3][4];
        int counter = 1;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = counter;
                counter = counter + 1;
                System.out.print(grid[i][j] + "\t");
            }
            System.out.println();

        }
        System.out.println("Завдання 26 мазафака ");
        int[][] randomGrid = new int[4][3];
        for (int i = 0; i < randomGrid.length; i++) {
            for (int j = 0; j < randomGrid[i].length; j++) {
                int number2 = (int) (Math.random() * 90) + 10;
                randomGrid[i][j] = number2;
            }

        }
        System.out.println(Arrays.deepToString(randomGrid));

        for (int i = 0; i < randomGrid.length; i++) {
            for (int j = 0; j < randomGrid[i].length; j++) {
                System.out.print(randomGrid[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Завдання 27 мазафака");

        int[][] multTable = new int[9][9];

        for (int i = 0; i < multTable.length; i++) {
            for (int j = 0; j < multTable[i].length; j++) {
                multTable[i][j] = (i + 1) * (j + 1);
                System.out.print(multTable[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Завдання 28 мазафака");
        int[][] matrix1 = new int[5][5];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                if (i == j) {
                    matrix1[i][j] = 1;
                }
                System.out.print(matrix1[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Завдання 28 мазафака");
        int[][] matrix2 = new int[4][4];
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[1][j] = 0;


                System.out.print(matrix1[i][j] + "\t");
            }
        }
        System.out.println("Завдання 29 мазафака");
        int[][] matrix3 = new int[4][4];
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[i].length; j++) {
                matrix3[i][j] = 1;
                matrix3[1][j] = 0;
                matrix3[i][2] = 7;

                System.out.print(matrix3[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Завдання 30 мазафака");
        int[][] matrixq = new int[3][3];
        int sum1 = 0;
        for (int i = 0; i < matrixq.length; i++) {
            for (int j = 0; j < matrixq[i].length; j++) {
                sum1 = sum1 + matrixq[i][j];

            }
        }
        int count = 3 * 3;
        double medium2 = (double) sum1 / count;
        System.out.println("Сума: " + sum1);
        System.out.println("Кількість елементів: " + count);
        System.out.println("Середнє значення: " + medium2);

        System.out.println("Завдання 31 мазафака");
        int[][] matrix4 = new int[3][4];
        int[] rowSums = new int[3];
        int sum2 = 0;
        for (int i = 0; i < matrix4.length; i++) {
            for (int j = 0; j < matrix4[i].length; j++) {
                sum2 = sum2 + matrix4[i][j];
            }
            rowSums[i] = sum2;
        }
        for (int i = 0; i < rowSums.length; i++) {
            System.out.println("Рядок " + i + ": сума = " + rowSums[i]);
        }

        System.out.println("Завдання 32 мазафака");
        int[][] matrix5 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int row = 0; row < matrix5.length; row++) {
            for (int col = 0; col < matrix5[row].length; col++) {
                System.out.print(matrix5[row][col] + "\t");
            }
            System.out.println();
        }
        for (int col = 0; col < matrix5[0].length; col++) {
            int sum3 = 0;
            for (int row = 0; row < matrix5.length; row++) {
                sum3 = sum3 + matrix5[row][col];
            }
            System.out.print(sum3 + "\t");
        }
        System.out.println("Завдання 33 мазафака");
        int[][] matrix6 = {{1, -3, -8, 6}, {2, -5, 9, 8}, {1, -4, 3, 6}};
        int max2 = matrix6[0][0];
        int maxRow = 0;
        int maxCol = 0;
        for (int row = 0; row < matrix6.length; row++) {
            for (int col = 0; col < matrix6[row].length; col++) {
                if (matrix6[row][col] > max2) {
                    max2 = matrix6[row][col];
                    maxRow = row;
                    maxCol = col;
                }
            }
        }

        System.out.println("Завдання 34 мазафака");
        int[][] matrix7 = {{1, 6, -5, 1}, {3, 8, -1, 4}, {2, -5, -3, 1}, {1, 7, -8, 9}};
        int sumMain = 0;
        int sumSecondary = 0;
        for (int row = 0; row < matrix7.length; row++) {
            for (int col = 0; col < matrix7[row].length; col++) {
                if (row == col) {
                    sumMain = sumMain + matrix7[row][col];
                }
                if (row + col == matrix7.length - 1) {
                    sumSecondary = sumSecondary + matrix7[row][col];
                }
            }
        }
        System.out.println("Сума головної діагоналі: " + sumMain);
        System.out.println("Сума побічної діагоналі: " + sumSecondary);

        System.out.println("Завдання 35 мазафака");
        int[][] matrix8 = {
                {1, 6, -5},
                {3, 8, -1},
                {2, -5, -3}
        };
        int[][] transposed = new int[3][3];
        for (int i = 0; i < matrix8.length; i++) {
            for (int j = 0; j < matrix8[i].length; j++) {
                transposed[j][i] = matrix8[i][j];
            }
        }
        System.out.println("Початкова матриця\t\tТранспонована матриця");
        for (int i = 0; i < matrix8.length; i++) {
            for (int j = 0; j < matrix8[i].length; j++) {
                System.out.print(matrix8[i][j] + "\t");
            }
            System.out.print("\t");
            for (int j = 0; j < transposed[i].length; j++) {
                System.out.print(transposed[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Завдання 36 мазафака");
        int[][] ladder = new int[4][];
        ladder[0] = new int[1];
        ladder[1] = new int[2];
        ladder[2] = new int[3];
        ladder[3] = new int[4];
        for (int i = 0; i < ladder.length; i++) {
            for (int j = 0; j < ladder[i].length; j++) {
                ladder[i][j] = i;
                System.out.print(ladder[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Завдання 37 мазафака");
        String[][] weekSchedule = new String[5][];

        weekSchedule[0] = new String[]{"Вища математика", "Основи програмування", "Фізика"};
        weekSchedule[1] = new String[]{"Англійська мова", "Історія України"};
        weekSchedule[2] = new String[]{"Основи програмування", "Основи програмування", "Бази даних", "Фізвиховання"};
        weekSchedule[3] = new String[]{"Дискретна математика"};
        weekSchedule[4] = new String[]{"Філософія", "Основи алгоритмізації", "Практикум"};

        String[] days2 = {"Понеділок", "Вівторок", "Середа", "Четвер", "П'ятниця"};

        for (int i = 0; i < weekSchedule.length; i++) {
            System.out.println(days2[i] + " — " + weekSchedule[i].length + " пари");

            for (int j = 0; j < weekSchedule[i].length; j++) {
                System.out.println(weekSchedule[i][j]);
            }
        }

        System.out.println("Завдання 38 мазафака");
        int[][] pascal = new int[5][];
        for (int i = 0; i < pascal.length; i++) {
            pascal[i] = new int[i + 1];
            for (int j = 0; j < pascal[i].length; j++) {
                if (j == 0 || j == pascal[i].length - 1) {
                    pascal[i][j] = 1;
                } else {
                    pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                }
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Завдання 39 мазафака");

        int[][][] cube = new int[3][3][3];

        for (int x = 0; x < cube.length; x++) {
            for (int y = 0; y < cube[x].length; y++) {
                for (int z = 0; z < cube[x][y].length; z++) {
                    cube[x][y][z] = x + y + z;
                }
            }
        }

        for (int x = 0; x < cube.length; x++) {
            System.out.println("--- Шар " + x + " ---");

            for (int y = 0; y < cube[x].length; y++) {
                for (int z = 0; z < cube[x][y].length; z++) {
                    System.out.print(cube[x][y][z] + " ");
                }

                System.out.println();
            }
        }
        System.out.println("Завдання 40 мазафака");
        double[][][] weather = new double[3][7][2];
        String[] cities1 = {"Київ", "Львів", "Одеса"};
        String[] daysWeather = {
                "Понеділок", "Вівторок", "Середа",
                "Четвер", "П'ятниця", "Субота", "Неділя"};
        for (int city = 0; city < cities1.length; city++){
            for (int day = 0; day < weather[city].length; day++) {
                weather[city][day][0] = 20 + city + day;
                weather[city][day][1] = 10 + city + day;
            }
        }
        for (int city = 0; city < weather.length; city++) {
            System.out.println("--- " + cities[city] + " ---");

            for (int day = 0; day < weather[city].length; day++) {
                System.out.println(daysWeather[day]
                        + ": день " + weather[city][day][0] + "°C"
                        + ", ніч " + weather[city][day][1] + "°C");
            }
        }
    }
}





























