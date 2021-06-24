package Lab_Assignment_4_3_Inheritance;



public abstract class MediaItem extends Item{
	private int runTime;
	
	public MediaItem(){};
	MediaItem(int _uid, String _title, int _numCopies, int _runTime)
	{
		super(_uid, _title, _numCopies);
		runTime = _runTime;
	}
	protected int getRuntime()
	{
		return runTime;
	}
}
