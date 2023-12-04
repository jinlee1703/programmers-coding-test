# 스택/큐

## Solution1. 같은 숫자는 싫어

- peek라는 변수를 통해 스택의 최상단 위치를 저장하고, Integer 배열을 구현하여 풀었다.
- 다만 출력이 귀찮아서 ArrayList를 선언하여 풀었는데, 이 부분은 시간도 낭비하고, 좋은 코드는 아닌거 같다.

## Solution2. 기능개발

- `java.util.Queue` 자료구조 라이브러리를 사용하여 작업 번호를 큐에 저장하였다.
- while 반복문으로 `day` 변수를 1씩 증가시키고, 2중 while 반복문으로 queue의 peek()를 통해 작업의 완료여부를 체크하고, 다음 peek()를 체크하는 방식으로 구현하였다.
- 작업이 완료되면 `deployCount` 변수를 증가시키고, day 별로 `deployCount`가 1 이상이면 `java.util.ArrayList` 자료구조에 추가하고 최종적으로 이를 반환하였다.