public class AInt extends AExpr
{
	int e;

	public AInt (int e)
	{
		this.e = e;
	}

	int eval()
	{
		return e;
	}
}

