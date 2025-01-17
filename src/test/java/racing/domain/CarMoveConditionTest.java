package racing.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racing.domain.CarMoveCondition;

class CarMoveConditionTest {

  @ParameterizedTest
  @ValueSource(ints = {0, 1, 2, 3})
  void 자동차가_움직일_수_없는_조건인_경우(int number) {

    assertThat(CarMoveCondition.isMove(number)).isFalse();
  }

  @ParameterizedTest
  @ValueSource(ints = {4, 5, 6, 7, 8, 9})
  void 자동차가_움직일_수_있는_조건인_경우(int number) {

    assertThat(CarMoveCondition.isMove(number)).isTrue();
  }

}