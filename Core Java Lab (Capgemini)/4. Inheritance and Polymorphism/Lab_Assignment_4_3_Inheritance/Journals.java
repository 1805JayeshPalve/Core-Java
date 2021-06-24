package Lab_Assignment_4_3_Inheritance;

public class Journals extends WrittenItem {
	

	public Journals(int _uid, String _title, int _numCopies, String _author)
	{
		super(_uid,_title,_numCopies, _author);
	}
	
	
	public void getJournalDetails()
	{
		// details
		System.out.println("UID :" + UID);
		System.out.println("Title :" + Title);
		System.out.println("Number of Copies :" + numberOfCopies);
		System.out.println("Author :" + getAuthor());
	}
}
