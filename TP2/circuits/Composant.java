package circuits;

import java.io.Serializable;

public abstract class Composant implements Comparable<Composant>, Serializable{
	
	public String getId() {
		return super.toString(); // class@numero renvoye par Object
	}
	
	public String description() {
		return this.getId();
	}

	public abstract boolean getEtat() throws NonConnectedException;

	public String traceEtat() {
			try {
				return description() + " Etat : " + getEtat();
			} catch (NonConnectedException e) {
				return description() + " Etat : Composant non connecté";
			}
	}

	public int compareTo(Composant compareTo) {

        return getId().compareTo(compareTo.getId());

    }

	public abstract void  probe(SondesTable tableSondes);
	public abstract void  unProbe(SondesTable tableSondes);

}
