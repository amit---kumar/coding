package Hackerearth.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import for Scanner and other utility classes


/**
 * Created by amitkumar on 17/2/18.
 */
public class P1 {
    public static void main(String[] args) throws IOException {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char vowels []={'A','E','I','O','U'};
        for (int i = 0; i <n ; i++) {
            String str= br.readLine().toUpperCase();
            int count=0;
            for (int j = 0; j <vowels.length ; j++) {
                for (int k = 0; k < str.length(); k++) {
                    if(str.charAt(k)==vowels[j])
                        count++;
                }
            }
            System.out.println(count);
        }

//        //Scanner
//        Scanner s = new Scanner(System.in);
//        String name = s.nextLine();                 // Reading input from STDIN
//        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
//
//        */

    }
}
