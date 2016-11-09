
package copycaracteres2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Copycaracteres2 {


    public static void main(String[] args) throws IOException {
       File texto12 = new File("/home/local/DANIELCASTELAO/plago-bergonpazos/NetBeansProjects/copycaracteres2/texto12.txt");
       texto12.createNewFile();
       BufferedReader texto12b = new BufferedReader(new FileReader("/home/local/DANIELCASTELAO/plago-bergonpazos/NetBeansProjects/copycaracteres2/texto13.txt"));
       FileWriter texto12a = new FileWriter(texto12);
                      
       for(int i = 0; i<3;i++){
       texto12a.write(texto12b.readLine()+"\n");        
       }
       texto12b.close();
       texto12a.close();
    }   
}
