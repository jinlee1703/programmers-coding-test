# 깊이/너비 우선 탐색(DFS/BFS)

## 타겟 넘버

- DFS(재귀)를 통해 풀었다.
- 재귀의 탈출 조건은 `depth == numbers.length`이다. 즉 numbers를 모두 방문하였을 경우.
- 만약 numbers를 모두 방문한 상태에서 sum이 target과 동일하다면 answer의 값을 1 증가시킨다.
- `dfs(numbers, depth + 1, target, sum + numbers[depth]); dfs(numbers, depth + 1, target, sum - numbers[depth]);`: depth를 1 증가(다음 원소 체크)시키고, sum에서 현재 원소를 덧셈 혹은 뺄셈을 수행하기 위해 두 개의 dfs 함수의 sum 인자를 각각 `sum + numbers[depth]`와 `sum - numbers[depth]`로 호출한다.
