package loopPractice;

public class StudentPassOrFail {

        public static void main(String[] args) {
            int[] marks = {35, 78, 22, 90, 45};

            for(int m : marks) {
                if (m >= 33) {
                    System.out.println(m + " - Pass");
                } else {
                    System.out.println(m + " - Fail");
                }
            }
    }
}
