package Ejercicios;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContadorDeLetras {
    public static void main(String[] args) {
        String palabra = "The quick brown fox jumps over the lazy dog*/-*60";
        //Set<Character> letrasUnicas= new HashSet<>();
        Map<Character, Integer> letrasUnicas= new HashMap<>();
        palabra= palabra.toLowerCase();
        for (int i=0;i<palabra.length(); i++){
            char actual = palabra.charAt(i);
            if (Character.isAlphabetic(actual)){
                letrasUnicas.put(actual,1);
            }
        }
        if(letrasUnicas.keySet().size()==26){
            System.out.println("Contiene 26 letras es un pangrama");
        }
        else{
            System.out.println(letrasUnicas.size());
        }
    }
}
