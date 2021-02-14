/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Event;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class TextFileReader {
    ArrayList<String> result = new ArrayList<>();
    public TextFileReader(){
        
    }
    public ArrayList getAllData() {
    	try (BufferedReader br = new BufferedReader(new FileReader("./src/Event/EventDatabase.txt"))) {

            while (br.ready()) {
                result.add(br.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	      return result;
      }
}
