package com.cts.mkm.util;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import com.cts.mkm.exception.MkmOrderException;
public class ApplicationUtil {
    public static List<String> readFile(String fileName) throws MkmOrderException {
        List<String> MkmOrderList = new ArrayList<String>();
// FILL THE CODE HERE
        Scanner myReader = null;
        try {
            File myObj = new File(fileName);
            myReader = new Scanner(myObj);
            readFile(fileName);
            while (myReader.hasNextLine()) {
                String line=myReader.nextLine();
                String[] inputLine =line.split(",");
                try {
                    if(inputLine[7].equalsIgnoreCase("Approved")&&checkIfValidOrder(
                            ApplicationUtil.convertStringToDate(inputLine[2]),ApplicationUtil.convertStringToDate(inputLine[4]),inputLine[0]))
                    {
                        MkmOrderList.add(line);
                    }else {
                        System.out.println("Not Eligible");
                    }}
                catch (NumberFormatException e) {
// TODO Auto-generated catch block
                    e.printStackTrace();
                }}}
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            assert myReader != null;
            myReader.close();
        }
        return MkmOrderList;
    }
    public static java.sql.Date convertUtilToSqlDate(java.util.Date uDate) {
        return new java.sql.Date(uDate.getTime());
    }
    public static Date convertStringToDate(String inDate) {
// Fill the code
        SimpleDateFormat formatter2=new SimpleDateFormat("yyyy-MM-dd");
        Date bithdate=null;
        try {
            bithdate=formatter2.parse(inDate);
        } catch (ParseException e) {
            e.printStackTrace();
        } return bithdate;
    }
    public static boolean checkIfValidOrder(Date dtOfOrder, Date dtOfDelivery, String manager) {
        boolean orderValidity = false;
// Fill the code
        long dateBeforeInMs = dtOfOrder.getTime();
        long dateAfterInMs = dtOfDelivery.getTime();
        long timeDiff = Math.abs(dateAfterInMs - dateBeforeInMs);
        long daysDiff = TimeUnit.DAYS.convert(timeDiff, TimeUnit.MILLISECONDS);
        int daysDiff1 = (int) (daysDiff / (1000 * 60 * 60 * 24));
        if(daysDiff<=10)
            orderValidity=true;
        return orderValidity;
    }
}