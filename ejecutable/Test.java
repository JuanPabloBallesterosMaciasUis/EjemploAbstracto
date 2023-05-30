package ejecutable;

import modelo.AnimalCarnivoro;
import modelo.AnimalHerbivoro;
import modelo.Planta;
import modelo.SerVivo;

public class Test {
    
    public static void main(String[] args) {

        // La clase SerVivo es abstracta, por lo tanto no se puede instanciar
        //SerVivo serVivo = new SerVivo();

        // Instancias 
        Planta planta = new Planta();   
        AnimalCarnivoro animalC = new AnimalCarnivoro(); 
        AnimalHerbivoro animalH= new AnimalHerbivoro();
        
        // Invocación de métodos
        planta.alimentarse();
        animalC.alimentarse();
        animalH.alimentarse();
        
    }

}
