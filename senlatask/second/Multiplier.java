package senlatask.second;

import java.util.Scanner;

public class Multiplier {
    private int read(){
        System.out.println("Enter the number");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        try{
            return Integer.parseInt(str);
        }catch(NumberFormatException e){
            System.out.println("Error: you enter not an integer");
        }
        return Integer.parseInt(str);
    }
    
    public void calculate(){
        int num = this.read();
        System.out.println("List of prime factors");
        for(int i = 1; i<= num; i++){
            if(num%i == 0){
                System.out.println(i);
            }
        }
    }
}
