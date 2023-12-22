import java.util.*;

class Job implements Comparable<Job> {
    int arrival;
    int burst;
    
    Job(int arrival, int burst) {
        this.arrival = arrival;
        this.burst = burst;
    }
    
    public String toString() {
        return "{arrival: " + this.arrival + ", burst: " + this.burst + "}";
    }
    
    public int compareTo(Job other) {
        return this.burst - other.burst;
    }
}

class Solution {
    public int solution(int[][] jobs) {
        Queue<Job> heap = new PriorityQueue<>();
        Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]);
        
        int idx = 0;
        int time = jobs[0][0];
        int waitingTime = 0;
        
        while (idx < jobs.length || !heap.isEmpty()) {
            while(idx < jobs.length && jobs[idx][0] <= time){
                int[] job = jobs[idx++];
                heap.add(new Job(job[0], job[1]));
            }
            
            if (heap.isEmpty()) {
                int[] job = jobs[idx++];
                heap.add(new Job(job[0], job[1]));
                time = job[0];
            }
            
            Job job = heap.poll();
            time += job.burst;
            waitingTime += time - job.arrival;
        }
        
        return waitingTime / jobs.length;
    }
}