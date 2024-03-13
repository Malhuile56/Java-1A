public abstract class Animal{
    protected String nom;
    protected double poids;
    protected Enclos enclos;

    public Animal(String nom, double d, Enclos enclos) {
        this.nom = nom;
        this.poids = d;
        this.enclos = enclos;
    }

    @Override
    public String toString() {
        return this.getClass() + " " + this.nom + " pèse " + this.poids + " kg";
    }

}
