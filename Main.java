public class Main {
    public static void main(String[] args) {
        System.out.println("Ex 1");
        char[][] matrix = {
                {'1','0','1','0','0'},
                {'1','0','1','1','1'},
                {'1','1','1','1','1'},
                {'1','0','0','1','0'}
        };

        MaximalRectangle obj = new MaximalRectangle();
        System.out.println("Maior área encontrada: " + obj.maximalRectangle(matrix));

        System.out.println("\nEx 2");
        ParenthesesChecker checker = new ParenthesesChecker();

        System.out.println(checker.isBalanced("(hello (world))"));
        System.out.println(checker.isBalanced("((hello (world))"));
        System.out.println(checker.isBalanced("hello world"));
    }
}
