package  ma.zyn.app.ws.dto.purchase;

import ma.zyn.app.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;
import java.util.Date;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.math.BigDecimal;


import ma.zyn.app.ws.dto.customer.CustomerDto;
import ma.zyn.app.ws.dto.product.ProductDto;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class PurchaseDto  extends AuditBaseDto {

    private String purchaseDate ;
    private BigDecimal total  ;

    private CustomerDto customer ;

    private List<PurchaseItemDto> purchaseItems ;


    public PurchaseDto(){
        super();
    }




    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getPurchaseDate(){
        return this.purchaseDate;
    }
    public void setPurchaseDate(String purchaseDate){
        this.purchaseDate = purchaseDate;
    }


    public BigDecimal getTotal(){
        return this.total;
    }
    public void setTotal(BigDecimal total){
        this.total = total;
    }


    public CustomerDto getCustomer(){
        return this.customer;
    }

    public void setCustomer(CustomerDto customer){
        this.customer = customer;
    }



    public List<PurchaseItemDto> getPurchaseItems(){
        return this.purchaseItems;
    }

    public void setPurchaseItems(List<PurchaseItemDto> purchaseItems){
        this.purchaseItems = purchaseItems;
    }



}
