package rendering;

public class Quadrato implements Forma {
    private final float lato;

    public Quadrato(float l1){
        this.lato = l1;
    }
    @Override
    public double getArea() {
        return Math.pow(this.lato, 2);
    }

    @Override
    public void render() {

    }
}
