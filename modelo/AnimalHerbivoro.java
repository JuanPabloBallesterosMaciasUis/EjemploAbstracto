package modelo;

public class AnimalHerbivoro extends Animal {

    // Se sobreescribe el metodo alimentarse()
    @Override
    public void alimentarse(){
        System.out.println("El animal herbívoro se alimenta de plantas");
    }
    
}
