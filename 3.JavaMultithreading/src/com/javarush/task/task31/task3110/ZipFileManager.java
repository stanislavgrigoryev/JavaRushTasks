package com.javarush.task.task31.task3110;

import com.javarush.task.task31.task3110.exception.PathIsNotFoundException;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFileManager {
    private Path zipFile;

    public ZipFileManager(Path zipFile) {

        this.zipFile = zipFile;
    }

    public void createZip(Path source) throws Exception {
        // Проверяем, существует ли директория, где будет создаваться архив
        // При необходимости создаем ее
        Path zipDirectory = zipFile.getParent();
        if (Files.notExists(zipDirectory))
            Files.createDirectories(zipDirectory);

        // Создаем zip поток
        try (ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(zipFile))) {

            if (Files.isDirectory(source)) {
                // Если архивируем директорию, то нужно получить список файлов в ней
                FileManager fileManager = new FileManager(source);
                List<Path> fileNames = fileManager.getFileList();

                // Добавляем каждый файл в архив
                for (Path fileName : fileNames)
                    addNewZipEntry(zipOutputStream, source, fileName);

            } else if (Files.isRegularFile(source)) {

                // Если архивируем отдельный файл, то нужно получить его директорию и имя
                addNewZipEntry(zipOutputStream, source.getParent(), source.getFileName());
            } else {

                // Если переданный source не директория и не файл, бросаем исключение
                throw new PathIsNotFoundException();
            }
        }
    }

    private void addNewZipEntry(ZipOutputStream zipOutputStream, Path filePath, Path fileName) throws Exception {
        Path resolve = filePath.resolve(fileName);
        try (InputStream inputStream = Files.newInputStream(resolve)) {
            ZipEntry zipEntry = new ZipEntry(String.valueOf(fileName));
            zipOutputStream.putNextEntry(zipEntry);
            copyData(inputStream, zipOutputStream);
            zipOutputStream.closeEntry();
        }
    }

    private void copyData(InputStream in, OutputStream out) throws Exception {
        while (in.available() > 0) {
            int read = in.read();
            out.write(read);
        }
    }
}
