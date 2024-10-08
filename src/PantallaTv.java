

public class PantallaTv extends Observador{
    public PantallaTv (Sujeto sujeto){
        this.sujeto = sujeto;
        this.sujeto.agregarObservador(this);
    }

    @Override
    public void Actualizar() {

        System.out.println("TV: " + sujeto.getNotificacion());
        
    }
}
