package edu.psu.ist311.greedy;

import java.util.*;

public class Greedy {

    public static final List<Integer> NO_SOLUTION = Collections.emptyList();

    /**
     * Finds and returns a list containing the minimum number of coins needed to
     * reach a given {@code target} amount given only a set of
     * {@code denominations}.
     * <p>
     * <b>requires:</b> (forall coins c in denominations, c >= 0) and target >= 0<p>
     * <b>ensures:</b> minCoins =
     *         [smallest collection S of coins c (such that c in denominations) and
     *                      (sum S = target)]</pre>
     *
     * @throws IllegalArgumentException if a denomination of 0 or less is
     *                                  encountered or if {@code target} is
     *                                  negative
     */
    public static List<Integer> minCoins(Set<Integer> denominations, int target) {

       List<Integer> result = new ArrayList<>();

       while((sumOf(result) != target) && (!denominations.isEmpty())){
           int x = denominations.stream().max(Integer :: compareTo).get();
           if(x <= 0){
               throw new IllegalArgumentException("negative input!");
           }
           denominations.remove(x);
           if(sumOf(result) + x <= target){
               result.add(x);
           }
        }if(sumOf(result) == target){
           return result;
       }else{
          return NO_SOLUTION;
        }
    }

    public static int sumOf(List<Integer> c) {
        int result = 0;
        for (Integer i : c) {
            result += i;
        }
        return result;
    }
}
