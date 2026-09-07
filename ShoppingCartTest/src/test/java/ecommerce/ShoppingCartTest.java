package ecommerce;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShoppingCartTest {

    private ShoppingCart cart;

    @BeforeEach
    void setUp() {

        cart = new ShoppingCart();

        System.out.println("Creating fresh cart");
    }


    @Test
    void shouldCalculateCartTotal() {

        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(new Product("Laptop", 50000));
        cart.addProduct(new Product("Mouse", 2000));

        double total = cart.getTotal();

        assertEquals(52000, total);
    }
    @Test
    void emptyCartShouldHaveZeroTotal() {

        ShoppingCart cart = new ShoppingCart();

        assertEquals(0, cart.getTotal());
    }
    @Test
    void cartWithOneProductShouldReturnProductPrice() {

        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(
                new Product("Keyboard", 3000)
        );

        assertEquals(3000, cart.getTotal());
    }

    @Test
    void premiumCustomerShouldGet10PercentDiscount() {

        cart.addProduct(new Product("Laptop", 50000));
        cart.addProduct(new Product("Mouse", 2000));

        double total = cart.getTotal("PREMIUM");

        assertEquals(46800, total);
    }

    @AfterEach
    void tearDown() {

        System.out.println("Test finished");
    }
    @BeforeAll
    static void startTestSuite() {

        System.out.println("Starting ShoppingCart tests");
    }

    @AfterAll
    static void finishTestSuite() {

        System.out.println("Finished ShoppingCart tests");
    }
}
