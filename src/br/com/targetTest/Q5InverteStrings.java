package br.com.targetTest;

public class Q5InverteStrings {
    public static void main(String[] args) {
       
        String original = "Inverter a string";
        String invertida = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            invertida =invertida+ original.charAt(i);
        }

        System.out.println("String original: " + original);
        System.out.println("String invertida: " + invertida);
    }
}
