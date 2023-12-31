# 탐욕법(Greedy)

## Solution1. 체육복

- int[] 배열인 `student`에 학생이 가지고 있는 체육복의 갯수를 저장하였다.
- `if(i - 1 >= 0 && student[i - 1] == 1)`: 왼쪽 학생이 체육복을 가지고 있을 경우를 체크한다.
- `else if(i + 1 < student.length && student[i + 1] == 1)`: 오른쪽 학생이 체육복을 가지고 있을 경우를 체크한다.
- `else`: 좌, 우의 학생이 체육복을 가지고 있지 않으므로, 정답에서 -1을 빼줌으로써 체육수업을 들을 수 없음을 체크한다.

## Solution2. 조이스틱

- [참고자료](https://velog.io/@jeeseob5761/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EC%A1%B0%EC%9D%B4%EC%8A%A4%ED%8B%B1)

## Solution3. 큰 수 만들기

- `java.util.Stack` 라이브러리를 사용하여 풀었다.
- 해당 문제의 패턴은 앞에서부터 i-1번째 숫자가 i번째 숫자보다 작을 경우 추가하지 않는 것이다.
- 이러한 규칙이 스택과 유사하기 때문에 스택을 사용하여 stack의 최상단 원소가 현재 원소보다 작을 경우 이를 pop 하도록 구현하였다.

## Solution4. 구명보트

- [참고자료](https://easybrother0103.tistory.com/126)

## Solution5. 섬 연결하기

- [참고자료](https://maetdori.tistory.com/entry/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EC%84%AC-%EC%97%B0%EA%B2%B0%ED%95%98%EA%B8%B0)

## Solution6. 단속카메라

- 차량의 경로 배열을 종료 지점 기준으로 정렬시킨다.
- 각 배열을 돌면서 카메라의 시작 위치가(초기값은 int의 최소값으로 설정하였음)가 현재 카메라의 위치보다 클 경우(기존에 설치한 카메라가 현재 경로를 커버하지 못하고 있다는 의미) 카메라를 추가하는 방식으로 구현하였음
- [참고자료](https://velog.io/@ahnick/programmers-%EB%8B%A8%EC%86%8D%EC%B9%B4%EB%A9%94%EB%9D%BC)
