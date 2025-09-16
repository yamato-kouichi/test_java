package test04;

import java.time.Instant;

public class cytech04 {
    public static void main(String[] args) {
        long seconds = Instant.now().getEpochSecond();
        System.out.println("現在の秒数: " + seconds);

        switch ((int)(seconds % 2)) {
            case 0:
                System.out.println("偶数です");
                break;
            case 1:
                System.out.println("奇数です");
                break;
        }
    }
}