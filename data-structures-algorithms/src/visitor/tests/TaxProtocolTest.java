package visitor.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import visitor.products.Cigarette;
import visitor.products.Electronic;
import visitor.products.Food;
import visitor.visitors.BrazilianTaxProtocol;
import visitor.visitors.TaxProtocol;
import visitor.visitors.USATaxProtocol;

public class TaxProtocolTest {

    @Test
    void testBrazilianTax() {
        final double expectedCigarPrice = 28;
        final double expectedFoodPrice = 12;
        final double expectedElectronicPrice = 81;

        final Cigarette cigarette = new Cigarette();
        cigarette.setPrice(20);

        final Food food = new Food();
        food.setPrice(10);

        final Electronic electronic = new Electronic();
        electronic.setPrice(60);

        final TaxProtocol aProtocol = new BrazilianTaxProtocol();

        aProtocol.applyCigarTax(cigarette);
        aProtocol.applyFoodTax(food);
        aProtocol.applyElectronicTax(electronic);

        Assertions.assertEquals(expectedCigarPrice, cigarette.getPrice());
        Assertions.assertEquals(expectedFoodPrice, food.getPrice());
        Assertions.assertEquals(expectedElectronicPrice, electronic.getPrice());
    }

    @Test
    void testAmericanTax() {
        final double expectedCigarPrice = 23;
        final double expectedFoodPrice = 10.5;
        final double expectedElectronicPrice = 66;

        final Cigarette cigarette = new Cigarette();
        cigarette.setPrice(20);

        final Food food = new Food();
        food.setPrice(10);

        final Electronic electronic = new Electronic();
        electronic.setPrice(60);

        final TaxProtocol aProtocol = new USATaxProtocol();

        aProtocol.applyCigarTax(cigarette);
        aProtocol.applyFoodTax(food);
        aProtocol.applyElectronicTax(electronic);

        Assertions.assertEquals(expectedCigarPrice, cigarette.getPrice());
        Assertions.assertEquals(expectedFoodPrice, food.getPrice());
        Assertions.assertEquals(expectedElectronicPrice, electronic.getPrice());
    }
}
