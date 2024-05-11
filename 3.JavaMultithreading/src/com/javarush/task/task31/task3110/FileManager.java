package com.javarush.task.task31.task3110;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.util.ArrayList;
import java.util.List;

public class FileManager extends SimpleFileVisitor<Path> {
    private Path rootPath;
    private List<Path> fileList;

    public FileManager(Path rootPath) throws IOException {
        this.rootPath = rootPath;
        this.fileList = new ArrayList<>();
        collectFileList(this.rootPath);
    }


    public List<Path> getFileList() {
        return fileList;
    }

    private void collectFileList(Path path) throws IOException {
        if (Files.isRegularFile(path)) {
            Path relativize = rootPath.relativize(path);
            fileList.add(relativize);
        }

        if (Files.isDirectory(path)) {
            DirectoryStream<Path> paths = Files.newDirectoryStream(path);
            for (Path path1 : paths) {
                collectFileList(path1);
            }
            paths.close();
        }

    }
}
