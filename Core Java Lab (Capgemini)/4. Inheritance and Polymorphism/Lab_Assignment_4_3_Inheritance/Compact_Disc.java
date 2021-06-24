package Lab_Assignment_4_3_Inheritance;

public class Compact_Disc extends MediaItem{
	
	public Compact_Disc(int _uid, String _title, int _numCopies, int _runTime)
	{
		super(_uid,_title,_numCopies,_runTime);
	}
	
	public void getCDDetails()
	{
		System.out.println("UID :" + UID);
		System.out.println("Title :" + Title);
		System.out.println("Number of Copies :" + numberOfCopies);
		System.out.println("Runtime :" + getRuntime());
	}
	
}
