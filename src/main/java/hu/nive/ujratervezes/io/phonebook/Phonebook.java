package hu.nive.ujratervezes.io.phonebook;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class Phonebook {
    void exportPhonebook(Map<String, String> contacts, String output) {
        if(contacts == null || output == null) {
            throw new IllegalArgumentException();
        }
        File outputFile = new File(output);
        try (FileWriter fw = new FileWriter(outputFile,true)) {
            for (Map.Entry<String,String> entry : contacts.entrySet()) {
                fw.write(entry.getKey()+": "+entry.getValue() + System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




