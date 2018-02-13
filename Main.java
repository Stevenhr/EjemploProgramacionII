public class Main
{
	//javac Main.class
	//java Main
	public static void main(String[] arg){

		
		System.out.println("\n\t\tHola mundo desde la universidad de cundinamarca");
		System.out.println("Programaciòn II");
		System.out.println("Steven Hernandez Rios");
		System.out.println("");
		System.out.println("");

		System.out.println("\n\tSUMA DE DOS VARIABLES");

		int numero1=20;
		int numero2=30;

		System.out.println("La suma del numero1 = "+numero1+" + numero2 = "+numero2+" = "+(numero1+numero2)); 

		if(numero1>numero2){
			System.out.println("El "+numero1+" es mayor que "+numero2);
		}else{
			System.out.println("El "+numero2+" es mayor que "+numero1);
		}

		String nombre ="Steven Hernandez";

		System.out.println("Programa Terminado"+nombre);

		int numero3=100;

		while(numero3>0){
			System.out.println("-> "+numero3)
			numero3--;
		}

	}


}