public class Golondrina {
    //NO HAY PROPERTY
    private int energia = 20;

    //Otro ejemplo
    private boolean puedeVolar = true;

    public Golondrina(int energia, boolean puedeVolar) {
        this.energia = energia;
        this.puedeVolar = puedeVolar;
    }

    public void comer(int gramos, Alpiste algo) {

        this.energia += 4 * gramos + algo.energiaPorGramo() ;

    }

    public int energia(){
        return this.energia;
    }

}
