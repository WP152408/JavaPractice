package org.dimigo.io;
/**
 * 
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class ArakoMenu {
      public static void main(String[] args) {
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter writer = new BufferedWriter(new FileWriter("files/menu.txt"));
      BufferedReader reader = new BufferedReader(new FileReader("files/menu.txt"))) {
         
         String data;
         while((data = br.readLine()) != null) {
         writer.write(data);
         writer.newLine();
         }
         
         writer.flush();
      System.out.println("<< 메뉴 출력 >>");

      
      
      while((data = reader.readLine()) != null) {
      System.out.println(data);
      }
      
      
      
      } catch (Exception e) {
      e.printStackTrace();
      }
      }
}
