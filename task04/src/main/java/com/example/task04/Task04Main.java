package com.example.task04;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл src/test/resources/input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - запустить программу
        // - проверить, что получилось 351.731900
        InputStream inputStream = System.in;
        PrintStream printStream = new PrintStream(System.out);

        double sum = 0.0;

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String token = scanner.next();
            try {
                double value = Double.parseDouble(token);
                sum += value;
            } catch (NumberFormatException e) {

            }
        }

        printStream.printf(Locale.US, "%.6f%n", sum);
        printStream.flush();
    }
}
