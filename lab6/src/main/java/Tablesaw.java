
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import tech.tablesaw.api.Table;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author original
 */
public class Tablesaw {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        String path ="titanic.csv";
       
        //Tablesaw
        Table data;
        try {
            data = Table.read ().csv (path);
            System.out.println("Structure of data :"+ data.structure());
            System.out.println("---------------------------------------------------------\n");
            System.out.println("Summary of data :"+ data.summary ());
            System.out.println("---------------------------------------------------------\n");

        } catch (IOException ex) {
            Logger.getLogger(Tablesaw.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
        
    }

   
}
