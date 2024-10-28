package math;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Boobgi {
    private static final Map<String, Double> items = new HashMap<>();
    private static final Random rd = new Random();

    static {
        // 아이템 이름과 아이템의 확률을 설정
        items.put("킹왕짱 슈퍼검", 5.0); // 5%
        items.put("덜 킹왕짱 슈퍼검", 10.0);    // 10%
        items.put("아주 덜 킹왕짱 슈퍼검", 20.0);     // 20%
        items.put("아주 아주 덜 덜 킹왕짱 슈퍼검", 65.0);  // 65%
    }

    public static String drawItem() {
        double rdValue = rd.nextDouble() * 100;
        double precent = 0.0;

        for (Map.Entry<String, Double> item : items.entrySet()) {
        	 precent += item.getValue();
            if (rdValue <= precent) {
                return item.getKey();
            }
        }
        return "Nothing";
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("뽑은 아이템은: " + drawItem() + "입니다.");
        }
    }
}
