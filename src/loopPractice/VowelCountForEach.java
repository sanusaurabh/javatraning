package loopPractice;

public class VowelCountForEach {

    public static void main(String[] args) {
        char[] name = {'K','A','J','A','L','S','I','N','G','H'};
        int count = 0 ;

        for(char ch : name){
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'u'){
                count++;
            }
        }
        System.out.println("Vowels in kajal singh: "+ count);
    }
}
