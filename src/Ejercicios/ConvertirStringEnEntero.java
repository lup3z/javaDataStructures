package Ejercicios;

public class ConvertirStringEnEntero {
    public static void main(String[] args) {
        String numero="123abc";

        boolean esNumero = checarString(numero);
        if (esNumero){
            int num= convertirStringEnInteger(numero);
        }
        int num=Integer.valueOf(numero);
        System.out.println(num);
    }

    private static int convertirStringEnInteger(String numero) {
        //
        //
        //
        //
        return 0;
    }

    private static boolean checarString(String numero){
        char[] caracteres=numero.toCharArray();
        boolean esNumero=true;
        for (int i=0; i<caracteres.length; i++){
            char actual = caracteres[i];
            if (!Character.isDigit(actual)){
                esNumero=false;
                break;
                }
            }
             return esNumero;
         }
}
