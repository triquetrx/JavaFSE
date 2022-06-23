package Handson.HackerRank.DateConversion;

import java.io.*;

import static java.util.stream.Collectors.joining;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        String newDate = null;
        String format = s.substring(s.length()-2,s.length()-1);
        String[] input = s.split("[A-Z]")[0].split(":");
        int hours = Integer.parseInt(input[0]);
        if (format.equalsIgnoreCase("AM")){
            if(hours==12){
                newDate = "00"+":"+input[1]+":"+input[2].replaceAll("[A-Za-z]","");
            } else {
                newDate = input[0] + ":" + input[1] + ":" + input[2];
            }
        } else {
            if(hours==12){
                newDate = (hours)+":"+input[1]+":"+input[2];
            } else {
                newDate = (hours+12)+":"+input[1]+":"+input[2];
            }
        }
        return newDate;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

