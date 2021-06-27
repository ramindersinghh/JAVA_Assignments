package com.assignment11.main;

import com.assignment11.utility.AnalyzeFile;

import java.io.*;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter filename with Path to count characters(Enter exit to end) :");
        String fileName= scanner.nextLine();
        //"C:\\Users\\Mayank\\Desktop\\1.txt"
        fileName="/home/ramins/IdeaProjects/JAVA_Assignments/src/com/assignment11/task11_inputfile.txt";
        AnalyzeFile analyzeFile=new AnalyzeFile();
        while(!fileName.equals("exit")) {
            analyzeFile.startAnalyzing(fileName);
            fileName = scanner.nextLine();
        }
    }
}
/*
The HashMap class in Java implements the Serializable interface so that its objects can be written or serialized to a file using the ObjectOutputStream. However, the output file it produces is not in the human-readable format and may contain junk characters.

Serialization: It is a process of writing an Object into a file along with its attributes and content. It internally converts the object into a stream of bytes.

De-Serialization: It is a process of reading the Object and its properties from a file along with the Object’s content.

If we want to write a HashMap object to a plain text file, we need a simple and understandable code to write on the HashMap and then insert the Map into the Text File. We can write the code in the form of key-Value Pair of a map Object to a File and each line File will contain the Key-Value Pair
 */
/*
a:169
b:24
c:78
d:45
e:201
f:41
g:41
h:52
i:121
j:21
k:13
l:100
m:81
n:149
o:120
p:73
q:13
r:116
s:78
t:197
u:98
v:41
w:27
x:2
y:16

 */