package loopPractice;

public class MenuDoWhile {

    public static void main(String[] args){

        String[] menu = {"1. samosa", "2. litti", "3. chat", "4. coffee","5. tea" , "6.dosa","7.idli","8.chowmin","9.kalere li bhaji","10.nim ki chatni","11.mirchi ka pakoda","12.mummy ki chappal"};
        int i = 0;

        do {
            System.out.println(menu[i]);
            i++;
        }while(i < menu.length);
    }
}
