package com.cts.mkm.vo;
import java.util.Date;
public class MkmOrder {
    String orderId;
    String dressCode;
    Date dateOfOrder;
    String dressQuality;
    Date dateOfDelivery;
    int noOfDresses;
    String location;
    String managerApproval;
    double dressCost;
    double gstTax;
    double deliveryCost;
    double totalDressCost;
    String finalStatusOfOrder;
    public MkmOrder() {
        super();
// TODO Auto-generated constructor stub
    }
    public MkmOrder(String orderId, String dressCode, Date dateOfOrder, String
            dressQuality, Date dateOfDelivery,
                    int noOfDresses, String location, String managerApproval, double
                            dressCost, double gstTax,
                    double deliveryCost, double totalDressCost, String
                            finalStatusOfOrder) {
        super();
        this.orderId = orderId;
        this.dressCode = dressCode;
        this.dateOfOrder = dateOfOrder;
        this.dressQuality = dressQuality;
        this.dateOfDelivery = dateOfDelivery;
        this.noOfDresses = noOfDresses;
        this.location = location;
        this.managerApproval = managerApproval;
        this.dressCost = dressCost;
        this.gstTax = gstTax;
        this.deliveryCost = deliveryCost;
        this.totalDressCost = totalDressCost;
        this.finalStatusOfOrder = finalStatusOfOrder;
    }
    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public String getDressCode() {
        return dressCode;
    }
    public void setDressCode(String dressCode) {
        this.dressCode = dressCode;
    }
    public Date getDateOfOrder() {
        return dateOfOrder;
    }
    public void setDateOfOrder(Date dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }
    public String getDressQuality() {
        return dressQuality;
    }
    public void setDressQuality(String dressQuality) {
        this.dressQuality = dressQuality;
    }
    public Date getDateOfDelivery() {
        return dateOfDelivery;
    }
    public void setDateOfDelivery(Date dateOfDelivery) {
        this.dateOfDelivery = dateOfDelivery;
    }
    public int getNoOfDresses() {
        return noOfDresses;
    }
    public void setNoOfDresses(int noOfDresses) {
        this.noOfDresses = noOfDresses;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getManagerApproval() {
        return managerApproval;
    }
    public void setManagerApproval(String managerApproval) {
        this.managerApproval = managerApproval;
    }
    public double getDressCost() {
        return dressCost;
    }
    public void setDressCost(double dressCost) {
        this.dressCost = dressCost;
    }
    public double getGstTax() {
        return gstTax;
    }
    public void setGstTax(double gstTax) {
        this.gstTax = gstTax;
    }
    public double getDeliveryCost() {
        return deliveryCost;
    }
    public void setDeliveryCost(double deliveryCost) {
        this.deliveryCost = deliveryCost;
    }
    public double getTotalDressCost() {
        return totalDressCost;
    }
    public void setTotalDressCost(double totalDressCost) {
        this.totalDressCost = totalDressCost;
    }
    public String getFinalStatusOfOrder() {
        return finalStatusOfOrder;
    }
    public void setFinalStatusOfOrder(String finalStatusOfOrder) {
        this.finalStatusOfOrder = finalStatusOfOrder;
    }
    @Override
    public String toString() {
        return "MKM Order Details: [orderId=" + orderId + ", dressCode=" +
                dressCode + ", dateOfOrder="
                + dateOfOrder + ", dressQuality=" + dressQuality + ",dateOfDelivery=" + dateOfDelivery + ", noOfDresses="
                + noOfDresses + ", location=" + location + ",managerApproval=" + managerApproval
                + ", dressCost=" + dressCost + ", gstTax=" + gstTax + ",deliveryCost=" + deliveryCost + ", totalDressCost=" + totalDressCost
                + ", finalStatusOfOrder=" + finalStatusOfOrder + "]";
    }
}