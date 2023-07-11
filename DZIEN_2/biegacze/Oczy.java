public abstract class Oczy {
    protected String koloroczu;
    protected Boolean zdrowe;

    public Oczy(String koloroczu, Boolean zdrowe) {
        this.koloroczu = koloroczu;
        this.zdrowe = zdrowe;
    }
    
    public abstract double wada();
}
