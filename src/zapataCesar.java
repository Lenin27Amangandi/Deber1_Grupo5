import java.util.Random;

class ZapataCesar {
    
    public void zcSN9(int terminos) {
        System.out.println("SN9: ");
        int inicio = 2;
        for(int i = 0; i <= terminos - 1; i++){
            System.out.print(inicio + " ");
            inicio*= 2;
        }
        System.out.println();
    }

    public void zcSN10(int terminos){
        System.out.println("SN10: ");
        int inicio = 3;
        for(int i = 0 ; i <= terminos-1 ; i++){
            System.out.print(inicio + " ");
            inicio*= 3;
        }
        System.out.println();
    }

    public void zcSN12(int terminos){
        System.out.println("SN12: ");
        int inicio     = 2;
        int incremento = 4;
        for(int i = 0; i <= terminos-1 ; i++){
            System.out.print( inicio + " ");
            inicio+=incremento;
            incremento+=2;            
        }
        System.out.println();
    }

    public void zcSC8(int caracteres){
        System.out.println("SC8: ");
        for(int i = 0; i <= caracteres-1; i++){
            char letra = (char)('a'+i);
            for(int j=0; j<2*i+1;j++){
                System.out.print(letra);
            }
            System.out.print(" ");
        }
       System.out.println(); 
    }
    
    public void zcSC9(int caracteres){
        int a = 0, b = 1;
        System.out.println("SC9: ");
        
        for (int i = 0; i < caracteres; i++) {
            char letra = (char) ('a' + i);
            
            for (int j = 0; j < b; j++) {
                System.out.print(letra);
            }
            System.out.print(" ");
    
            int sum = a + b;
            a = b;
            b = sum;
        }
        System.out.println();
    }    

    public void zcF9(int niveles){
        System.out.println("F9: ");

        String bajar = "|_";
        String subir = "_|";
        
        for (int p = 0; p < niveles * 3-1; p++) {
            System.out.print(" ");
        }
        System.out.println("_");
        for (int i = 0; i < niveles; i++) {
            for (int j = 0; j < (niveles - i - 1) * 3; j++) {
                System.out.print(" ");
            }
            System.out.print(subir);
            for (int j = 0; j < i * 6 ; j++) {
                System.out.print(" ");
            }
            if (i >= 0) {
                System.out.print(" "+bajar);
            }
            System.out.println();
        }        
        
    }

    public void zcF10(int niveles){
        System.out.println("F10: ");
        String positivo = "|_+_";
        String negativo = "|_-_";
        for(int i = 0; i < niveles; i++){
            for(int j = 0; j < i; j++){
                System.out.print("     ");
            }
            if(i%2!=0){
                System.out.println(positivo);
            }else{
                System.out.println(negativo);
            }
        }
        System.out.println();
    }


    public void zcF11(int niveles){
        System.out.println("F11: ");
        
        for (int p = 0; p < niveles; p++) {
            for (int s = 0; s <= p*3-1; s++) {
                System.out.print(" ");
            }
            System.out.print("|"); 
            for(int i = 0; i <= p ;i++){
                System.out.print("_");
            }
            System.out.println("");
        }
        System.out.println();
    }

    public void zcA1(){
        System.out.println("A1: ");
        String[] palabras = {"Cesar", "Josue", "Zapata", "Chilla"};
        int[] porcentajes = {100, 75, 50, 25};
    
        for (int i = 0; i < palabras.length; i++) {
            int longitudMostrar      = (int) Math.ceil((porcentajes[i] / 100.0) * palabras[i].length());
            String palabraPorcentaje = palabras[i].substring(0, longitudMostrar);
            
            int longitudBarra = 10; 
            int caracteresLlenos = (int) Math.ceil((porcentajes[i] / 100.0) * longitudBarra);
            
            System.out.print("[");
            for (int j = 0; j < longitudBarra; j++) {
                if (j < caracteresLlenos) {
                    System.out.print("=");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(">]      ");
            System.out.println(porcentajes[i] + " % " + palabraPorcentaje);
        }
        System.out.println();
    }

    public void zcA2(int tamano, char caracter) {
        System.out.println("A2: ");

        char[][] matrizC = new char[tamano][tamano];
        char[][] matrizZ = new char[tamano][tamano];

        for (int i = 0; i < tamano; i++) {
            matrizC[0][i] = caracter;
            matrizC[tamano - 1][i] = caracter;
        }
        for (int i = 0; i < tamano; i++) {
            matrizC[i][0] = caracter;
        }
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                if (matrizC[i][j] != caracter) {
                    matrizC[i][j] = ' ';
                }
            }
        }

        for (int i = 0; i < tamano; i++) {
            matrizZ[0][i] = caracter;
        }
        for (int i = 1; i < tamano - 1; i++) {
            matrizZ[i][tamano - 1 - i] = caracter;
        }
        for (int i = 0; i < tamano; i++) {
            matrizZ[tamano - 1][i] = caracter;
        }
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                if (matrizZ[i][j] != caracter) {
                    matrizZ[i][j] = ' ';
                }
            }
        }

        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                System.out.print(matrizC[i][j]);
            }

            System.out.print(" ");

            for (int j = 0; j < tamano; j++) {
                System.out.print(matrizZ[i][j]);
            }
            System.out.println();
        }
    }

    public void zcA3() {
        System.out.println("A3: ");
        String nombre  = "Cesar";
        int maxX       = 9;
        int maxY       = 12;
        char[][] plano = new char[maxX + 1][maxY + 1];

        for (int i = 0; i <= maxX; i++) {
            for (int j = 0; j <= maxY; j++) {
                plano[i][j] = ' ';
            }
        }

        for (int x = 0; x <= maxY / 2; x++) {
            int y = 2 * x;
            if (y <= maxX && x < nombre.length()) {
                plano[maxX - y][x] = nombre.charAt(x);
            }
        }

        for (int i = 0; i <= maxX; i++) {
            System.out.print((maxX - i) + " | ");
            for (int j = 0; j <= maxY; j++) {
                System.out.print(plano[i][j]);
            }
            System.out.println();
        }
        System.out.print("   ");
        for (int j = 0; j <= maxY; j++) {
            System.out.print("_");
        }
        System.out.println();
    }

    public void zcA4(){

        System.out.println("A4: ");

        String nombre   = "Cesar";
        String apellido = "Zapata";
        
        int tamano      = Math.max(nombre.length(), apellido.length());
        char[][] matriz = new char[tamano][tamano];

        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                matriz[i][j] = ' ';
            }
        }

        for (int i = 0; i < nombre.length(); i++) {
            matriz[i][i] = nombre.charAt(i);
        }

        for (int i = 0; i < apellido.length(); i++) {
            matriz[i][tamano - 1 - i] = apellido.charAt(i);
        }

        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
        
    public void zcA5() {
        System.out.println("A5: ");

        String nombre   = "Cesar Zapata Josue Chilla";
        int tamano      = 6;
        char[][] matriz = new char[tamano][tamano];
        Random random   = new Random();

        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {

                char caracter = nombre.charAt(random.nextInt(nombre.length()));
  
                if (i == j) {
                    matriz[i][j] = '*';
                } else {
                    matriz[i][j] = caracter;
                }
            }
        }

        try {
            for (int i = 0; i < tamano; i++) {
                for (int j = 0; j < tamano; j++) {
                    System.out.print(matriz[i][j] + "\t");
                    Thread.sleep(200); 
                }
                System.out.println();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}