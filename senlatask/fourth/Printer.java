package senlatask.fourth;

public class Printer {
    
    private char[][] digits;
    private int digitHeight = 6, size;

    char[][] one = {
        {' ', ' ', '*', '*', ' ', ' '},
        {' ', '*', ' ', '*', ' ', ' '},
        {' ', ' ', ' ', '*', ' ', ' '},
        {' ', ' ', ' ', '*', ' ', ' '},
        {' ', ' ', ' ', '*', ' ', ' '},
        {' ', '*', '*', '*', '*', ' '}
    };
    
    char[][] two = {
        {' ', ' ', '*', '*', ' ', ' '},
        {' ', '*', ' ', ' ', '*', ' '},
        {' ', ' ', ' ', ' ', '*', ' '},
        {' ', ' ', ' ', '*', ' ', ' '},
        {' ', ' ', '*', ' ', ' ', ' '},
        {' ', '*', '*', '*', '*', ' '}
    };
    
    char[][] three = {
        {' ', ' ', '*', '*', ' ', ' '},
        {' ', ' ', ' ', ' ', '*', ' '},
        {' ', ' ', '*', '*', ' ', ' '},
        {' ', ' ', ' ', ' ', '*', ' '},
        {' ', ' ', ' ', ' ', '*', ' '},
        {' ', ' ', '*', '*', ' ', ' '}
    };
    
    char[][] four = {
        {' ', ' ', ' ', '*', ' ', ' '},
        {' ', ' ', '*', '*', ' ', ' '},
        {' ', '*', ' ', '*', ' ', ' '},
        {'*', '*', '*', '*', '*', ' '},
        {' ', ' ', ' ', '*', ' ', ' '},
        {' ', ' ', ' ', '*', ' ', ' '}
    };
    
    char[][] five = {
        {' ', '*', '*', '*', '*', ' '},
        {' ', '*', ' ', ' ', ' ', ' '},
        {' ', ' ', '*', '*', ' ', ' '},
        {' ', ' ', ' ', ' ', '*', ' '},
        {' ', ' ', ' ', ' ', '*', ' '},
        {' ', '*', '*', '*', ' ', ' '}
    };
    
    char[][] sex = {
        {' ', ' ', '*', '*', ' ', ' '},
        {' ', '*', ' ', ' ', '*', ' '},
        {' ', '*', ' ', ' ', ' ', ' '},
        {' ', '*', '*', '*', ' ', ' '},
        {' ', '*', ' ', ' ', '*', ' '},
        {' ', ' ', '*', '*', ' ', ' '}
    };
    
    char[][] zieben = {
        {' ', '*', '*', '*', '*', ' '},
        {' ', ' ', ' ', ' ', '*', ' '},
        {' ', '*', '*', '*', ' ', ' '},
        {' ', ' ', '*', ' ', ' ', ' '},
        {' ', '*', ' ', ' ', ' ', ' '},
        {'*', ' ', ' ', ' ', ' ', ' '}
    };
    
    char[][] ocho = {
        {' ', ' ', '*', '*', ' ', ' '},
        {' ', '*', ' ', ' ', '*', ' '},
        {' ', ' ', '*', '*', ' ', ' '},
        {' ', '*', ' ', ' ', '*', ' '},
        {' ', '*', ' ', ' ', '*', ' '},
        {' ', ' ', '*', '*', ' ', ' '}
    };
    
    char[][] nueve = {
        {' ', ' ', '*', '*', ' ', ' '},
        {' ', '*', ' ', ' ', '*', ' '},
        {' ', ' ', '*', '*', '*', ' '},
        {' ', ' ', ' ', '*', ' ', ' '},
        {' ', ' ', '*', ' ', ' ', ' '},
        {' ', '*', ' ', ' ', ' ', ' '}
    };
    
    char[][] zero = {
        {' ', ' ', '*', '*', ' ', ' '},
        {' ', '*', ' ', ' ', '*', ' '},
        {' ', '*', ' ', ' ', '*', ' '},
        {' ', '*', ' ', ' ', '*', ' '},
        {' ', '*', ' ', ' ', '*', ' '},
        {' ', ' ', '*', '*', ' ', ' '}
    };
    
    private void addNumber(char[][] arr, int count){
        int order = count*6;
        for(int i = 0; i< digitHeight; i++){
            for(int j = 0; j<digitHeight; j++){
                digits[i][order + j] = arr[i][j];
            }
        }
    }
    
    public void print(){
        for(int i = 0; i< digitHeight; i++){
            for(int j = 0; j< size; j++){
                System.out.print(digits[i][j]);
            }
            System.out.println();
        }
    }
    
    public void fillArray(int number){
        
        String num = Integer.toString(number);
        size = num.length() * digitHeight;
        digits = new char[digitHeight][size];
        int count = 0;
        for(int i = 0; i < num.length(); i++){
            switch(num.charAt(i)){
                case '1':
                    addNumber(one, count);
                    break;
                case '2': 
                    addNumber(two, count);
                    break;
                case '3': 
                    addNumber(three, count);
                    break;
                case '4': 
                    addNumber(four, count);
                    break;
                case '5': 
                    addNumber(five, count);
                    break;
                case '6': 
                    addNumber(sex, count);
                    break;
                case '7': 
                    addNumber(zieben, count);
                    break;
                case '8': 
                    addNumber(ocho, count);
                    break;
                case '9': 
                    addNumber(nueve, count);
                    break;
                case '0': 
                    addNumber(zero, count);
                    break;
                    
            }
            count++;
        }
    }
    
}
