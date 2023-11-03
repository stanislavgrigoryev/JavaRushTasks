package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes types) {
        ImageReader reader = null;
        if (types == null) {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
        switch (types) {
            case PNG:
                reader = new PngReader();
                break;
            case BMP:
                reader = new BmpReader();
                break;
            case JPG:
                reader = new JpgReader();
                break;
        }
        return reader;
    }
}
