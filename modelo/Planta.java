package modelo;

public class Planta extends SerVivo{

    // El metodo alimentarse() se puede usar por que las plantas se alimentan por medio de la fotosíntesis
    @Override
    public void alimentarse(){
        System.out.println("La planta se alimenta por medio de la fotosíntesis");
    }
    
}
