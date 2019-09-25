package com.amit.skill.Hackerrank.Manhattan;

/**
 * Created by amitkumar on 30/5/18.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Intelligent_Substring {


    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        int n=str.length();
        int k=Integer.parseInt(br.readLine());
        String pattern=br.readLine();
        int result=-1;
        for(int i=0,j=-1;i<n;i++){
            if(pattern.charAt(str.charAt(i)-97)=='0')
                k--;
            while(k<0)
            {
                j++;
                if(pattern.charAt(str.charAt(j)-97)=='0')
                    k++;
            }
            if(k==0)
                result=Math.max(result, i-j);
        }
        System.out.println(result);

    }

}