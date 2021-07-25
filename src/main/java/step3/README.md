### 기능 요구사항
- [x] 사용자는 몇 대의 자동차로 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다. #RacingCarGame#main
    - [x] 몇 대의 자동차를 입력 할 수 있어야한다. 
        - [x] 자동차는 경기장에 입장을 할 수 있어야한다. #CarStadium#enterCar()
    - [x] 몇 번 이동할것인지 입력 할 수 있어야한다.
        - [x] 모든 자동차의 움직일 수 있는 시간이 제한되어있다 #CarStadium#limiteTime()
    
- [x] 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다. #Stadium#MoveCars()
    - [x] 자동차 전진 #Car#Move()
      - [x] 0에서 9 사이에서 random 값을 생성한다. #NumberGenerator#createRandomNumbers()
      - [x] 전진하는 조건은 4이상의 값이여야한다. #CarEngine#canGo()
      - [x] 자동차가 없는데 움직이면 illegalargument 발생
    - [x] 심판은 제한된 시간이 지나면 멈출 수 있다. #Referee#isStopMove()
        - [x] 제한된 시간이 지났는데 움직이면 illegalargument 발생
  
- [x] 자동차의 위치를 확인 할 수 있다  #Stadium#showCarsLocation()
  - [x] 자동차는 현재 자신의 위치를 보여줄수있어야한다 #Car#showNowLocation()
    - 어느 시점에 출력할 것인지에 대한 제약은 없다.


### 프로그래밍 요구사항
- [x] 모든 로직에 단위 테스트를 구현한다. 단, UI(System.out, System.in) 로직은 제외
- [ ] 자바 코드 컨벤션을 지키면서 프로그래밍한다.
- [x] else 예약어는 사용하지 않는다.
    - switch/case도 허용하지 않는다.
- [x] README.md 파일에 기능 목록 단위로 추가한다.
- [ ] commit메세지 convention을 지키면서 프로그래밍한다.