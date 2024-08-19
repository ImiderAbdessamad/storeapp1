package ma.zyn.app.dao.facade.core.customer;

import ma.zyn.app.zynerator.repository.AbstractRepository;
import ma.zyn.app.bean.core.customer.Customer;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface CustomerDao extends AbstractRepository<Customer,Long>  {

    Customer findByUsername(String username);


}
