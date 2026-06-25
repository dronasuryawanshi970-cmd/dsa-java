class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        // Initialize all HashSets
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                char ch = board[i][j];

                // Skip empty cells
                if (ch == '.') {
                    continue;
                }

                // Find box number
                int boxIndex = (i / 3) * 3 + (j / 3);

                // Check if number already exists
                if (rows[i].contains(ch) ||
                    cols[j].contains(ch) ||
                    boxes[boxIndex].contains(ch)) {
                    return false;
                }

                // Add number to row, column and box
                rows[i].add(ch);
                cols[j].add(ch);
                boxes[boxIndex].add(ch);
            }
        }

        return true;
    }
}