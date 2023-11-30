package visitor.visitors;

import visitor.products.Cigarette;
import visitor.products.Electronic;
import visitor.products.Food;

public class USATaxProtocol implements TaxProtocol {

    @Override
    public void applyCigarTax(final Cigarette aCigarette) {
        aCigarette.setPrice(aCigarette.getPrice() + aCigarette.getPrice() * .15);
    }

    @Override
    public void applyFoodTax(final Food aFood) {
        aFood.setPrice(aFood.getPrice() + aFood.getPrice() * .05);
    }

    @Override
    public void applyElectronicTax(final Electronic anElectronic) {
        anElectronic.setPrice(anElectronic.getPrice() + anElectronic.getPrice() * .1);
    }
}
