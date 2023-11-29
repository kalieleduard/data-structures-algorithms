package strategy.strategies;

public class WalkRoute implements RouteStrategy {


    @Override
    public String execute(final String pointA,
                          final String pointB) {
        return "When you're walking, you must get the paths with stops, to drink water";
    }
}
