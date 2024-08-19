package ma.zyn.app.bean.core.product;








import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zyn.app.zynerator.bean.BaseEntity;
import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "category")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="category_seq",sequenceName="category_seq",allocationSize=1, initialValue = 1)
public class Category  extends BaseEntity     {




    @Column(length = 500)
    private String name;



    public Category(){
        super();
    }

    public Category(Long id){
        this.id = id;
    }





    @Id
    @Column(name = "id")
    @GeneratedValue(strategy =  GenerationType.SEQUENCE,generator="category_seq")
      @Override
    public Long getId(){
        return this.id;
    }
        @Override
    public void setId(Long id){
        this.id = id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return id != null && id.equals(category.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

