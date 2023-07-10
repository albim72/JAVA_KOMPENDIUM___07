public abstract class Figura {
    protected double a;
    protected double b;

    public Figura(double a, double b) {
        this.a = a;
        this.b = b;
        this.info();
    }
    
    public void info(){
        System.out.println("stworzono figurę 2D...");
    }
    
    public abstract double PoliczPole();
    
}
