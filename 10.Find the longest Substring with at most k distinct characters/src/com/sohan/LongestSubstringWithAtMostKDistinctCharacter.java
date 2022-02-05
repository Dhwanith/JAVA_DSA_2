package com.sohan;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubstringWithAtMostKDistinctCharacter {

    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        if(s.length() == 0 || k == 0)
            return 0;

        int window_start_ptr = 0, window_end_ptr = 0, max_window_len = 0;
        Map<Character , Integer> distinct_chars_map = new HashMap<>();
        for (; window_end_ptr < s.length() ; window_end_ptr++){
            char last_char = s.charAt(window_end_ptr);
            distinct_chars_map.put(last_char , distinct_chars_map.getOrDefault(last_char, 0) + 1);
            while (distinct_chars_map.size() > k){ // reduce character count in hash map
                char first_char = s.charAt(window_start_ptr);
                distinct_chars_map.put(first_char, distinct_chars_map.get(first_char) - 1);
                if (distinct_chars_map.get(first_char) == 0){
                    distinct_chars_map.remove(first_char); // If count is 0, remove character

                }
                window_start_ptr++; // reduction in window size

            }
            max_window_len = Math.max(max_window_len , window_end_ptr - window_start_ptr + 1);
        }


        return max_window_len;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        scanner.close();

        int result = new LongestSubstringWithAtMostKDistinctCharacter().lengthOfLongestSubstringKDistinct(s,k);
        System.out.println(result);
    }
}
