public class ParenthesesChecker {
    // Método que verifica se os parênteses estão balanceados
    public int isBalanced(String str) {
        int count = 0;

        for (char c : str.toCharArray()) {
            if (c == '(') {
                count++;
            } else if (c == ')') {
                if (count == 0) return 0;
                count--;
            }
        }

        return count == 0 ? 1 : 0;
    }
}
