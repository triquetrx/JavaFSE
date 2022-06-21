package com.cts.mkm.skeletonvalidator;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * @author t-aarti3
 * This class is used to verify if the Code Skeleton is intact and not
 * modified by participants thereby ensuring smooth auto evaluation
 * */
public class SkeletonValidator {
    public SkeletonValidator() {
        validateClassName("com.cts.mkm.util.DBConnectionManager");
        validateClassName("com.cts.mkm.util.ApplicationUtil");
        validateClassName("com.cts.mkm.service.MkmOrderService");
        validateClassName("com.cts.mkm.dao.MkmOrderDAO");
        validateClassName("com.cts.mkm.vo.MkmOrder");
        validateClassName("com.cts.mkm.exception.MkmOrderException");
        validateMethodSignature(
                "addMkmOrderDetails:boolean,getAllMkmOrderDetails:List",
                "com.cts.mkm.dao.MkmOrderDAO");
        validateMethodSignature(
                "buildMkmOrdersList:List,addMkmOrderDetails:boolean,calculateTotalDressCost:double[],searchMkmOrder:boolean","com.cts.mkm.service.MkmOrderService");
        validateMethodSignature(
                "readFile:List,convertUtilToSqlDate:Date,convertStringToDate:Date,checkIfValidOrder:boolean",
                "com.cts.mkm.util.ApplicationUtil");
        validateMethodSignature(
                "getConnection:Connection,getInstance:DBConnectionManager",
                "com.cts.mkm.util.DBConnectionManager");
    }
    private static final Logger LOG = Logger.getLogger("SkeletonValidator");
    protected final boolean validateClassName(String className) {
        boolean iscorrect = false;
        try {
            Class.forName(className);
            iscorrect = true;
            LOG.info("Class Name " + className + " is correct");
        } catch (ClassNotFoundException e) {
            LOG.log(Level.SEVERE, "You have changed either the " + "class name/package. Use the correct package "
                    + "and class name as provided in the skeleton");
        } catch (Exception e) {
            LOG.log(Level.SEVERE,
                    "There is an error in validating the " + "Class Name. Please manually verify that the "
                            + "Class name is same as skeleton before uploading");
        } return iscorrect;
    }
    protected final void validateMethodSignature(String methodWithExcptn, String
            className) {
        Class cls = null;
        try {
            String[] actualmethods = methodWithExcptn.split(",");
            boolean errorFlag = false;
            String[] methodSignature;
            String methodName = null;
            String returnType = null;
            for (String singleMethod : actualmethods) {
                boolean foundMethod = false;
                methodSignature = singleMethod.split(":");
                methodName = methodSignature[0];
                returnType = methodSignature[1];
                cls = Class.forName(className);
                Method[] methods = cls.getMethods();
                for (Method findMethod : methods) {
                    if (methodName.equals(findMethod.getName())) {
                        foundMethod = true;
                        if
                        (!(findMethod.getReturnType().getSimpleName().equals(returnType))) {
                            errorFlag = true;
                            LOG.log(Level.SEVERE, " You have changed the " + "return type in '" + methodName
                                    + "' method. Please stick to the " + "skeleton provided");
                        } else {
                            LOG.info("Method signature of " +
                                    methodName + " is valid");
                        }
                    }
                } if (!foundMethod) {
                    errorFlag = true;
                    LOG.log(Level.SEVERE, " Unable to find the given public method " + methodName
                            + ". Do not change the " + "given public method name. " + "Verify it with the skeleton");
                }
            } if (!errorFlag) {
                LOG.info("Method signature is valid");
            }
        } catch (Exception e) {
            LOG.log(Level.SEVERE,
                    " There is an error in validating the " + "method structure. Please manually verify that the " +
                            "Method signature is same as the skeleton before uploading");
        }
    }
}