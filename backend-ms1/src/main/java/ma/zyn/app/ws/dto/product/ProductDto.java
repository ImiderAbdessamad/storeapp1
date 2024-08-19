package  ma.zyn.app.ws.dto.product;

import ma.zyn.app.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;




@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto  extends AuditBaseDto {

    private String name  ;
    private String description  ;
    private BigDecimal price  ;
    private Integer quantity  = 0 ;

    private CategoryDto category ;



    public ProductDto(){
        super();
    }




    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }


    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }


    public BigDecimal getPrice(){
        return this.price;
    }
    public void setPrice(BigDecimal price){
        this.price = price;
    }


    public Integer getQuantity(){
        return this.quantity;
    }
    public void setQuantity(Integer quantity){
        this.quantity = quantity;
    }


    public CategoryDto getCategory(){
        return this.category;
    }

    public void setCategory(CategoryDto category){
        this.category = category;
    }






}
