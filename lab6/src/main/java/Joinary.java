
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import joinery.DataFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author original
 */
public class Joinary {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        //Joinery on integer columns
        String path ="titanic.csv";
        System.out.println("Joinery");
        DataFrame<Object>  df;
        try {
            
            //Joinary on integer data
            df = DataFrame.readCsv (path)
                    .retain("survived","age","sibsp","parch","ticket","fare");
                    
            
            //Mean
            System.out.println("Mean :");
            df.mean().iterrows ().forEachRemaining (System.out::println);
            
            //min
            System.out.println("Min :");
            df.min().iterrows ().forEachRemaining (System.out::println);
            
            //max
            System.out.println("Min :");
            df.max().iterrows ().forEachRemaining (System.out::println);
            
            //standard deviation
            System.out.println("standard deviatio :");
            df.stddev().iterrows ().forEachRemaining (System.out::println);
            
        } catch (IOException ex) {
            Logger.getLogger(Joinary.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
}
