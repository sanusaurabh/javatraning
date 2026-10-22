package loopPractice;

/* student search loop */
public class StudentSearchLoop {

    public static void main(String[] args) {
        String[] students = {"raman" , "Sohel", "karima", "kritagya", "kyansh" , "vidhansh", "limka", "dikya", "rekashi"};
        String search = "krity";
        boolean found = false;

        for(String s : students) {
            if(s.equals(search)){
                found = true;
                break;
            }
        }

        if(found) System.out.println("Found");
        else System.out.println("Not Found");
    }
}
