
public class PredictableDie extends Die
{
	private int[] throwSequence = {};
	private int nextIntSequence = 0;
	
	public PredictableDie(int[] sequence)
	{
		super();
		if (sequence == null || sequence.length == 0)
		{
			throw new RuntimeException();
		}
		throwSequence = sequence;
	}


	public PredictableDie()
	{
		this.throwSequence = null;
	}


	public void roll()
	{
		if (nextIntSequence == throwSequence.length || throwSequence.length == 0)
		{
			nextIntSequence = 0;
		}
		super.setLastRoll(throwSequence[nextIntSequence]);
		nextIntSequence++;
	}
	
	public void setThrowSequence(int[] sequence)
	{
		this.throwSequence = sequence;
	}

}
