/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.List;

/**
 *
 * @author Radwa
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        pyramidsDAO pDAO=new pyramidsDAO();
		List<pyramids>pyramids;
        pyramids = pDAO.readPyramidsFromCSV("pyramids.csv");
		
        pyramids.forEach((p) -> {
            System.out.println(p);
        });}
    

