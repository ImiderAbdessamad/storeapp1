package  ma.zyn.app.ws.dto.customer;

import ma.zyn.app.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import ma.zyn.app.zynerator.security.bean.Role;
import java.util.Collection;
import ma.zyn.app.zynerator.security.ws.dto.UserDto;




@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerDto  extends UserDto {





    private Collection<Role> roles;
    public CustomerDto(){
        super();
    }





















    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }
}
