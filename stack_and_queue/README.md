# 스택/큐

## Solution1. 같은 숫자는 싫어

- peek라는 변수를 통해 스택의 최상단 위치를 저장하고, Integer 배열을 구현하여 풀었다.
- 다만 출력이 귀찮아서 ArrayList를 선언하여 풀었는데, 이 부분은 시간도 낭비하고, 좋은 코드는 아닌거 같다.

## Solution2. 기능개발

- `java.util.Queue` 자료구조 라이브러리를 사용하여 작업 번호를 큐에 저장하였다.
- while 반복문으로 `day` 변수를 1씩 증가시키고, 2중 while 반복문으로 queue의 peek()를 통해 작업의 완료여부를 체크하고, 다음 peek()를 체크하는 방식으로 구현하였다.
- 작업이 완료되면 `deployCount` 변수를 증가시키고, day 별로 `deployCount`가 1 이상이면 `java.util.ArrayList` 자료구조에 추가하고 최종적으로 이를 반환하였다.

## Solution3. 올바른 괄호

- 자료구조 라이브러리(`java.util.Stack`)를 사용하여 풀었으나, 효율성 검사에 통과하지 못하여 수정하였다.
- `String.split()` 메서드를 사용하여 풀었으나 효율성 검사에 통과하지 못하여, s.toCharArray()를 사용하여 풀었다. => 이 방법으로 통과하였다.
- 이 문제의 경우에는 괄호의 종류가 1개이기 때문에 String이나 int 변수의 stack(배열)을 사용하지 않고 boolean으로 구현하였다.

## Solution4. 프로세스

- 자료구조 라이브러리(`java.util.Queue`)를 사용하여 풀었다.
- `int`형 변수인 `queueWeight`를 통해 현재 큐에 있는 트럭의 무게를 계산한다.
- `int`형 변수인 `time`을 통해 결과값인 시간을 계산한다.
- `for` 반복문을 통해 트럭의 수만큼 반복하도록 한다.
- `while` 반복문을 `true` 조건으로 설정하여 `if` 문 내의 `break` 구문으로만 빠져나올 수 있도록 한다.
- `if (queue.isEmpty())` : 큐가 비어있을 경우 truck을 큐에 추가하도록 한다.
- `else if (queue.size() == bridge_length)` : 다리의 길이와 큐의 크기가 같을 경우 큐의 가장 앞에 있는 원소를 제거한다.
- `else` - `if (queueWeight + truck <= weight)` : 큐에 원소를 추가할 수 있고, truck이 추가로 올라갈 수 있는 상태면, 큐에 truck을 추가한다.
- `else` - `else` : 큐에 원소를 추가할 수 있으나, truck이 추가로 올라갈 수 없는 상태(무게 초과)면, 0이라는 원소를 추가한다. 이는 `else if (queue.size() == bridge_length)`에서 큐의 원소를 제거하기 위해 빈 원소를 넣는 구문이다.

## Solution7. 주식가격

- 단순 2중 for문으로 해결했다.