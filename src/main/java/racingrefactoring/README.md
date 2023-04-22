# 기능 요구사항 나열
- 사용자는 몇 대의 자동차로 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- 자동차 이름은 쉼표(,)를 기준으로 구분한다.
- 각 자동차에 이름을 부여할 수 있다. 자동차 이름은 5자를 초과할 수 없다.
- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
- 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우이다. 
- 자동차의 상태를 화면에 출력한다. 어느 시점에 출력할 것인지에 대한 제약은 없다.
- 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한명 이상일 수 있다.


# 요구사항 분석
- 사용자는 몇 대의 자동차로 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
    - 사용자가 게임에 참가할 자동차 이름을 (",")로 구분하여 입력한다.
    - 구분된 이름 개수만큼 자동차가 생성된다.
    - 자동차 이름은 5자를 초과할 수 없다.
    - 게임 횟수만큼 n대의 자동차는 전진 또는 멈출 수 있다.

- 자동차는 움직일 수 있다.
    - 자동차는 움직이는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우이다.
    - 자동차는 움직이고 나서, 자신의 이름과 움직인 거리를 출력한다.

- 최종 우승자를 찾을 수 있다.
    - 게임이 끝나면 우승자를 찾는다.
    - 우승자는 한명 이상일 수 있다.


# 테스트 하기 어려운 부분
- Random Number
- Shuffle
- 외부 API



# 협력에 필요한 객체 도출
- 자동차 (Car)
- 자동차를 생성할 공장 (CarFactory)
- 여러 대의 자동차를 관리할 자동차 묶음 객체 (CarGroup)
- 랜덤 넘버에 의해 움직일 여부를 판단하는 인터페이스 (MoveStrategy)
- 자동차 경주 게임 (RacingGame)
- 랜덤 넘버 생성기 (RandomNumberGenerator)
- 움직일 수 있는 여부를 판단하는 객체 (MoveCondition)
- 사용자 입력 받는 뷰 (InputView)
- 출력을 담당하는 뷰 (OutputView)


