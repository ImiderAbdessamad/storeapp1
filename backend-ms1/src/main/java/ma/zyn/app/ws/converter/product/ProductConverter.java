package  ma.zyn.app.ws.converter.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import ma.zyn.app.zynerator.converter.AbstractConverterHelper;

import java.util.ArrayList;
import java.util.List;

import ma.zyn.app.ws.converter.product.CategoryConverter;
import ma.zyn.app.bean.core.product.Category;



import ma.zyn.app.zynerator.util.StringUtil;
import ma.zyn.app.zynerator.converter.AbstractConverter;
import ma.zyn.app.zynerator.util.DateUtil;
import ma.zyn.app.bean.core.product.Product;
import ma.zyn.app.ws.dto.product.ProductDto;

@Component
public class ProductConverter {

    @Autowired
    private CategoryConverter categoryConverter ;
    private boolean category;

    public  ProductConverter() {
        initObject(true);
    }

    public Product toItem(ProductDto dto) {
        if (dto == null) {
            return null;
        } else {
        Product item = new Product();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getName()))
                item.setName(dto.getName());
            if(StringUtil.isNotEmpty(dto.getDescription()))
                item.setDescription(dto.getDescription());
            if(StringUtil.isNotEmpty(dto.getPrice()))
                item.setPrice(dto.getPrice());
            if(StringUtil.isNotEmpty(dto.getQuantity()))
                item.setQuantity(dto.getQuantity());
            if(this.category && dto.getCategory()!=null)
                item.setCategory(categoryConverter.toItem(dto.getCategory())) ;




        return item;
        }
    }


    public ProductDto toDto(Product item) {
        if (item == null) {
            return null;
        } else {
            ProductDto dto = new ProductDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getName()))
                dto.setName(item.getName());
            if(StringUtil.isNotEmpty(item.getDescription()))
                dto.setDescription(item.getDescription());
            if(StringUtil.isNotEmpty(item.getPrice()))
                dto.setPrice(item.getPrice());
            if(StringUtil.isNotEmpty(item.getQuantity()))
                dto.setQuantity(item.getQuantity());
            if(this.category && item.getCategory()!=null) {
                dto.setCategory(categoryConverter.toDto(item.getCategory())) ;

            }


        return dto;
        }
    }

    public void init(boolean value) {
        initObject(value);
    }

    public void initObject(boolean value) {
        this.category = value;
    }
	
    public List<Product> toItem(List<ProductDto> dtos) {
        List<Product> items = new ArrayList<>();
        if (dtos != null && !dtos.isEmpty()) {
            for (ProductDto dto : dtos) {
                items.add(toItem(dto));
            }
        }
        return items;
    }


    public List<ProductDto> toDto(List<Product> items) {
        List<ProductDto> dtos = new ArrayList<>();
        if (items != null && !items.isEmpty()) {
            for (Product item : items) {
                dtos.add(toDto(item));
            }
        }
        return dtos;
    }


    public void copy(ProductDto dto, Product t) {
		BeanUtils.copyProperties(dto, t, AbstractConverterHelper.getNullPropertyNames(dto));
        if(t.getCategory() == null  && dto.getCategory() != null){
            t.setCategory(new Category());
        }else if (t.getCategory() != null  && dto.getCategory() != null){
            t.setCategory(null);
            t.setCategory(new Category());
        }
        if (dto.getCategory() != null)
        categoryConverter.copy(dto.getCategory(), t.getCategory());
    }

    public List<Product> copy(List<ProductDto> dtos) {
        List<Product> result = new ArrayList<>();
        if (dtos != null) {
            for (ProductDto dto : dtos) {
                Product instance = new Product();
                copy(dto, instance);
                result.add(instance);
            }
        }
        return result.isEmpty() ? null : result;
    }


    public CategoryConverter getCategoryConverter(){
        return this.categoryConverter;
    }
    public void setCategoryConverter(CategoryConverter categoryConverter ){
        this.categoryConverter = categoryConverter;
    }
    public boolean  isCategory(){
        return this.category;
    }
    public void  setCategory(boolean category){
        this.category = category;
    }
}
