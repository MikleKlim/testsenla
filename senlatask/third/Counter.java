package senlatask.third;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Counter {
    
    private List<String> strings;
    
    private void read() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in,"Cp1251"));
        String str = br.readLine();
        strings = new ArrayList<>();
        String[] strs = str.split(" ");
        strings.addAll(Arrays.asList(strs));
    }
    
    private int vowels(String s){
        int count = 0;
        char[] chars = s.toCharArray();
        char[] vowels = {'а', 'о', 'э', 'е', 'и', 'ы', 'у', 'е', 'ю', 'я'};
        for(int i = 0; i < chars.length; i++){
            for(int j = 0; j < vowels.length; j++){
                if(chars[i] == vowels[j]){
                    count++;
                }
            }
        }
        return count;
    }
    private boolean funcCompare(String s1,String s2){
        int n1=vowels(s1);
        int n2=vowels(s2);
        return n1>n2;
    }
    
    public void calculate() throws IOException{
        this.read();
        
        this.sort();
        
        int j = 0;
        for(String s: strings){
            s.toLowerCase();
            int i = 0;
            for(char c: s.toCharArray()){
                if(c == 'а' || c == 'о' || c == 'э' || c == 'е' || c == 'и' ||
                        c == 'ы' || c == 'у' || c == 'ё' || c =='ю' || c == 'я'){
                    StringBuilder sb = new StringBuilder(s);
                    sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
                    strings.set(j, sb.toString());
                    break;
                }
                i++;
            }
            j++;
        }

        for(String s: strings){
            System.out.println(s);
        }
    }
    
    public void sort(){
        for(int i = 0; i< strings.size() - 1; i++){
            for(int j = 1; j < strings.size() - i - 1; j++){
                if(funcCompare(strings.get(j), strings.get(j+1))){
                    String buff = strings.get(j);
                    strings.set(j, strings.get(j+1));
                    strings.set(j+1, buff);
                }
            }
        }
    }
    
}
