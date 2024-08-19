package  ma.zyn.app.dao.criteria.core.purchase;


import ma.zyn.app.dao.criteria.core.customer.CustomerCriteria;

import ma.zyn.app.zynerator.criteria.BaseCriteria;

import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class PurchaseCriteria extends  BaseCriteria  {

    private LocalDateTime purchaseDate;
    private LocalDateTime purchaseDateFrom;
    private LocalDateTime purchaseDateTo;
    private String total;
    private String totalMin;
    private String totalMax;

    private CustomerCriteria customer ;
    private List<CustomerCriteria> customers ;


    public LocalDateTime getPurchaseDate(){
        return this.purchaseDate;
    }
    public void setPurchaseDate(LocalDateTime purchaseDate){
        this.purchaseDate = purchaseDate;
    }
    public LocalDateTime getPurchaseDateFrom(){
        return this.purchaseDateFrom;
    }
    public void setPurchaseDateFrom(LocalDateTime purchaseDateFrom){
        this.purchaseDateFrom = purchaseDateFrom;
    }
    public LocalDateTime getPurchaseDateTo(){
        return this.purchaseDateTo;
    }
    public void setPurchaseDateTo(LocalDateTime purchaseDateTo){
        this.purchaseDateTo = purchaseDateTo;
    }
    public String getTotal(){
        return this.total;
    }
    public void setTotal(String total){
        this.total = total;
    }   
    public String getTotalMin(){
        return this.totalMin;
    }
    public void setTotalMin(String totalMin){
        this.totalMin = totalMin;
    }
    public String getTotalMax(){
        return this.totalMax;
    }
    public void setTotalMax(String totalMax){
        this.totalMax = totalMax;
    }
      

    public CustomerCriteria getCustomer(){
        return this.customer;
    }

    public void setCustomer(CustomerCriteria customer){
        this.customer = customer;
    }
    public List<CustomerCriteria> getCustomers(){
        return this.customers;
    }

    public void setCustomers(List<CustomerCriteria> customers){
        this.customers = customers;
    }
}
