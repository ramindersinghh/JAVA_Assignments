package com.assignment1.utility;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class MatchPattern {
    private boolean fileFound=false;
    public void findFile(Path startDir, String pattern) throws IOException {
            FileSystem fs = FileSystems.getDefault();
            final PathMatcher matcher = fs.getPathMatcher("glob:*" + pattern +"*");

            FileVisitor<Path> matcherVisitor = new SimpleFileVisitor<>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attribs) {
                    Path name = file.getFileName();
                    if (matcher.matches(name)) {
                        System.out.print(String.format("Found matched file: '%s'.%n", file));
                        fileFound=true;
                    }
                    return FileVisitResult.CONTINUE;
                }
            };
            Files.walkFileTree(startDir, matcherVisitor);
            if(!fileFound)
                System.out.println("No Files found with given input pattern");
        }
}
