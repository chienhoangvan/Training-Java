package com.company;
import java.util.*;

public class ChangingBinary {
    private Stack<Integer> st = new Stack<>();
    private int n;

    public void setN(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public ChangingBinary() {}

    public ChangingBinary(Stack<Integer> st, int n) {
        this.st = st;
        this.n = n;
    }

    public String changeToBinary(int n) {
        String result ="";
        while(n > 0){
            int tmp = n % 2;
            st.push(tmp);
            n = n / 2;
        }
        while(!st.isEmpty()){
            result = result + st.pop();
        }
        return result;
    }

}
