# 깊이/너비 우선 탐색(DFS/BFS)

## Solution1. 타겟 넘버

- DFS(재귀)를 통해 풀었다.
- 재귀의 탈출 조건은 `depth == numbers.length`이다. 즉 numbers를 모두 방문하였을 경우.
- 만약 numbers를 모두 방문한 상태에서 sum이 target과 동일하다면 answer의 값을 1 증가시킨다.
- `dfs(numbers, depth + 1, target, sum + numbers[depth]); dfs(numbers, depth + 1, target, sum - numbers[depth]);`: depth를 1 증가(다음 원소 체크)시키고, sum에서 현재 원소를 덧셈 혹은 뺄셈을 수행하기 위해 두 개의 dfs 함수의 sum 인자를 각각 `sum + numbers[depth]`와 `sum - numbers[depth]`로 호출한다.

## Solution2. 게임 맵 최단거리

- BFS(큐)를 통해 풀었다.
- 큐에 넣을 때 이전 원소의 값 + 1 시켜줌으로써 해당 칸의 최단 거리를 구한다. 이를 통해 방문 체크도 겸하고 있다.
- 만약 `maps[N][M]`이 1일 경우에는 값이 변경되지 않았으므로, 해당 칸으로 가는 방법이 없다는 의미이고, 이는 -1을 반환하도록 한다.
- 공교롭게도 지난 에이블리 라이브 코딩 테스트 문제와 동일하다.

## Solution3. 단어 변환

- DFS(재귀)를 통해 풀었다.
- 재귀의 종료 조건은 변환하려는 단어와 목표하는 단어가 동일한 경우.
- DFS 함수 내에서 방문하지 않은 단어의 경우, 현재 단어와 글자 수가 1개만 다를 경우 재귀를 호출하도록 한다.
