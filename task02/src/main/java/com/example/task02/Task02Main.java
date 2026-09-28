package com.example.task02;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл src/test/resources/input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с src/test/resources/expected.test
        // то же самое делает тест main_testFiles
        //InputStream inputStream = new ByteArrayInputStream(Files.readAllBytes(Path.of("C:\\Users\\stryg\\IdeaProjects\\7-java-io\\task02\\src\\test\\resources\\input.test")));
        //ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;

        int read = inputStream.read();
        int next = inputStream.read();

        while (next >= 0) {
            if (read == 13 && next == 10) {
                outputStream.write(next);
                read = inputStream.read();
                next = inputStream.read();
            } else {
                outputStream.write(read);
                read = next;
                next = inputStream.read();
            }
        }

        if (read >= 0) {
            outputStream.write(read);
        }
        //Files.write(Path.of("C:\\Users\\stryg\\IdeaProjects\\7-java-io\\task02\\src\\test\\resources\\output.test"), outputStream.toByteArray());
        outputStream.flush();
    }
}