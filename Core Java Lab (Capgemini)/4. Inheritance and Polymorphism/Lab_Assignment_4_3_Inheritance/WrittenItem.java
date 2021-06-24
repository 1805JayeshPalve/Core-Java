package Lab_Assignment_4_3_Inheritance;

public abstract class WrittenItem extends Item {
	private String author;
	
	public WrittenItem(){};
	WrittenItem(int _uid, String _title, int _numCopies, String _author)
	{
		super(_uid, _title, _numCopies);
		author = _author;
	}
	protected String getAuthor()
	{
		return author;
	}
}
