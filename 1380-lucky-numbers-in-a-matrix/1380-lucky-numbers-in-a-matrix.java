class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[0].length; j++) {
                min = Math.min(min, matrix[i][j]);
            }
            set.add(min);
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < matrix[0].length; i++) {
            int max = Integer.MIN_VALUE;

            for (int j = 0; j < matrix.length; j++) {
                max = Math.max(matrix[j][i], max);
            }

            if (set.contains(max)) {
                list.add(max);
            }
        }

        return list;
    }
}