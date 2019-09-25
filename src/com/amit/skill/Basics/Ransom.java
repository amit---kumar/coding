package com.amit.skill.Basics;

/**
 * Created by amit on 1/10/16.
 */
import java.util.*;

public class Ransom {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;

    public Ransom(String magazine, String note) {
        //System.out.println(magazine+" "+note);
        //StringTokenizer token=new StringTokenizer(magazine," ");
        magazineMap=new HashMap();
        noteMap=new HashMap();
        String [] token=magazine.split("\\s+");
        for(int i = 0; i < token.length; i++){
            if(magazineMap.containsKey(token[i])){
                int v=magazineMap.get(token[i]);
                magazineMap.put(token[i],v+1);
            }else{
                magazineMap.put(token[i],1);
            }
        }

        String [] token2=note.split("\\s+");
        for(int i = 0; i < token2.length; i++){
            if(noteMap.containsKey(token2[i])){
                int v=noteMap.get(token2[i]);
                noteMap.put(token2[i],v+1);
            }else{
                noteMap.put(token2[i],1);
            }
        }

    }

    public boolean solve() {

        Iterator<String> keySetIterator = noteMap.keySet().iterator();
        while(keySetIterator.hasNext()){
            String key = keySetIterator.next();
            if (magazineMap.containsKey(key)){
                int a=magazineMap.get(key);
                int b=noteMap.get(key);
                if(b>a)
                    return false;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Eat whitespace to beginning of next line
        scanner.nextLine();

        Ransom s = new Ransom(scanner.nextLine(), scanner.nextLine());
        scanner.close();

        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");

    }
}

