class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;
        
        int skillTime = bandage[0];             // 스킬 종료 시간
        int secondRecovery = bandage[1];        // 초당 회복량
        int additionalRecovery = bandage[2];    // 추가 회복량
        
        int immediateTime = attacks[attacks.length - 1][0]; // 최종 공격이 끝난 직후 시간(게임 종료 시간)
        
        int second = 0;
        int castingTime = 0;
        int front = 0;
        while (second < immediateTime) {
            ++second;
            if (attacks[front][0] == second) {
                answer -= attacks[front][1];
                ++front;
                castingTime = 0;
                
                if (answer < 1) {
                    break;
                }
            } else {
                if (answer != health) {
                    answer += secondRecovery;
                    if (++castingTime % skillTime == 0) {
                        answer += additionalRecovery;
                        castingTime = 0;
                    }
                    
                    answer = answer > health ? health : answer;
                }
            }
        }
        
        return answer > 0 ? answer : -1;
    }
}