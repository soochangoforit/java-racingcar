**step3. 자동차 경주**
 -
   **- 요구사항**
   1. n대의 자동차는 전진 or 정지 가능 
   2. client 입력 : 자동차 수, 시도할 횟 수
   3. 전진 조건 : 0~9 랜덤값에서 4이상일 경우 
   4. 자동차 상태를 화면에 출력, 어느 시점에 출력 제한 없음

   **- TODO 리스트** 
   1. 자동차 4이상일 경우 움직이는 로직 구현 
   2. 랜덤값이 주어질 경우 움직이는 로직 구현
   3. 클라이언트 로직 구현
   4. RacingCar 클래스 구현

   **- 기능 목록**
   1. Car 도메인
      - move : 위치 출발,정지
      - getRandomNum : 0~9 랜덤값 생성
      - isMovable : 4~9 값이면 true 반환
   2. AppClient 
      - 자동차 대수 및 시도 횟수 입력받고 게임 실행
   3. RacingGame
      - 실제 레이싱 게임을 실행하는 클래스
      - isGameEnd : 게임이 끝인지 확인
      - moveCars : 자동차들 움직임
      - roundUp : try 업

   **- 피드백**
   1. id 는 어떤 용도로 쓰이는 걸까요? -> 삭제
   2. id나 position에 -1이란 값이 들어오면 어떻게 될까요? -> 검증로직 작성
   3. 인터페이스 기반 전략으로 테스트 작성 -> Moving 인터페이스 도입하여 테스트 작성 및 로직구현
   4. RacingGame 테스트 작성 -> 테스트 로직 작성
   5. Car객체에 멤버변수 totalCal -> 필요없는 멤버변수로 판단하여 삭제    
   6. 해당 생성자 삭제 -> 삭제
   7. 출력로직과 핵심로직을 분리 -> InputView, ResultView : 출력로직, CarController : 실행로직
   8. 그외 Cars : car 를 담는 객체 생성

  **- 2차 피드백**
   1. 도메인에 대한 검증만 하는 클래스를 따로 만드는 것은 괜찮지만 저는 도메인 클래스 내에서 사용하는 게 맞다고 생각해요 
     -> 검증 클래스를 따로 만들지 않고 각 도메인에 작성
   2. 들여쓰기가 2번 이상 사용되었어요! 메서드로 분리하는 등의 방법으로 들여쓰기 1번의 규칙을 지켜주세요 :)
     -> 들여쓰기가 1번 규칙 적용!!
   3. ResultView 에선 쓰이지 않는 Scanner 네요! 리팩토링 하실 때 지워주시면 될 것 같아요 :)
     -> 삭제
   4. 람다로 표현하면 car.move(() -> true); 로 쓸 수 있습니다:)
     -> 람다식으로 변경
   5. MAX_NUM, MIN_NUM 는 해당 클래스에서만 쓰이면 접근제한자를 private 으로 제한해두는게 좋을 것 같네요:)
      (다른 클래스도 마찬가지입니다!)
     -> 변경
   6. 요 메서드는 쓰이지 않네요:) 리팩토링하실 때 지워주세요!
     -> 삭제
   7. new RandomMoving()을 AppConfig로 감싸신 이유가 궁금합니다!
     -> AppConfig 에 Moving 인터페이스를 구현한 객체를 반환할 수 있는 메소드를 모아놓는 객체를 만들었습니다.
        현재는 랜덤을 구현한 객체를 반환하지만 나중에 Moving 인터페이스를 구현한 객체를 확장할 수 있도록 하였습니다.
        수동으로 등록해주는 객체에 의존관계를 주입하는 의존성 주입을 따라해 보았습니다..
   8. 검증 로직에 대한 테스트 코드도 추가해주세요!클래스별로 테스트코드를 만든다 생각하시면 될 것 같아요 
     -> 테스트 코드 추가