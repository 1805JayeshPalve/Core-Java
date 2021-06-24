package Lab_Assignment_4_3_Inheritance;


	public abstract class Item {
		protected int UID;
		protected String Title;
		protected int numberOfCopies;
		
		public Item(){}
		Item(int _uid, String _title, int _numCopies)
		{
			UID = _uid;
			Title = _title;
			numberOfCopies = _numCopies;
		}
		
		protected int getUID()
		{
			return UID;
		}
		protected String getTitle()
		{
			return Title;
		}
		protected int getNumCopies()
		{
			return numberOfCopies;
		}
	}


