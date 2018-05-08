package camt.se234.project.service;

import camt.se234.project.dao.ProductDao;
import camt.se234.project.entity.Product;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ProductServiceImplTests {

    ProductDao productDao;
    ProductServiceImpl productService;

    @Before
    public void setup(){
        productDao = mock(ProductDao.class);
        productService = new ProductServiceImpl();
        productService.setProductDao(productDao);
    }


    @Test
    public void testGetAllProduct(){

        List<Product> mockProducts = new ArrayList<>();

        mockProducts.add(new Product(null,"A01","Water","drink","",50.00));
        mockProducts.add(new Product(null,"B01","Wheat","drink","",1000.00));
        mockProducts.add(new Product(null,"C01","Ice","drink","",80.00));
        mockProducts.add(new Product(null,"D01","Sang Som","drink","",300.00));
        mockProducts.add(new Product(null,"E01","Coca Cola","drink","",30.00));
        when(productDao.getProducts()).thenReturn(mockProducts);

        assertThat(productService.getAllProducts(),is(mockProducts));

    }


    @Test
    public void testAvailableProduct(){

        List<Product> mockProducts = new ArrayList<>();
        mockProducts.add(new Product(null,"A01","Water","drink","",50.00));
        mockProducts.add(new Product(null,"B01","Wheat","drink","",1000.00));
        mockProducts.add(new Product(null,"C01","Ice","drink","",80.00));
        mockProducts.add(new Product(null,"D01","Sang Som","drink","",-1));
        mockProducts.add(new Product(null,"E01","Coca Cola","drink","",-1));
        // give mockProducts index 3-4 have price = -1
        when(productDao.getProducts()).thenReturn(mockProducts);

        // return mockProducts which is price  > 0
        assertThat(productService.getAvailableProducts(),hasItems(mockProducts.get(0),mockProducts.get(1)));

    }

    @Test
    public void testUnavailableProduct(){

        List<Product> mockProducts = new ArrayList<>();
        mockProducts.add(new Product(null,"A01","Water","drink","",50.00));
        mockProducts.add(new Product(null,"B01","Wheat","drink","",1000.00));
        mockProducts.add(new Product(null,"C01","Ice","drink","",80.00));
        mockProducts.add(new Product(null,"D01","Sang Som","drink","",-1));
        mockProducts.add(new Product(null,"E01","Coca Cola","drink","",-1));
        // give mockProducts index 3 and 4 have price = -1
        when(productDao.getProducts()).thenReturn(mockProducts);

        //number of all products - number of available products = unavailable product
        assertThat(productService.getUnavailableProductSize(),is(2));

    }
}
