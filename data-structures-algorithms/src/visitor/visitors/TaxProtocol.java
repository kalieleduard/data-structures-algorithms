package visitor.visitors;

import visitor.products.Cigarette;
import visitor.products.Electronic;
import visitor.products.Food;

public interface TaxProtocol {

    void applyCigarTax(Cigarette aCigarette);
    void applyFoodTax(Food aFood);
    void applyElectronicTax(Electronic anElectronic);

}
