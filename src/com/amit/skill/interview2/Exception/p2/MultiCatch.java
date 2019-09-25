package com.amit.skill.interview2.Exception.p2;

/**
 * Created by amitkumar on 20/5/18.
 */


/**
 Multi catch feature is provided in java to remove code duplication in two different hierarchical exceptions.
 If you are using it for this reason the ordering does not matter. If you are catching parent exception class Exception in multi catch block,
 then there is no need to add child exception IOException, SQLException classes.
 */
public class MultiCatch {
    public static void main(String[] args) {
        try{
            int x = 5/0;
            int[] y= {4,5,6};
            int z = y[6];

        }
        // Compiler error multi catch must be disjoint,
/*        catch(ArrayIndexOutOfBoundsException | Exception e){
            e.printStackTrace();
        }*/
        catch(ArrayIndexOutOfBoundsException | NullPointerException e){
            e.printStackTrace();
        }
    }
}
