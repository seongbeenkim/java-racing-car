package domain;

import strategy.MoveStrategy;

import java.util.List;

public class GameSystem {
    private final Cars cars;
    private TryNumber tryNumber;

    public GameSystem(final Names carNames, final int tryNumber) {
        this(new Cars(carNames), new TryNumber(tryNumber));
    }

    public GameSystem(final Names carNames, final TryNumber tryNumber) {
        this(new Cars(carNames), tryNumber);
    }

    public GameSystem(final Cars cars, final int tryNumber) {
        this(cars, new TryNumber(tryNumber));
    }

    public GameSystem(final Cars cars, final TryNumber tryNumber) {
        this.cars = cars;
        this.tryNumber = tryNumber;
    }

    public boolean on() {
        return tryNumber.isLeft();
    }

    public void playEachRound(MoveStrategy moveStrategy) {
        cars.list()
                .forEach(car -> car.move(moveStrategy));

        tryNumber = tryNumber.reduce();
    }

    public List<Car> cars() {
        return cars.list();
    }

    public List<String> winners() {
        return cars.winnerNames(cars.maxPosition());
    }
}
