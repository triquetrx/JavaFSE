package com.cts.mkm.service;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.cts.mkm.dao.MkmOrderDAO;
import com.cts.mkm.exception.MkmOrderException;
import com.cts.mkm.util.ApplicationUtil;
import com.cts.mkm.vo.MkmOrder;
public class MkmOrderService {
    public static List<MkmOrder> buildMkmOrdersList(List<String> MkmOrderRecords) {
        List<MkmOrder> MkmOrderList = new ArrayList<MkmOrder>();
// Fill the code
        for(String student:MkmOrderRecords) {
            String[] details =student.split(",");
            double[] MkmOrderCosts =
                    calculateTotalDressCost(Integer.parseInt(details[5]),details[6],details[3]);
            MkmOrder applicant =new MkmOrder( details[0],
                    details[1],
                    ApplicationUtil.convertStringToDate(details[2]),
                    details[3],
                    ApplicationUtil.convertStringToDate(details[4]),
                    Integer.parseInt(details[5]) ,
                    details[6],
                    details[7],
                    MkmOrderCosts[0] ,
                    MkmOrderCosts[1] ,
                    MkmOrderCosts[2] ,
                    MkmOrderCosts[3] ,
                    "Processed"
            );
//enable if needed
            System.out.println(applicant.toString());
        }
        return MkmOrderList;
    }
    public boolean addMkmOrderDetails(String inputFeed) throws MkmOrderException {
// Fill the code
        List<String> admissionList= ApplicationUtil.readFile(inputFeed);
        List<MkmOrder> customerPlanPytList= buildMkmOrdersList(admissionList);
        MkmOrderDAO admissionDAO=new MkmOrderDAO();
        try {
            admissionDAO.addMkmOrderDetails(customerPlanPytList);
            return true;
        } catch (Exception e) {
// TODO Auto-generated catch block
        }
        return false;
    }
    public static double[] calculateTotalDressCost(int noOfDresses, String location, String
            dressQuality) {
        double cost0 =0;
        double cost1 =0;
        double cost2 =0;
        double cost3 =0;

// Fill the code
        if(dressQuality.equalsIgnoreCase("Quality01"))
        {
            cost0=200*noOfDresses;
            cost1=cost0*0.1;
        }
        else if(dressQuality.equalsIgnoreCase("Quality02"))
        {
            cost0=400*noOfDresses;
            cost0=cost0*0.11;
        }
        else if(dressQuality.equalsIgnoreCase("Quality03"))
        {
            cost0=600*noOfDresses;
            cost0=cost0*0.12;
        }
        else if(dressQuality.equalsIgnoreCase("Quality04"))
        {
            cost0=1000*noOfDresses;
            cost0=cost0*0.125;
        }
        else if(dressQuality.equalsIgnoreCase("Quality05"))
        {
            cost0=1550*noOfDresses;
            cost0=cost0*0.12;
        }
        else if(dressQuality.equalsIgnoreCase("Quality06"))
        {
            cost0=2000*noOfDresses;
            cost1=cost0*0.135;
        }
        if(location.equalsIgnoreCase("Coimbatore"))
        {
            cost2=25;
        }
        else if(location.equalsIgnoreCase("Chennai"))
        {
            cost2=25;
        }
        else if(location.equalsIgnoreCase("Bangalore"))
        {
            cost2=30;
        }
        else if(location.equalsIgnoreCase("Mumbai"))
        {
            cost2=30;
        }
        else if(location.equalsIgnoreCase("Others"))
        {
            cost2=45;
        }
        cost3 = cost0 + cost1 +cost2;
        return new double[]{cost0,cost1,cost2,cost3};
    }
    public boolean searchMkmOrder(String orderId) throws MkmOrderException {
        boolean status = false;

        return status;
    }
}