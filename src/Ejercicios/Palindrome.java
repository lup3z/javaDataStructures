package Ejercicios;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Palindrome {
    public static void main(String[] args) {
        String pal ="anitalavalatina";
        List<Character> palabra=new ArrayList<>();
        for (int i=0; i<pal.length(); i++ ){
            palabra.add(pal.charAt(i));
        }
        List<Character> copiarOriginal = new ArrayList<>(palabra);
        Collections.reverse(palabra);
        if (copiarOriginal.equals(palabra)){
            System.out.println("Es palindrome");
        }
        else{
            System.out.println("No es palindrome");
        }

    }

    }
