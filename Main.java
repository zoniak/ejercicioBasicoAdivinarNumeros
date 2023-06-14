import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.generarAleatorio();
    }

    public int pedirNumeros(){ //Para pedir los numeros
        System.out.println("Introduce un numero entre 0 y 20");
        Scanner escaner = new Scanner(System.in);
        int numero=0;
        try{
            numero = escaner.nextInt();
        }catch (Exception e){
            System.out.println("Introduce un numero de verdad");
            numero=pedirNumeros();
        }

        return numero;
    }

    public void generarAleatorio(){
        int aleatorio = (int)(Math.random()*20+0);//genera un numero aleatorio entre 0 y 20
        int numeroEscrito;
        int intento=0;
        boolean acierto=false;

        for(int i=0;!acierto&&intento<3;i++){
            System.out.println("Intento "+intento);
            numeroEscrito=pedirNumeros();
            acierto=compararNumero(numeroEscrito,aleatorio);
            intento++;
        }

        System.out.println("El numero era "+aleatorio);
    }

    public boolean compararNumero(int n1, int n2){
        boolean acierto=false;
        if(n1==n2){
            System.out.println("Felicidades!! Has acertado!!");
            acierto=true;
        }else if(n1<n2){
            System.out.println("Demasiado pequeño, vuelve a intentarlo");
        }else{
            System.out.println("Demasiado grande, vuelve a intentarlo");
        }
        return acierto;
    }
}