package tudelft.discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class DiscountApplierTest {

    @Test
    public void homePriceIsSetCorrectlyTest () {
        // Arrange
        Product product = new Product("test", 1.0d, "HOME");

        ProductDao dao = Mockito.mock(ProductDao.class);
        List<Product> results = Arrays.asList(product);
        Mockito.when(dao.all()).thenReturn(results);

        // Act
        DiscountApplier applier = new DiscountApplier(dao);
        applier.setNewPrices();

        // Assert
        Assertions.assertEquals(0.9d, product.getPrice());
    }

    @Test
    public void businessPriceIsSetCorrectlyTest () {
        // Arrange
        Product product = new Product("test", 1.0d, "BUSINESS");

        ProductDao dao = Mockito.mock(ProductDao.class);
        List<Product> results = Arrays.asList(product);
        Mockito.when(dao.all()).thenReturn(results);

        // Act
        DiscountApplier applier = new DiscountApplier(dao);
        applier.setNewPrices();

        // Assert
        Assertions.assertEquals(1.1d, product.getPrice());
    }

    @Test
    public void homeAndBusinessPricesAreSetCorrectlyTest () {
        // Arrange
        Product businessProduct = new Product("test", 1.0d, "BUSINESS");
        Product homeProduct = new Product("test", 1.0d, "HOME");

        ProductDao dao = Mockito.mock(ProductDao.class);
        List<Product> results = Arrays.asList(businessProduct, homeProduct);
        Mockito.when(dao.all()).thenReturn(results);

        // Act
        DiscountApplier applier = new DiscountApplier(dao);
        applier.setNewPrices();

        // Assert
        Assertions.assertEquals(1.1d, businessProduct.getPrice());
        Assertions.assertEquals(0.9d, homeProduct.getPrice());
    }

}
