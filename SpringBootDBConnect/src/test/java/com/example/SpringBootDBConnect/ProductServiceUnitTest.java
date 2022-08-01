package com.example.SpringBootDBConnect;

import com.example.SpringBootDBConnect.entity.Product;
import com.example.SpringBootDBConnect.repository.ProductRepository;
import com.example.SpringBootDBConnect.service.ProductService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class ProductServiceUnitTest {

    @Autowired
    private ProductService productService;

    @MockBean
    private ProductRepository productRepository;

    @Test
    void testCreate() {
        // GIVEN is our testing data - you can make this a final local variable if you want, e.g.:
        final Product TEST_PRODUCT = new Product(1, "Nighthawk AX6 ", "NETGEAR");
        final Product TEST_SAVED_PRODUCT = new Product(3, "ROG Rapture", "Asus");
        // WHEN
        Mockito.when(productRepository.save(TEST_PRODUCT)).thenReturn(TEST_SAVED_PRODUCT);
        // THEN
        Assertions.assertThat(productService.addProduct(TEST_PRODUCT)).isEqualTo(TEST_SAVED_PRODUCT);
        // verify that our repo was accessed exactly once
        Mockito.verify(productRepository, Mockito.times(1)).save(TEST_PRODUCT);
    }

    @Test
    void testReadByName() {
        // GIVEN is our testing data - you can make this a final local variable if you want, e.g.:
        final Product TEST_PRODUCT = new Product(1, "Latitude", "Dell");
        final Product TEST_SAVED_PRODUCT = new Product(3, "VivoBook", "Asus");
        // WHEN
//        Mockito.when(productRepository.findProductByName(TEST_PRODUCT.getName()).thenReturn(TEST_SAVED_PRODUCT);
        // THEN
        Assertions.assertThat(productService.addProduct(TEST_PRODUCT)).isEqualTo(TEST_SAVED_PRODUCT);
        // verify that our repo was accessed exactly once
        Mockito.verify(productRepository, Mockito.times(1)).save(TEST_PRODUCT);
    }

    @Test
    void testReadAll() {
    }

    @Test
    void testUpdate() {
    }

    @Test
    void testDelete() {
    }

    @Test
    void testReadByBrand() {

    }



}
