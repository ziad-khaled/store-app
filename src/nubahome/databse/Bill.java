package nubahome.databse;

import java.util.ArrayList;


public class Bill {
    int billID;
    String billDate;
    String buyerName;
    double productsTotalCost;
    double billTotalCost;
    String paymentMethod;
    ArrayList<SoldProduct> soldProducts;
    BillInstalmentsDetails billInstalmentsDetails;


    public Bill(String billDate, String buyerName, double productsTotalCost, double billTotalCost, String paymentMethod, ArrayList<SoldProduct> soldProducts) {
        this.billDate = billDate;
        this.buyerName = buyerName;
        this.productsTotalCost = productsTotalCost;
        this.billTotalCost = billTotalCost;
        this.paymentMethod = paymentMethod;
        this.soldProducts = soldProducts;
        this.billInstalmentsDetails = null;
    }

    public Bill(String billDate, String buyerName, double productsTotalCost, double billTotalCost, String paymentMethod, ArrayList<SoldProduct> soldProducts, BillInstalmentsDetails billInstalmentsDetails) {
        this.billDate = billDate;
        this.buyerName = buyerName;
        this.productsTotalCost = productsTotalCost;
        this.billTotalCost = billTotalCost;
        this.paymentMethod = paymentMethod;
        this.soldProducts = soldProducts;
        this.billInstalmentsDetails = billInstalmentsDetails;
    }

    public Bill(int billID, String billDate, String buyerName, double productsTotalCost, double billTotalCost, String paymentMethod, ArrayList<SoldProduct> soldProducts, BillInstalmentsDetails billInstalmentsDetails) {
        this.billID = billID;
        this.billDate = billDate;
        this.buyerName = buyerName;
        this.productsTotalCost = productsTotalCost;
        this.billTotalCost = billTotalCost;
        this.paymentMethod = paymentMethod;
        this.soldProducts = soldProducts;
        this.billInstalmentsDetails = billInstalmentsDetails;
    }

    public Bill(int billID, String billDate, String buyerName, double productsTotalCost, double billTotalCost, String paymentMethod, ArrayList<SoldProduct> soldProducts) {
        this.billID = billID;
        this.billDate = billDate;
        this.buyerName = buyerName;
        this.productsTotalCost = productsTotalCost;
        this.billTotalCost = billTotalCost;
        this.paymentMethod = paymentMethod;
        this.soldProducts = soldProducts;
        this.billInstalmentsDetails = null;
    }

    public int getBillID() {
        return billID;
    }

    public String getBillDate() {
        return billDate;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public double getProductsTotalCost() {
        return productsTotalCost;
    }

    public double getBillTotalCost() {
        return billTotalCost;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public ArrayList<SoldProduct> getSoldProducts() {
        return soldProducts;
    }

    public BillInstalmentsDetails getBillInstalmentsDetails() {
        return billInstalmentsDetails;
    }

}
