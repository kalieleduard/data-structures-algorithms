package strategy;

import strategy.strategies.CarRoute;
import strategy.strategies.RouteStrategy;
import strategy.strategies.WalkRoute;

public class Client {

    public static void main(String[] args) {
        final var strategy = "car";
        final var navigator = new Navigator(StrategyFactory.get(strategy));
        System.out.println(navigator.navigate());
    }


    static class StrategyFactory {

        public static RouteStrategy get(final String aStrategy) {
            switch (aStrategy) {
                case "car" -> {
                    return new CarRoute();
                }
                case "fet" -> {
                    return new WalkRoute();
                }
            }

            throw new IllegalStateException("couldn't establish a route strategy");
        }
    }
}
