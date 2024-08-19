package ma.zyn.app.unit.dao.facade.core.customer;

import ma.zyn.app.bean.core.customer.Customer;
import ma.zyn.app.dao.facade.core.customer.CustomerDao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.BeforeEach;

import java.math.BigDecimal;
import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.IntStream;
import java.time.LocalDateTime;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class CustomerDaoTest {

@Autowired
    private CustomerDao underTest;

    @BeforeEach
    void setUp() {
        underTest.deleteAll();
    }


    @Test
    void shouldFindById(){
        Long id = 1L;
        Customer entity = new Customer();
        entity.setId(id);
        underTest.save(entity);
        Customer loaded = underTest.findById(id).orElse(null);
        assertThat(loaded.getId()).isEqualTo(id);
    }

    @Test
    void shoulDeleteById() {
        Long id = 1L;
        Customer entity = new Customer();
        entity.setId(id);
        underTest.save(entity);

        underTest.deleteById(id);

        Customer loaded = underTest.findById(id).orElse(null);
        assertThat(loaded).isNull();
    }


    @Test
    void shouldFindAll() {
        // Given
        List<Customer> items = IntStream.rangeClosed(1, 10).mapToObj(i->constructSample(i)).collect(Collectors.toList());

        // Init
        items.forEach(underTest::save);

        // When
        List<Customer> loadedItems = underTest.findAll();

        // Then
        assertThat(loadedItems).isNotNull();
        assertThat(loadedItems.size()).isEqualTo(10);
    }

    @Test
    void shouldSave(){
        Customer given = constructSample(1);
        Customer saved = underTest.save(given);
        assertThat(saved.getId()).isNotNull();
    }

    private Customer constructSample(int i) {
		Customer given = new Customer();
        given.setCredentialsNonExpired(false);
        given.setEnabled(false);
        given.setAccountNonExpired(false);
        given.setAccountNonLocked(false);
        given.setPasswordChanged(false);
        given.setUsername("username-"+i);
        given.setPassword("password-"+i);
        given.setAvatar("avatar-"+i);
        given.setFullName("fullName-"+i);
        given.setAbout("about-"+i);
        return given;
    }

}
