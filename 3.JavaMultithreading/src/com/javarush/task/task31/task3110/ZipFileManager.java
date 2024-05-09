package com.javarush.task.task31.task3110;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFileManager {
    private Path zipFile;

    public ZipFileManager(Path zipFile) {
        this.zipFile = zipFile;
    }

    public void createZip(Path source) throws Exception {
        ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(zipFile));
        Path fileName = source.toAbsolutePath().getFileName();
        ZipEntry zipEntry = new ZipEntry(String.valueOf(fileName));
        zipOutputStream.putNextEntry(zipEntry);
        try(InputStream inputStream = Files.newInputStream(source)){
            while (inputStream.available() > 0){
                int read = inputStream.read();
                zipOutputStream.write(read);
            }
        }
        zipOutputStream.closeEntry();
        zipOutputStream.close();
    }
}
