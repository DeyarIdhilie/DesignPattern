/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author lenovo
 */
public class Google implements Strategy{
  
  
    @Override
    public String parse(BufferedReader reader) {
       
           try{
		    StringBuffer buffer = new StringBuffer();
		    String line = null;
		   
		    while ((line = reader.readLine()) != null) {
		    	
		    	buffer.append(line.replace('-', ':'));
		    	
		    	buffer.append("\n");
		    }
		    
                    return buffer.toString();
                 
                 
		} 
                catch (IOException x) {
		    System.err.format("IOException: %s%n", x);
		}
       return null;
    }
    
}
