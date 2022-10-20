package com.likelion.algorithm1019;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class Stack02Test {

    @BeforeEach
    void setUp() {
        // ex) db에서 데이터를 지우는 코드
        // ex) db에 데이터를 넣는 콛
        System.out.println("before each");
    }

    @Test
    @DisplayName("push가 잘 되는지")
    void pushAndPop(){
        Stack02 stack02 = new Stack02();
        stack02.push(10);
        stack02.push(20);
        Integer[] arr= stack02.getArr();

        // Assertions.assertEquals()
        assertEquals(20, arr[1]); // 이것만 써도 Assertions가 자동으로 import 됨
        assertEquals(10, arr[0]);
        assertEquals(20, stack02.pop());
        assertEquals(10, stack02.pop());

        stack02.pop();


    }

    // stack이 비어있을 때는? -> isEmpty
    @Test
    void isEmpty(){
        Stack02 stack02 = new Stack02();
        assertTrue(stack02.isEmpty());
        stack02.push(10);
        assertFalse(stack02.isEmpty());
        stack02.pop();
        assertTrue(stack02.isEmpty());
    }

    @Test
    void realStack(){
        Stack<Integer> st= new Stack<>();
        st.pop();
    }
}