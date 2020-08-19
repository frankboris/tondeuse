package com.syndie.pelouse;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Util {
    public static List<String> getFileContent(String filePath) {
        List<String> fileLines = new ArrayList<>();
        try
        {
            // Le fichier d'entrée
            File file = new File(filePath);

            // Créer l'objet File Reader
            FileReader fr = new FileReader(file);

            // Créer l'objet BufferedReader
            BufferedReader br = new BufferedReader(fr);
            /* Lecture d'une ligne */
            String ligneLue = br.readLine();
            while(ligneLue!=null){
                fileLines.add(ligneLue.trim());
                ligneLue = br.readLine();
            }
            fr.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        return fileLines;
    }
}
