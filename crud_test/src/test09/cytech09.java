package test09;

public class cytech09 {
	public static void main(String[] args) {
        // [学生][科目]
        int[][] scores = {
            {80, 70, 90, 60},
            {55, 65, 75, 85},
            {100, 95, 80, 70},
            {60, 50, 40, 30},
            {88, 77, 66, 99}
        };

        String[] subjects = {"国語", "数学", "理科", "社会"};

        for (int i = 0; i < scores.length; i++) {
            System.out.println("学生" + (i + 1) + "の点数:");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.println("  " + subjects[j] + " : " + scores[i][j]);
            }
            System.out.println();
        }
    }
}
