package test03;

import java.time.Instant;

public class cytech03 {
	public static void main(String[] args) {
	 long seconds = Instant.now().getEpochSecond();
     System.out.println("現在の秒数: " + seconds);

     if (seconds % 2 == 0) {
         System.out.println("偶数です");
     } else {
         System.out.println("奇数です");
     }
	}
}
	
