package circuits;


public class And extends Porte2Entrees {
    public boolean eval() throws NonConnectedException {
        return in1.getEtat() && in2.getEtat();
    }

    public void probe(SondesTable tableSondes)
    {
        if(this.in1 instanceof Interrupteur)
        {
            this.in1 = tableSondes.getSonde((Interrupteur)in1, this, "in1");
        }
        if(this.in2 instanceof Interrupteur)
        {
            this.in2 = tableSondes.getSonde((Interrupteur)in2, this, "in2");
        }
    }
    
	public void unProbe(SondesTable tableSondes)
    {
        if(this.in1 instanceof LazySonde)
        {
            this.in1 = tableSondes.getInterrupteur((LazySonde)in1);
        }
        if(this.in2 instanceof LazySonde)
        {
            this.in2 = tableSondes.getInterrupteur((LazySonde)in2);
        }
    }
}