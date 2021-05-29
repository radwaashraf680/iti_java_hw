
import java.io.IOException;
import java.util.List;
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
 * @author radwa
 */
public class DataFrame_Op {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        String path ="titanic.csv";
        try {
            
            DataFrame<Object> df_1 = DataFrame.readCsv (path).retain("name","sex");
            
            DataFrame<Object> df_2 = DataFrame.readCsv (path).retain("home.dest");
            
            
            //Join Two DataFrames
            DataFrame<Object> join= df_1.join(df_2,DataFrame.JoinType.INNER);
            System.out.println("DataFrame After Joining : ");
            System.out.println(join);
           
            
            //add new
            List<Object> embarkedColumn =DataFrame.readCsv (path).col("embarked");
            DataFrame<Object> new_df = df_1.add("embarked", embarkedColumn );
            System.out.println("DataFrame After adding column (embarked) : ");
            System.out.println(new_df);
            
        } catch (IOException ex) {
            Logger.getLogger(DataFrame_Op.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
