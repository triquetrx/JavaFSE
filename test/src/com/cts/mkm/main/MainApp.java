package com.cts.mkm.main;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import com.cts.mkm.exception.MkmOrderException;
import com.cts.mkm.service.MkmOrderService;
import com.cts.mkm.skeletonvalidator.SkeletonValidator;
public class MainApp {
    public static void main(String[] args) {
//Don't delete this code
//Skeletonvalidaton starts
        new SkeletonValidator();
        MkmOrderService mpeService = new MkmOrderService();
        try {
            mpeService.addMkmOrderDetails("MKM Dress Collection_Skl/inputfeed.txt");
        } catch (MkmOrderException e) {
// TODO Auto-generated catch block
            System.out.println("file fail");
        }
    }
}