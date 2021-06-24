package Lab_Assignment_4_3_Inheritance;

public class Books extends WrittenItem{
	Books(int _uid, String _title, int _numCopies,String _author)
	{
		super(_uid,_title,_numCopies,_author);
		
	}
	
	public void getBookDetails() {
		System.out.println("UID:" +UID);
		System.out.println("Title:" +Title);
		System.out.println("Number Of Copies:" +numberOfCopies);
		System.out.println("Author:" +getAuthor());
	}

	

}
