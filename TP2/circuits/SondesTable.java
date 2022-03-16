package circuits;

import java.util.*;

public class SondesTable {
	Map<Interrupteur, LazySonde> iToS = new HashMap<>();
	Map<LazySonde, Interrupteur> sToI = new HashMap<>();

	public Interrupteur getInterrupteur(LazySonde sonde)
	{
		return sToI.get(sonde);
	}

	public LazySonde getSonde(Interrupteur i, Composant c, String e)
	{
		if(iToS.get(i) == null)
		{
			LazySonde s = new LazySonde(c,e);
			iToS.put(i,s);
			sToI.put(s,i);
			return s;
		}
		else
		{
			return iToS.get(i);
		}
	}

	public void resetSondes()
	{
		for (LazySonde s : sToI.keySet())
		{
			s.reset();
		}
	}

	public void clear()
	{
		iToS.clear();
		sToI.clear();
	}
}
