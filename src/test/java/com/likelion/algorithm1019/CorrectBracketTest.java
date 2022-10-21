package com.likelion.algorithm1019;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CorrectBracketTest {

    @Test
    @DisplayName("괄호가 잘 풀리는지") // method에 대해서 설명을 볼 수 있는지
    void solveBracket(){
        CorrectBracket correctBracket = new CorrectBracket();
        assertTrue(correctBracket.solution("()()"));
        assertTrue(correctBracket.solution("(())()"));
        assertFalse(correctBracket.solution(")()("));
        assertFalse(correctBracket.solution("(()("));
        assertFalse(correctBracket.solution( "((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))))))"));
    }

}