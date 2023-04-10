public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Primer consigna");


int numeroIf = 5; 

if (numeroIf > 0){
    System.out.println("El número es positivo");
} else if (numeroIf < 0){
    System.out.println("El número es negativo");
}else{
    System.out.println("Obviamente el número es cero");
}

//Segunda consigna con bucle while//
System.out.println("Segunda consigna");
int numeroWhile =1; 

while(numeroWhile < 3)  {
    System.out.println("While: "+ numeroWhile);
    numeroWhile++;
}
// tercer consigna bucle do while //
System.out.println("Tercer consigna");
int numeroDoWhile =3;

do { 
    System.out.println("Do while: " + numeroDoWhile); 
    numeroDoWhile++;
}while(numeroDoWhile < 3); 

    

// Cuarta consigna FOR //
System.out.println("Cuarta consigna");

for (int numeroFor =0; numeroFor <= 3; numeroFor++){
    System.out.println("El bucle for muestra: " +numeroFor);
}
    


var estacion = "verano"; 

switch (estacion) {
    case "verano": System.out.println("Es verano");
        
        break;
    case "primavera": System.out.println("Es primavera");
        
        break;
    case "otoño": System.out.println("Es otoño");
        
        break;
    case "invierno": System.out.println("Es invierno");
        
        break;
    default: System.out.println("Nadie sabe en que estación estás");
        break;
}


    }
}






