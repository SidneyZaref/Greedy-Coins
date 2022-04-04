package edu.psu.ist311.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class GreedyTests {

    private Set<Integer> coins(Integer ... x) {
        return new HashSet<>(Arrays.asList(x));
    }

    @Test
    public void testSmall() {
        Set<Integer> s = coins(1, 2, 5, 10, 20, 50);
        List<Integer> x = Greedy.minCoins(s, 33);
        Assertions.assertEquals(4, x.size());
        Assertions.assertTrue(x.contains(20));
        Assertions.assertTrue(x.contains(10));
        Assertions.assertTrue(x.contains(2));
        Assertions.assertTrue(x.contains(1));
    }

    @Test
    public void testSmall2() {
        Set<Integer> s = coins( 10, 20, 50);
        List<Integer> x = Greedy.minCoins(s, 33);
        Assertions.assertEquals(0, x.size());
        Assertions.assertEquals(x, Collections.emptyList());
    }

    @Test
    public void testSmall3() {
        Set<Integer> s = coins( 1, 10, 20, 50);
        List<Integer> x = Greedy.minCoins(s, 33);
        Assertions.assertEquals(0, x.size());
        Assertions.assertEquals(x, Collections.emptyList());
    }

    @Test
    public void testSmall4() {
        Set<Integer> s = coins( 1, 10, 20, 50);
        List<Integer> x = Greedy.minCoins(s, 33);
        Assertions.assertEquals(0, x.size());
        Assertions.assertEquals(x, Collections.emptyList());
    }

    @Test
    public void testSmall5() {
        Set<Integer> s = coins( 1, 10, 20, 50);
        List<Integer> x = Greedy.minCoins(s, 10);
        Assertions.assertEquals(1, x.size());
        Assertions.assertTrue(x.contains(10));
    }

    @Test
    public void testExceptional1() {
        Set<Integer> s = coins( 0, 10, 2);
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> Greedy.minCoins(s, 33));
    }

    @Test
    public void testExceptional2() {
        Set<Integer> s = coins( -1);
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> Greedy.minCoins(s, 33));
    }

    @Test
    public void testEmpty() {
        Set<Integer> s = coins( );
        Assertions.assertEquals(Collections.emptyList(),
                Greedy.minCoins(s, 2));
    }

    @Test
    public void testZeroTarget() {
        Set<Integer> s = coins( 10, 20 );
        Assertions.assertEquals(Collections.emptyList(),
                Greedy.minCoins(s, 0));
    }
}
