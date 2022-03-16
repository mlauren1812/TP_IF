package circuits;

public class Interrupteur extends Composant {
    
	protected boolean etat;
    protected String name;

    public Interrupteur(String name)
    {
        this.name = name;
    }

    public void on() {
        etat = true;
    }

    public void off() {
        etat = false;
    }

    public boolean getEtat() {
        return etat;
    }

    public String getName()
    {
        return name;
    }

    public void  probe(SondesTable tableSondes) {};
	public void  unProbe(SondesTable tableSondes) {};
}
