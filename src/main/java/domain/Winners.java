package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Winners {

    private final List<Car> cars = new ArrayList<>();
    private Position position;

    public Winners(List<CarName> carNames) {
        for (CarName carName : carNames) {
            cars.add(new Car(carName));
        }
    }

    public List<String> getWinners() {
        List<String> winners = new ArrayList<>();

        for (Car car : cars) {
            if (isWinner(getMaxPosition(), car.getPosition())) {
                winners.add(car.getCarName());
            }
        }

        return winners.stream().map(String::toString).collect(Collectors.toList());
    }

    public int getMaxPosition() {
        int maxPosition = 0;

        for (Car car : cars) {
            maxPosition = comparePosition(maxPosition, car.getPosition());
        }

        return maxPosition;
    }

    private int comparePosition(int maxPosition, Position position) {
        return Math.max(maxPosition, position.getPosition());
    }

    private boolean isWinner(int maxPosition, Position position) {
        return position.getPosition() == maxPosition;
    }

    public List<Car> getCars() {
        return cars;
    }
}
