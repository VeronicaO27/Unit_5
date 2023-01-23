import org.example.BalancedParentheses;
import org.junit.Test;
import static org.junit.Assert.*;

public class BalancedParenthesesTest {
    @Test
    public void testIsBalancedParentheses() {
        BalancedParentheses bp = new BalancedParentheses();

        // Test case 1: Balanced Parentheses
        String s1 = "()";
        boolean expectedOutput1 = true;
        boolean output1 = bp.isBalancedParentheses(s1);
        assertEquals(expectedOutput1, output1);

        // Test case 2: Unbalanced Parentheses
        String s2 = "(";
        boolean expectedOutput2 = false;
        boolean output2 = bp.isBalancedParentheses(s2);
        assertEquals(expectedOutput2, output2);

        // Test case 3: Complex Parentheses
        String s3 = "(a+b*(c-d))";
        boolean expectedOutput3 = true;
        boolean output3 = bp.isBalancedParentheses(s3);
        assertEquals(expectedOutput3, output3);

        // Test case 4: Complex Parentheses
        String s4 = "(a+b*(c-d)){";
        boolean expectedOutput4 = false;
        boolean output4 = bp.isBalancedParentheses(s4);
        assertEquals(expectedOutput4, output4);
    }
}

