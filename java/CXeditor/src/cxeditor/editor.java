/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cxeditor;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.io.Reader;
import java.io.FileReader;
import java.io.BufferedReader;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.Charset;

import java.math.BigInteger;

public class editor extends Application  {
    static String filePath;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        primaryStage.setTitle("TextArea Experiment 1");

        TextArea textArea = new TextArea();
        
        Button button = new Button("Click to set filePath");
        button.setMinWidth(100);
        
        button.setOnAction(action -> {
            filePath = textArea.getText();
            
            System.out.println("You will be editing: " + filePath);
            
            /*
            BufferedReader fileReader = null;
            
            try{
                
                fileReader = new BufferedReader(new FileReader(filePath));
                
                while(fileReader.read() != -1) {
                    
                }
                
            } catch(IOException e) {
                
            } finally {
                if(fileReader != null) {
                    try{
                        fileReader.close();
                    } catch(IOException g) {
                        System.out.println("Couldn't close fileReader");
                    }
                }
            }
*/
            String s = null;
            try{
                s = new String(Files.readAllBytes(Paths.get(filePath)), Charset.defaultCharset());
            } catch(IOException e) {
                System.out.println(e);
            }
            
            if(s != null) {
                textArea.setText(s);
            } else {
                textArea.setText("");
            }
        });

        Button writer = new Button("Write to file");
        writer.setMinWidth(50);
        
        writer.setOnAction(action -> {
            
            System.out.println("Alright, writing to file");

            Writer fWriter = null;
        
            try{

                fWriter = new FileWriter(filePath, false);

                fWriter.write(textArea.getText());

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
            
            String s = null;
            try{
                s = new String(Files.readAllBytes(Paths.get(filePath)), Charset.defaultCharset());
            } catch(IOException e) {
                System.out.println(e);
            }
            
            if(s != null) {
                textArea.setText(s);
            } else {
                textArea.setText("");
            }
        });

        VBox vbox = new VBox(textArea, button, writer);

        Scene scene = new Scene(vbox, 500, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) throws IOException{
        
        BigInteger l = new BigInteger("313");
        
        hashmap jeff = new hashmap(l);
        
        System.out.println(jeff.getHash("https://en.wikipedia.org/wiki/Fowler%E2%80%93Noll%E2%80%93Vo_hash_function"));
        
//        Application.launch(args);
//        
//        CXFileHandler testReader = new CXFileHandler();
//        
//        testReader.printContent();
        
    }
}
