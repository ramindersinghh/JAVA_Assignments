package com.assignment11.utility;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class AnalyzeFile {
    static final String OUTPUT_FILE_PATH = "/home/ramins/IdeaProjects/JAVA_Assignments/src/com/assignment11/task11_outputfile.txt";
    Map<Character,Integer> characterOccurrenceCount=new HashMap<>();
    public void startAnalyzing(String filename) throws IOException {
        File file = new File(filename);
        try (
                FileInputStream fileStream = new FileInputStream(file);
                InputStreamReader input = new InputStreamReader(fileStream);
                BufferedReader reader = new BufferedReader(input);
        ) {

            String line;
            characterOccurrenceCount.clear();
            // Reading line by line from the
            // file until a null is returned
            while ((line = reader.readLine()) != null) {
                char[] charArray = line.toCharArray();
                for (char currentChar : charArray) {
                    if (Character.isLetter(currentChar)) {
                        char chLower = Character.toLowerCase(currentChar);
                    /*
                    if(characterOccurrenceCount.containsKey(chLower)){
                        characterOccurrenceCount.put(chLower, characterOccurrenceCount.get(chLower)+1);
                    }
                    */
                        int count = characterOccurrenceCount.containsKey(chLower) ? characterOccurrenceCount.get(chLower) : 0;
                        characterOccurrenceCount.put(chLower, count + 1);
                    }
                }
            }
            writeOutputToFile();
        }
    }
    private void writeOutputToFile() {
        // new file object
        File file = new File(OUTPUT_FILE_PATH);

        try (// create new BufferedWriter for the output file
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            ){

            // iterate map entries
            for (Map.Entry<Character, Integer> entry :
                    characterOccurrenceCount.entrySet()) {

                // put key and value separated by a colon
                bufferedWriter.write(entry.getKey() + ":" + entry.getValue());

                // new line
                bufferedWriter.newLine();
            }

            bufferedWriter.flush();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}


