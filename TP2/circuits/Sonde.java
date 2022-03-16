package circuits;

public class Sonde extends Composant{

    protected Composant comp;
    protected String port;

    public Sonde(Composant comp, String port) {
        this.comp = comp;
        this.port = port;
    }

    public Sonde() {}
    
    public boolean getEtat() {
        System.out.print(port + " de " + this.comp.getId() + "true ou false? ");   
        return System.console().readLine() == "true";
    }

    public void probe(SondesTable tableSondes) {}
    
	public void unProbe(SondesTable tableSondes) {}
}
