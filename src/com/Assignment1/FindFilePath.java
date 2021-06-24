package com.Assignment1;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

public class FindFilePath {
    public static void main(String[] args) throws IOException {
        // Search through the home directory
        Path startDir = Paths.get("/home/ramins");

        //take pattern input in loop
        Scanner sc=new Scanner(System.in);

        String pattern = "*.{txt,doc}";
        while(!pattern.equals("exit")){
            pattern=sc.next();
            FileSystem fs = FileSystems.getDefault();
            final PathMatcher matcher = fs.getPathMatcher("glob:" + pattern);

            FileVisitor<Path> matcherVisitor = new SimpleFileVisitor<>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attribs) {
                    Path name = file.getFileName();
                    if (matcher.matches(name)) {
                        System.out.print(String.format("Found matched file: '%s'.%n", file));
                    }
                    return FileVisitResult.CONTINUE;
                }
            };
            Files.walkFileTree(startDir, matcherVisitor);
        }
    }
}
/*

 */