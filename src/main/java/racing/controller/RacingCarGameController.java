package racing.controller;


import racing.domain.CarGroup;
import racing.domain.RandomMoveStrategy;
import racing.view.InputView;
import racing.view.ResultView;
import racing.domain.RacingGame;

public class RacingCarGameController {

  public static void main(String[] args) {
    String carsName = InputView.scanCarsName();
    int numberOfMovements = InputView.scanNumberOfMovements();

    RacingGame game = new RacingGame(carsName, new RandomMoveStrategy());

    ResultView.printEmptyLine();
    ResultView.println("실행 결과");
    for(int i = 0; i < numberOfMovements; i++) {
      CarGroup cars = game.play();
      ResultView.printCarPosition(cars);
      ResultView.printEmptyLine();
    }

    ResultView.printWinners(game.findWinners());
  }

}
