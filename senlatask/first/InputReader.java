package senlatask.first;

import java.util.Scanner;

public class InputReader {
    
    private String readString(){
        System.out.println("Enter string");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        return str;
    }
    
    public int calculateSum(){
        int sum = 0;
        String str = this.readString();
        for(char i: str.toCharArray()){
            if(Character.isDigit(i)){
                sum += (int)i - 48;
            }
        }
        return sum;
    }
}
