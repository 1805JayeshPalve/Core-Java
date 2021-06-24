package Lab_Assignment_4_3_Inheritance;



public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Books book1 = new Books(1,"Naruto Shippuden", 5, "Masashi Kishimoto");
		Journals journal1 = new Journals(2, "The Source Of Light", 5, "Nvidia");
		Video video1 = new Video(3,"Deathnote", 5, 37);
		Compact_Disc cd1= new Compact_Disc(4,"Naruto : The Last", 5, 120);
		
		book1.getBookDetails();
		journal1.getJournalDetails();
		video1.getVideoDetails();
		cd1.getCDDetails();
		
	}

}
