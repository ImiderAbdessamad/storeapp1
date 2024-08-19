package  ma.zyn.app.dao.specification.core.product;

import ma.zyn.app.dao.criteria.core.product.ProductCriteria;
import ma.zyn.app.bean.core.product.Product;
import ma.zyn.app.zynerator.specification.AbstractSpecification;


public class ProductSpecification extends  AbstractSpecification<ProductCriteria, Product>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("name", criteria.getName(),criteria.getNameLike());
        addPredicateBigDecimal("price", criteria.getPrice(), criteria.getPriceMin(), criteria.getPriceMax());
        addPredicateInt("quantity", criteria.getQuantity(), criteria.getQuantityMin(), criteria.getQuantityMax());
        addPredicateFk("category","id", criteria.getCategory()==null?null:criteria.getCategory().getId());
        addPredicateFk("category","id", criteria.getCategorys());
    }

    public ProductSpecification(ProductCriteria criteria) {
        super(criteria);
    }

    public ProductSpecification(ProductCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
