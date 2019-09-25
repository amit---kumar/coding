package com.amit.skill.InterviewPreparationKit.warmup;
import java.util.Stack;

public class CountingValleys
{
    public static void main(String[] args)
    {
        System.out.println(countingValleys(8, "UDDDUDUU"));
    }

    static int countingValleys(int n, String s) {
        Stack<Character> stack = new Stack<>();
        int count=0;
        for (int i = 0; i <n ; i++)
        {
            if(s.charAt(i)=='D' && stack.empty()){
                stack.push(s.charAt(i));
                count++;
            }else if(s.charAt(i)=='D' && stack.peek()=='D')
                stack.push(s.charAt(i));
            else if(s.charAt(i)=='D' && stack.peek()=='U')
                stack.pop();
            else if(s.charAt(i)=='U' && stack.empty()){
                stack.push(s.charAt(i));
            }else if(s.charAt(i)=='U' && stack.peek()=='U')
                stack.push(s.charAt(i));
            else if(s.charAt(i)=='U' && stack.peek()=='D')
                stack.pop();
        }
        return count;
    }
}
