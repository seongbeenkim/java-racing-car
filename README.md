# 자동차 게임

백개길 자동차 게임 미션 저장소

# 구현해야할 기능 목록
- [] 입력
    - [] 이름 입력
    - [] 시도 횟수 입력

- [] 출력
    - [] 각 자동차의 현재 위치 출력
    - [] 우승자들의 이름 출력

- [] 자동차
    - 요소
    - [] 이름
    - [] 위치
  
    - 기능
    - [] 전진
        - [] 난수 생성기에서 생성된 난수를 인자로 받아 4 이상일 경우 전진
    - [] 자신의 위치 값 반환
    - [] 자신의 이름 값 반환
    - [] 최대 위치 값을 인자로 받은 후 자신의 위치값과 같은 지 비교하는 기능

- [x] 난수 생성기
    - [x] 0 ~ 9의 난수 생성

- [x] 문자열 분리기
    - [x] 인자로 받은 구분자를 기준으로 분리
        - [x] ERROR : 구분자가 존재하지 않을 경우
    - [x] 앞,뒤 공백 제거

- [] 자동차 경주
    - 요소
    - [] 자동차 리스트
    - [] 시도 횟수
    
    - 기능
    - [] 시도 횟수만큼 자동차 경주
    - [] 자동차의 최대 위치 값을 반환하는 기능
    - [] 우승자들의 이름을 반환하는 기능
