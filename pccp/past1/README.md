# [PCCP 기출문제] 1번

## 풀이

가장 쉽게 생각할 수 있는 아이디어인 `시간을 1초 씩 진행 시켜서 해결`하는 방법으로 풀었다.

### 1. 변수 선언 및 초기화

<img width="892" alt="image" src="https://gist.github.com/assets/68031450/e4fe349b-0df0-4e76-b514-4aaa6077347c">

- 현재 체력을 사용하기 위해 `answer`를 `health` 변수로 초기화시켜주었다.
- `skillTime`, `secondRecovery`, `additionalRecovery` 같은 변수들은 매개 기존 1차원 배열인 `bandage`의 각 원소로 존재하고 있지만 보다 명시적으로 사용하기 위해 따로 선언을 해두었다.
- 게임을 종료 시간을 정의하기 위해 최종 공격의 시간을 `immediateTime`로 정의하였다.
- 현재 게임 진행 시간인 `second`, 스킬 연속 시전 시간인 `castingTime`, `attacks` 배열은 정렬되어 있기 때문에 큐처럼 사용하기 위한 attacks의 `front`를 정의하였다. 

### 2. while 반복문을 통한 게임 진행

<img width="354" alt="image" src="https://gist.github.com/assets/68031450/07429f16-2e62-4a97-a5cb-34edc5b23dba">

while 반복문을 통해 게임 종료 조건을 정의하였고, 매 반복마다 `second` 변수를 증가시켜 주었다.

### 3. 공격을 받았을 경우

<img width="372" alt="image" src="https://gist.github.com/assets/68031450/720514f6-4412-4b39-91c5-8b1aec81332d">

**공격 시간과 현재 게임을 진행 중인 시간이 일치하는 경우**이다. `answer(현재 체력)`은 공격 데미지 만큼 감소되고, `front`는 1 증가 시켜줌으로써 다음 공격을 가르키도록 한다. `castingTime`도 초기화된다. 만약 체력이 0 이하가 된다면 더 이상 게임 진행이 불가능하기 때문에 2번의 while 반복문에서 빠져 나오도록 하였다.

### 4. 공격을 받지 않았을 경우

<img width="496" alt="image" src="https://gist.github.com/assets/68031450/7ed53964-c3f6-4a48-941b-77672be1c0c1">

**스킬을 시전함으로써 체력을 회복**하도록 한다. 현재 체력(`answer`)에서 스킬의 초당 회복량(`secondRecovery`) 만큼 증가시켜 주고, 만약 스킬이 몬스터의 방해를 받지 않고 성공적으로 완료되었을 경우(`if (++castingTime % skillTime == 0)`), 추가적으로 회복(`additionalRecovery`)을 할 수 있도록 한다. 최대 체력 제한이 있기 때문에 3항 연산자로 최대 체력을 초과하였을 경우 현재 체력의 값을 최대 체력(`health`)로 변경해 주었다.

## 다른 사람의 풀이를 보고 느낀 점

정말 깔끔하다. 나처럼 시간의 흐름으로 푼 것이 아닌 `attacks`를 통한 foreach문으로 해결하였기 때문에, 2중 반복문을 사용하지도 않았다. 변수명이 명확하지 않아서 이해를 하는 데에는 조금 걸렸지만 확실히 좋은 코드인 것 같다.