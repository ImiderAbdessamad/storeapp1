package  ma.zyn.app.dao.specification.core.customer;

import ma.zyn.app.dao.criteria.core.customer.CustomerCriteria;
import ma.zyn.app.bean.core.customer.Customer;
import ma.zyn.app.zynerator.specification.AbstractSpecification;


public class CustomerSpecification extends  AbstractSpecification<CustomerCriteria, Customer>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateBool("credentialsNonExpired", criteria.getCredentialsNonExpired());
        addPredicateBool("enabled", criteria.getEnabled());
        addPredicateBool("accountNonExpired", criteria.getAccountNonExpired());
        addPredicateBool("accountNonLocked", criteria.getAccountNonLocked());
        addPredicateBool("passwordChanged", criteria.getPasswordChanged());
        addPredicate("username", criteria.getUsername(),criteria.getUsernameLike());
        addPredicate("password", criteria.getPassword(),criteria.getPasswordLike());
        addPredicate("avatar", criteria.getAvatar(),criteria.getAvatarLike());
        addPredicate("fullName", criteria.getFullName(),criteria.getFullNameLike());
        addPredicate("about", criteria.getAbout(),criteria.getAboutLike());
    }

    public CustomerSpecification(CustomerCriteria criteria) {
        super(criteria);
    }

    public CustomerSpecification(CustomerCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
