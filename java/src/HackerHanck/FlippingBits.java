class FlippingBits {


    public static void main(String[] args){

        int numero = 4;
        int contador = 0;
        String binario = "";

        while (numero > 0){

            binario += numero % 2;
            numero = numero / 2;

        }
        System.out.print(binario);

        /*
        System.out.print(String.format("%32s", Integer.toBinaryString(numero)).replaceAll(" ", "0")); 

        System.out.println("i: " + String.format("%32s", 
            Integer.toBinaryString(numero)).replaceAll(" ", "0"));
            */


    }


}