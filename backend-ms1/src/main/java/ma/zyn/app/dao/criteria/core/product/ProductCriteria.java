package  ma.zyn.app.dao.criteria.core.product;



import ma.zyn.app.zynerator.criteria.BaseCriteria;

import java.util.List;

public class ProductCriteria extends  BaseCriteria  {

    private String name;
    private String nameLike;
    private String description;
    private String descriptionLike;
    private String price;
    private String priceMin;
    private String priceMax;
    private String quantity;
    private String quantityMin;
    private String quantityMax;

    private CategoryCriteria category ;
    private List<CategoryCriteria> categorys ;


    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getNameLike(){
        return this.nameLike;
    }
    public void setNameLike(String nameLike){
        this.nameLike = nameLike;
    }

    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescriptionLike(){
        return this.descriptionLike;
    }
    public void setDescriptionLike(String descriptionLike){
        this.descriptionLike = descriptionLike;
    }

    public String getPrice(){
        return this.price;
    }
    public void setPrice(String price){
        this.price = price;
    }   
    public String getPriceMin(){
        return this.priceMin;
    }
    public void setPriceMin(String priceMin){
        this.priceMin = priceMin;
    }
    public String getPriceMax(){
        return this.priceMax;
    }
    public void setPriceMax(String priceMax){
        this.priceMax = priceMax;
    }
      
    public String getQuantity(){
        return this.quantity;
    }
    public void setQuantity(String quantity){
        this.quantity = quantity;
    }   
    public String getQuantityMin(){
        return this.quantityMin;
    }
    public void setQuantityMin(String quantityMin){
        this.quantityMin = quantityMin;
    }
    public String getQuantityMax(){
        return this.quantityMax;
    }
    public void setQuantityMax(String quantityMax){
        this.quantityMax = quantityMax;
    }
      

    public CategoryCriteria getCategory(){
        return this.category;
    }

    public void setCategory(CategoryCriteria category){
        this.category = category;
    }
    public List<CategoryCriteria> getCategorys(){
        return this.categorys;
    }

    public void setCategorys(List<CategoryCriteria> categorys){
        this.categorys = categorys;
    }
}
