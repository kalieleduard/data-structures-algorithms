package strategy;

import strategy.strategies.RouteStrategy;

import java.util.Objects;

public class Navigator {

    private final RouteStrategy routeStrategy;

    public Navigator(final RouteStrategy routeStrategy) {
        this.routeStrategy = Objects.requireNonNull(routeStrategy, "'routeStrategy' must not be null");
    }

    public String navigate() {
        return routeStrategy.execute("New York", "Orlando");
    }
}
