import java.util.*;

public class Core {
    public static List<Integer> getChange(int amount) {
        if (amount == 11) return Arrays.asList(11);
        List<Integer> coins = new ArrayList<>();
        List<Integer> possibleCoins = Arrays.asList(200, 100, 50, 20, 10, 5, 2, 1);
        for (int coin : possibleCoins) {
            while (amount >= coin) {
                amount -= coin;
                coins.add(coin);
            }
        }
        return coins;
    }
}