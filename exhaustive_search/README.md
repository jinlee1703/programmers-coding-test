# 완전탐색

## Solution1. 최소직사각형

- 매우 쉬운 난이도의 문제이다.
- 2차원 배열인 sizes를 순회하면서 크기가 큰 길이를 w, 작은 길이를 h로 정한다.
- 그 후 w가 width보다 크면 width를 w로 바꿔주고, h도 height보다 크면 바꿔준다.

## Solution2. 모의고사

- 찍는 방식에 따라 3개의 메서드로 나누어서 풀었다.
- 나는 answers.length * 3의 횟수만큼 호출하지만 다른 사람의 경우에는 answers.length 만큼만 연산하는 방법이 있었다.

## Solution3. 소수 찾기

- 순열을 구해야하는 문제였다.
- 파이썬의 경우에는 `itertools`를 활용하면 금방 풀 수 있지만, 자바의 경우에는 직접 만들어서 구현해야하기 때문에 어려움을 겪었다.

## Solution4. 카펫

- 카펫의 가로는 최소 3부터 최대 yellow + brown으로 하여 for 반복문을 돌렸다.
- `if ((i - 2) * (width - 2) == yellow)` : yellow의 경우 `(가로 - 2) * (세로 - 2)`이기 때문에 해당 조건문으로 가로와 세로를 판별하였다.

## Solution5. 피로도

- DFS를 통해 풀었다.
- `public void dfs(int depth, int k, int[][] dungeons)`: `depth`는 던전의 방문 수, `k`는 남은 피로도를 의미하고, `dungeons`는 던전의 최소 필요 피로도와 소모 피로도이다.
- `for (int i = 0; i < dungeons.length; i++)`: 던전의 수만큼 반복한다.
- `if (!visited[i] && dungeons[i][0] <= k)`: 방문하지 않은 던전이고, 현재 피로도가 최소 필요도가 더 큰 경우를 체크한다.
- `visited[i] = true; dfs(depth + 1, k - dungeons[i][1], dungeons); visited[i] = false;`: 방문 처리 - 재귀 호출 - 방문 초기화를 순서대로 수행한다.

## Solution6. 모음사전

- DFS를 사용하여 순열을 구하여 풀었다.
- 1~5글자로 구성된 순열을 모두 리스트에 추가한다.
- 추가된 리스트를 정렬하면 나오는 결과는 문제에서 정의한 사전의 단어 순서와 동일하다.
- 해당 리스트에서 찾으려는 단어가 몇 번째 원소인 지 반환한다. (+1 해줌)

## Solution7. 전령망을 둘로 나누기

- DFS를 사용하여 풀었다.
- [참고자료](https://isshosng.tistory.com/162)
