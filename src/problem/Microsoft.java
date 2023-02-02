/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problem;

import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author lenovo
 */
public class Microsoft implements Strategy{
  
  
    @Override
    public String parse(BufferedReader reader) {
       
           try{
		    StringBuffer buffer = new StringBuffer();
		    String line = null;
		   
		    while ((line = reader.readLine()) != null) {
			String[] fields = line.split(",");
			buffer.append(fields[0].trim());
			buffer.append(" : ");
			buffer.append(fields[1].trim());
				    	
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
