import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MeetingRooms {
    public int findNumRooms(int[][] intervals) {
        if (intervals.length == 0){
            return 0;
        }
        // Min Heap to hold the ending time
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(intervals.length, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a - b;
            }
        });
        // sort intervals by starting time
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(final int[] a, final int[] b) {
                return a[0] - b [0] ;
            }
        });
        // add end time of first meeting to minHeap\
        minHeap.add(intervals[0] [1]);

        for(int i = 1; i < intervals.length; i++){
            if (intervals[i] [0] >= minHeap.peek()){
                minHeap.poll();
            }
            minHeap.add(intervals[i] [1]);
        }
        return minHeap.size(); // this is the min rooms required




    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] nums = new int[n][2];
        for(int i = 0 ; i < n ;i++) {
            nums[i][0] = scanner.nextInt();
            nums[i][1] = scanner.nextInt();
        }
        int result = new MeetingRooms().findNumRooms(nums);
        System.out.printf("%d", result);
    }
}