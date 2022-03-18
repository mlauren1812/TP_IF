package circuits;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;


public class Circuit {

	protected String nom;
	protected List<Composant> composants = new ArrayList<Composant>();
	protected SondesTable tableSondes = new SondesTable();

	public Circuit(String nom, Composant[] cps)
	{
		this.nom = nom;
		this.composants.addAll(Arrays.asList(cps));
		Collections.sort(this.composants);
	}

	public Circuit(String nom)
	{
		this.nom = nom;
	}

	public Circuit() {}

	public void addComposant(Composant c)
	{
		composants.add(c);
	}

	public String getName()
	{
		return this.nom;
	}

	public List<String> nomenclature()
	{
		List<String> result = new ArrayList<String>();
		for (Composant composant: composants)
		{
			result.add(composant.getId());
		}

		return result;
	}

	public String description()
	{
		String res = this.nom;

		for(Composant c : composants)
		{
			res += c.description();
		}

		return res;
	}

	public void traceEtats()
	{
		System.out.println("Nom du circuit : "+this.nom);
		
		for(Composant c : composants)
		{
			System.out.println(c.traceEtat());
		}

	}
	
	public List<Interrupteur> getIns()
	{
		List<Interrupteur> result = new ArrayList<Interrupteur>();
		
		for(Composant c : composants)
		{
			if(c instanceof Interrupteur)
			{
				result.add((Interrupteur) c);
			}
		}

		return result;
	}
	
	public List<Vanne> getOuts()
	{
		List<Vanne> result = new ArrayList<Vanne>();
		
		for(Composant c : composants)
		{
			if(c instanceof Vanne)
			{
				result.add((Vanne) c);
			}
		}

		return result;
	}

	public void probe()
	{
		for(Composant c : composants)
		{
			c.probe(this.tableSondes);
		}
	}

	public void unProbe()
	{
		for(Composant c : composants)
		{
			c.unProbe(this.tableSondes);
		}
	}

	public void resetSondes()
	{
		this.tableSondes.resetSondes();
	}

	public void save(String fileName) throws IOException {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream (fileName));
		out.writeObject(this.nom);
		out.writeObject(this.composants);

		out.close();
	}
	
	public void load(String fileName) throws IOException,ClassNotFoundException {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream (fileName));
		this.nom=(String)in.readObject();
		this.composants=(List<Composant>) in.readObject();
		in.close();
	}
}
