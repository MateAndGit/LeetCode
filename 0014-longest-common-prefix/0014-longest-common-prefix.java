class Solution {
    public String longestCommonPrefix(String[] strs) {
        // 1. 예외 처리: 배열이 비었거나 null이면 빈 문자열 반환
        if (strs == null || strs.length == 0) {
            return "";
        }

        // 2. 첫 번째 문자열을 기준 문자열로 사용
        String firstStr = strs[0];

        // 3. 기준 문자열의 문자를 앞에서부터 순서대로 순회 (i: 인덱스)
        for (int i = 0; i < firstStr.length(); i++) {
            char currentChar = firstStr.charAt(i);

            // 4. 나머지 모든 문자열 (strs[1]부터 끝까지)과 현재 문자(currentChar)를 비교
            for (int j = 1; j < strs.length; j++) {
                
                // 5. 종료 조건: 공통 접두사가 아님이 확인된 순간
                // 조건 A: 현재 인덱스(i)가 비교 문자열(strs[j])의 길이를 초과했거나 (비교 문자열이 더 짧음)
                // 조건 B: 현재 문자(currentChar)와 비교 문자열의 i번째 문자가 일치하지 않으면
                if (i == strs[j].length() || strs[j].charAt(i) != currentChar) {
                    
                    // 6. 지금까지 공통이었던 부분 문자열을 반환 (0부터 i 직전까지)
                    return firstStr.substring(0, i);
                }
            }
        }

        // 7. 모든 루프를 통과했다면, 첫 번째 문자열 전체가 공통 접두사임
        return firstStr;
    }
}