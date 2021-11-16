package racingcar.view;

import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.domain.Winners;

import java.util.stream.IntStream;

public class ConsoleOutputView implements OutputView{
    private final int STARTING_POINT = 0;
    private final char PROGRESS_BAR = '-';
    private final String SEPARATOR_OF_CAR_STATE = " : ";
    private final String SEPARATOR_OF_WINNERS = ", ";
    private final String MESSAGE_OF_WINNERS = " has (have) finally won!";

    @Override
    public void showOutputMessage() {
        System.out.println("Result of Racing");
    }

    @Override
    public void showStartOfRound(int round) {
        System.out.printf("Round %d Starts!\n", round);
    }

    @Override
    public void showEndOfRound(int round) {
        System.out.printf("Round %d Is Finished!\n\n", round);
    }

    @Override
    public void showRacing(Cars cars) {
        cars.stream().forEach(this::showDistanceOfCar);
    }

    private void showDistanceOfCar(Car car) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(car.getName());
        stringBuilder.append(SEPARATOR_OF_CAR_STATE);
        IntStream.range(STARTING_POINT, car.getDistance())
                .forEach(i -> stringBuilder.append(PROGRESS_BAR));

        System.out.println(stringBuilder);
    }

    @Override
    public void showWinners(Winners winners) {
        StringBuilder stringBuilder = new StringBuilder();

        String winnerNames = winners.provideWinnerNames();
        stringBuilder.append(winnerNames);
        stringBuilder.append(MESSAGE_OF_WINNERS);

        System.out.println(stringBuilder);
    }
}