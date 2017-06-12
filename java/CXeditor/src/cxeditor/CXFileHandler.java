/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cxeditor;

import static cxeditor.editor.filePath;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author root
 */
public class CXFileHandler {
    
    private String filePathTop;
    private String[] content;
    private String charContent;
    
    public CXFileHandler() throws IOException {
        
        filePathTop = open();
        
        charContent = getCharContent(filePathTop);
        
        content = readFile(filePathTop);
        
    }
    
    public CXFileHandler(String fp) throws IOException {
        
        filePathTop = fp;
        
        charContent = getCharContent(filePathTop);
        
        content = readFile(filePathTop);
        
    }
    
    public String getFilePathTop() {
        return filePathTop;
    }
    
    public void setFilePathTop(String newFP) {
        filePathTop = newFP;
    }
    
    public String[] getContent() throws IOException {
        return content;
    }
    
    public String getCharContent(String fp) throws IOException{
        
        String ct = null;
        
        try{
            ct = new String(Files.readAllBytes(Paths.get(fp)), Charset.defaultCharset());
        } catch (IOException e) {
            System.out.println(e);
        }
        
        return ct;
    }
    
    public String open() throws IOException{
        
        BufferedReader pathRead = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the exact fuckin exact path of da fuckin file for u need nigga");
        
        return pathRead.readLine();
        
    }
    
    public String[] readFile(String filePath) throws IOException {
        
        FileReader reader = new FileReader(filePath);
        
        BufferedReader textReader = new BufferedReader(reader);
      
        //Create string array w/ num of lines in file
        String[] textLines = new String[getNumLines(filePath)];
        
        for(int i = 0; i < textLines.length; i++) {
            textLines[i] = textReader.readLine();
        }
        
        textReader.close();
        reader.close();
        
        return textLines;
        
    } 
    
    public void overWriteToFile(String data) {
        
        Writer fWriter = null;
        
        try{
            
            fWriter = new FileWriter(filePathTop, false);
            
            fWriter.write(data);
                    
        } catch(IOException e) {
            
            System.out.println(e);
            
        } finally {
            
            if(fWriter != null) {
                
                try {
                    fWriter.close();
                }
                catch(IOException e) {
                    System.out.println("Failed to close the writer");
                }
            }
            
        }
        
    }
    
    public void appendToFile(String data) {
        
        Writer fWriter = null;
        
        try{
            
            fWriter = new FileWriter(filePathTop, true);
            
            fWriter.write(data);
                    
        } catch(IOException e) {
            
            System.out.println(e);
            
        } finally {
            
            if(fWriter != null) {
                
                try {
                    fWriter.close();
                }
                catch(IOException e) {
                    System.out.println("Failed to close the writer");
                }
            }
            
        }
        
    }
    
    public static int getNumLines(String fp) throws IOException {
        
        BufferedReader re = new BufferedReader(new FileReader(fp));
   
        int numLines = 0;
        
        String g;
        
        while((g = re.readLine()) != null) {
            numLines++;
        }
        
        re.close();
        
        return numLines;
    }
    
    public void printContent() {
        
        for(int i = 0; i < content.length; i++) {
            System.out.println(content[i]);
        }
        
    }
    
}
