package circuits;

public class Vanne extends Composant {
	
	protected Composant in;
	protected String name;

	public Vanne(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}
	
	public void setIn(Composant comp) {
		in = comp;
	}

	public String description() {
		
		return super.description() + " in1: " + (in == null ? "not connected" : in.getId());

	}

	public boolean getEtat() throws NonConnectedException {
		if (in == null) {
			throw new NonConnectedException();
		}
		else {
			return in.getEtat();
		}
	}

	public void probe(SondesTable tableSondes) {}
    
	public void unProbe(SondesTable tableSondes) {}
	
}
