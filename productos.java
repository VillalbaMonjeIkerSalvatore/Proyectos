import java.util.Scanner; //importe la biblioteca
public class productos{
public static void main(String[]args){ //funcion principal
Scanner leer= new Scanner(System.in); 

double producto1, producto2, producto3, producto4, producto5;
double DESCUENTO=0.10;
double resultado;

//definimos las variables que ocuparemos y una constante la cual es descuento

System.out.println("cual es el precio de tu primer producto");
producto1=leer.nextDouble();

System.out.println("cual es el precio de tu segundo producto");
producto2=leer.nextDouble();

System.out.println("cual es el precio de tu tercer producto");
producto3=leer.nextDouble();

System.out.println("cual es el precio de tu cuarto producto");
producto4=leer.nextDouble();

System.out.println("cual es el precio de tu quinto producto");
producto5=leer.nextDouble();

resultado=(producto1+producto2+producto3+producto4+producto5)*DESCUENTO; //muestro los resultados 
System.out.println("el descuento aplicado a los productos es :"+ resultado);

leer.close();
}

}

