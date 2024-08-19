package ma.zyn.app.bean.core.customer;








import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zyn.app.zynerator.bean.BaseEntity;
import jakarta.persistence.*;
import java.util.Objects;
import ma.zyn.app.zynerator.security.bean.User;

@Entity
@Table(name = "customer")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="customer_seq",sequenceName="customer_seq",allocationSize=1, initialValue = 1)
public class Customer  extends User    {


    public Customer(String username) {
        super(username);
    }














    public Customer(){
        super();
    }

    public Customer(Long id){
        this.id = id;
    }





    @Id
    @Column(name = "id")
    @GeneratedValue(strategy =  GenerationType.SEQUENCE,generator="customer_seq")
      @Override
    public Long getId(){
        return this.id;
    }
        @Override
    public void setId(Long id){
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id != null && id.equals(customer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

