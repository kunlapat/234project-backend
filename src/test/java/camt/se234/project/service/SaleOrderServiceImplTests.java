package camt.se234.project.service;

import camt.se234.project.dao.OrderDao;
import camt.se234.project.dao.ProductDao;
import camt.se234.project.entity.Product;
import camt.se234.project.entity.SaleOrder;
import camt.se234.project.entity.SaleTransaction;
import org.hibernate.criterion.Order;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SaleOrderServiceImplTests {


    OrderDao orderDao;
    SaleOrderServiceImpl orderService;

    @Before
    public void setup(){
        orderDao = mock(OrderDao.class);
        orderService = new SaleOrderServiceImpl();
        orderService.setOrderDao(orderDao);
    }


    @Test
    public void testGetSaleOrders(){
        List<SaleTransaction> mockSaleTransaction1 = new ArrayList<>();
        mockSaleTransaction1.add(new SaleTransaction(null,"T01",
                new SaleOrder(null, "S01", mockSaleTransaction1),
                new Product(null, "P01", "meat", "xxx","xxx", 100.0),
                10));
        mockSaleTransaction1.add(new SaleTransaction(null,"T02",
                new SaleOrder(null, "S02", mockSaleTransaction1),
                new Product(null, "P02", "wheat", "xxx","xxx", 1000.0),
                10));

        List<SaleOrder> mockSaleOrders = new ArrayList<>();
        mockSaleOrders.add(new SaleOrder(null,"S01",mockSaleTransaction1));
        mockSaleOrders.add(new SaleOrder(null,"S02",mockSaleTransaction1));

        when(orderDao.getOrders()).thenReturn(mockSaleOrders);

        assertThat(orderService.getSaleOrders(),
                hasItem(new SaleOrder(null,"S01",mockSaleTransaction1)));
        assertThat(orderService.getSaleOrders(),
                hasItem(new SaleOrder(null,"S02",mockSaleTransaction1)));
    }

}
