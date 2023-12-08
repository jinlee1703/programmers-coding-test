# 정렬

## Solution1. K번째수

- `java.util.ArrayList` 라이브러리를 사용하여 풀었으나(정답 처리), 다른 사람의 풀이를 참고하여 `int[]`로 변경하여 다시 풀어보았다.
- `Arrays.copyOfRange`와 `Arrays.sort` 메서드를 사용하여 풀었는데, 나는 `Arrays` 라이브러리에 대한 이해가 부족하고, `Collections` 라이브러리만 알고 있어서 `List`를 사용하여 풀었는데, `Arrays` 라이브러리에 대한 이해도를 높여서 자유자재로 쓸 수 있는 수준이 되어야겠다라는 것을 느꼈다.
- 특히 `Arrays.copyOfRange`의 경우에는 `(복사할 배열, 시작 인덱스, 종료 인덱스-1)`이기 때문에 종료 인덱스에 유의하여야 한다.

## Solution2. 가장 큰 수

- 위의 문제를 바로 적용하여 `Arrays` 라이브러리를 사용하여 풀었다.
- 우선 기존의 int형 배열인 `numbers`를 String 배열인 `array`로 치환하였다. 이는 추후 sort를 위한 과정이다.
- `Array.sort`에는 새로운 `Comparator`를 구현하였다.
- `if ("0".equals(array[0]))` : 만약 0만 존재하는 배열일 경우 "000"을 리턴하면 안되기 때문에 "0"을 리턴한다.
- 마지막으로 `array`를 이어붙여서 answer을 완성시킨다.

## Solution3. H-Index

- `Arrays` 라이브러리를 사용하여 풀었다.
- for 반복문을 사용하여 int형 변수 `h`에 `i`를 빼서, "h번 이상 인용된 논문"의 수를 구하도록 하였다.
- `if (citations[i] >= h)` : "i번째 논문이 인용된 수"가 "h번 이상 인용된 논문의 수"보다 크다면, 조건을 만족하여 answer에 값을 저장하고, `break`하여 값을 리턴한다.
