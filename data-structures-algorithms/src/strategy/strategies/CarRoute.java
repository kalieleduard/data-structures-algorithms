package strategy.strategies;

public class CarRoute implements RouteStrategy {

    @Override
    public String execute(final String pointA,
                          final String pointB) {
        return "With car, you have to get the street";
    }
}
