package com.cts.tws.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cts.tws.exception.VehicleCostEstimationException;
public class ApplicationUtil {
    public static List<String> readFile(String inputfeed) throws
            VehicleCostEstimationException {

        List<String> motorProjects = new ArrayList<String>();

// TYPE YOUR CODE HERE
        final String COMMADELIMITER = ",";
// FILL THE CODE HERE
        Scanner myReader = null;
        try {
            File myObj = new File(inputfeed);
            myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String line=myReader.nextLine();
                String inputLine[]=line.split(COMMADELIMITER);
                try {
                    motorProjects.add(line);
//System.out.println(line);
                } catch (Exception e) {
// TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            myReader.close();
        }
        return motorProjects;
    }

}