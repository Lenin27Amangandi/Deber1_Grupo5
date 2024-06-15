public class MartinDavalos {

    int mdCantidadCaracteres;
    int mdNiveles;
    int mdA;
    int mdB;
    
    public int getMdA() {
        return mdA;
    }
    public void setMdA(int mdA) {
        this.mdA = mdA;
    }
    public int getMdB() {
        return mdB;
    }
    public void setMdB(int mdB) {
        this.mdB = mdB;
    }
    
    public int getMdNiveles() {
        return mdNiveles;
    }
    public void setMdNiveles(int niveles) {
        if (niveles < 0){
            System.out.println("No se puede ingresar una cantidad de niveles negativa");
            this.mdNiveles = 0;
        }
        this.mdNiveles = niveles;
    }
    public int getMdCantidadCaracteres() {
        return mdCantidadCaracteres;
    }
    public void setMdCantidadCaracteres(int mdCantidadCaracteres) {
        if (mdCantidadCaracteres <0){
            System.out.println("La cantidad de caracteres no puede ser negativa");
            this.mdCantidadCaracteres= 0;
        }
        this.mdCantidadCaracteres = mdCantidadCaracteres;
    }
    public void mdSN5 (int mdCantidadCaracteres){
        int mdContador =0;
        int mdI =2;
        while (mdContador<mdCantidadCaracteres){
            if(mdSN5B(mdI)){
                System.out.print(mdI+"    ");
                mdContador++;
            }
            mdI++;
        }
        System.out.println("    ");
    }
    private boolean mdSN5B (int mdNum){
       if (mdNum<=1){
            return false;
        } 
        for (int i = 2; i*i <= mdNum; i++) {
            if(mdNum%i==0){
                return false;
            }
        }
        return true;
    }
    
    public void mdSN6(int mdCantidadCaracteres){
        for(int i = 1; i <= mdCantidadCaracteres; i++){
          System.out.print((i*i)+"  ");
        }
        System.out.println("    ");
    }
    public void mdSN7(int mdCantidadCaracteres){
        int j=1;
        System.out.print(j+"    ");
        for (int i =0; i < mdCantidadCaracteres-1; i ++){
            System.out.print((j+=3) + "    ");
        }
        System.out.println("    ");
    }
    public void mdSN8(int mdCantidadCaracteres){
        int j=3;
        System.out.print(j+"    ");
        for (int i =0; i < mdCantidadCaracteres-1; i ++){
            System.out.print((j+=5) + "    ");
        }
        System.out.println("    "); 
    }
    public void mdF5(int mdNiveles ){
        int i = mdNiveles;
        while(i>0){
            for(int j = ( i*2)-1; j >0; j--){
                System.out.print("*");
            }
            System.out.println("");
            for(int j = -1; j <= mdNiveles-(i+1); j++){
                System.out.print(" ");
            }
            i--;
        }
        System.out.println("");

    }
    public void mdF6(int mdNiveles){
        int i = 1;
        while(i<=mdNiveles){
            for(int j = (mdNiveles-i); j > 0; j--){
                System.out.print(" ");
            }
            for(int j =0 ; j <( i*2)-1; j++){
                System.out.print("*");
            }
            System.out.println("");
            i++;
        } 
    }
    public void mdF7(int mdNiveles){
        int i=1;
        while (i<=mdNiveles) {
            for (int j = 0; j < i-1; j++) {
                System.out.print("      ");
            }
            System.out.println("|_ _ _");
            i++;
        }
    }
    public void mdF8(int mdNiveles){
        int i=mdNiveles;
        while (i>0) {
            for (int j =i-1; j >0 ; j--) {
                System.out.print("      ");
            }
            System.out.println("_ _ _|");
            i--;
        }
    }

    public int mdR1 (int mdA){
        if (mdA == 0){
            return 1;
        }else{
            return  mdA * mdR1(mdA-1);
        }
    }
    
    public int mdR2 (int mdA, int mdB){
        int aux = mdA;
        
        if ( mdB <= 0){
            System.out.println("El resultado de la suma es  " + (aux+mdB));
            return mdA;
        }else{
            return  mdR2(mdA+1, mdB-1);
        }

    }

    public int mdR3 (int mdA, int mdB){
        if (mdB == 0) {
            return 0;
        } else if (mdB == 1) {
            return mdA;
        } else if (mdA < 0 && mdB < 0) { // ambos números negativos
            return mdR3(-mdA, -mdB); // convierte ambos números a positivos
        } else if (mdA < 0) { // mdA es negativo
            return -mdR3(-mdA, mdB); // convierte mdA a positivo y cambia el signo del resultado
        } else if (mdB < 0) { // mdB es negativo
            return -mdR3(mdA, -mdB); // convierte mdB a positivo y cambia el signo del resultado
        } else {
            return mdA + mdR3(mdA, mdB - 1);
        }
    }

    public int mdR4 ( int mdA, int mdB){

        if ( mdB == 0){
            return 1;
        } else{
            return mdA * mdR4(mdA, mdB-1);
        }
    }
    
    public  void mdR5(int mdA) {
        mdR5(mdA, 1);
        System.out.println(" ");
    }

    private static void mdR5(int mdA, int mdCorriente) {
        if (mdCorriente <= mdA) {
            try {
                Thread.sleep(30);
            } catch (Exception e) {
                // TODO: handle exception
            }
            System.out.print(mdCorriente + "  ");
            mdR5(mdA, mdCorriente + 1);
        }
    }

    public  void mdR6(int mdA) {
        mdR6(0, mdA);
        System.out.println(" ");
    }

    private static void mdR6(int mdCorriente, int mdA) {
        if(mdA== 0){
            return;
        }
        if (mdCorriente <= mdA) {
            try {
                Thread.sleep(30);
            } catch (Exception e) {
                // TODO: handle exception
            }
            System.out.print(mdA + "  ");
            mdR6(mdCorriente, mdA -1);
        }
    }

   





    
}
