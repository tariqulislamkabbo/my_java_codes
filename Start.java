public class Start{

	public static void main(String[] args){
	
	Book book = new Book("9789004161214", "Himu", "Humayun Ahmed", 250, 90);
	Book book1 = new Book("9089004161214", "Gitanjoli", "Rabindranath Thagor", 250, 70);
	book.setIsbn("9789004161214");
	book.setBookTitle("Himu");
	book.setAuthorName("Humayun Ahmed");
	book.setPrice(250);
	book.setAvaiableQuantity(90);
	book.addQuantity(5);
	book1.sellQuantity(10);
	book.showDetails();
	book1.showDetails();

}





}