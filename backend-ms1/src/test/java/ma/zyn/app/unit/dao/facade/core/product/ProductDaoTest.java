package ma.zyn.app.unit.dao.facade.core.product;

import ma.zyn.app.bean.core.product.Product;
import ma.zyn.app.dao.facade.core.product.ProductDao;

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

import ma.zyn.app.bean.core.product.Category ;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class ProductDaoTest {

@Autowired
    private ProductDao underTest;

    @BeforeEach
    void setUp() {
        underTest.deleteAll();
    }


    @Test
    void shouldFindById(){
        Long id = 1L;
        Product entity = new Product();
        entity.setId(id);
        underTest.save(entity);
        Product loaded = underTest.findById(id).orElse(null);
        assertThat(loaded.getId()).isEqualTo(id);
    }

    @Test
    void shoulDeleteById() {
        Long id = 1L;
        Product entity = new Product();
        entity.setId(id);
        underTest.save(entity);

        underTest.deleteById(id);

        Product loaded = underTest.findById(id).orElse(null);
        assertThat(loaded).isNull();
    }


    @Test
    void shouldFindAll() {
        // Given
        List<Product> items = IntStream.rangeClosed(1, 10).mapToObj(i->constructSample(i)).collect(Collectors.toList());

        // Init
        items.forEach(underTest::save);

        // When
        List<Product> loadedItems = underTest.findAll();

        // Then
        assertThat(loadedItems).isNotNull();
        assertThat(loadedItems.size()).isEqualTo(10);
    }

    @Test
    void shouldSave(){
        Product given = constructSample(1);
        Product saved = underTest.save(given);
        assertThat(saved.getId()).isNotNull();
    }

    private Product constructSample(int i) {
		Product given = new Product();
        given.setName("name-"+i);
        given.setDescription("description-"+i);
        given.setPrice(BigDecimal.TEN);
        given.setQuantity(i);
        given.setCategory(new Category(1L));
        return given;
    }

}
