package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {


    public static void main(String[] args) throws IOException {
        File f =new File("E:\\下载");
        for(File temp:f.listFiles()){
            if(temp.isFile()){
                System.out.println(temp.getName());
            }
        }

        Path initPath = Paths.get("E:\\照片");
        Files.walkFileTree(initPath, new SimpleFileVisitor<Path>() {

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException

            {
                System.out.println(file.getFileName().toString());
                return FileVisitResult.CONTINUE;
            }

        });
    }
}
