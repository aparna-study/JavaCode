/*  Book84083 class has following properties book title (string) ,ISBN code (string) ,publisher (string) ,publish year, *number of pages
 *author names list (use Array List of string), reviewer names list (use Array List of string) , three parameterized constructor for intialization and two methods
 *@Author: Aparna Kulkarni
 *Student ID: 84083
 * 
 */

import java.util.ArrayList;

public class Book84083 {

	String title;
	String isbn_code;
	String publisher;
	int publish_year;
	int number_Of_Pages;
	ArrayList<String> author_names = new ArrayList<String>();
	ArrayList<String> reviewer_names = new ArrayList<String>();

	public Book84083(String title, String isbn) {
		isbn_code = isbn;
		this.title = title;

	}

	public Book84083(String title, String isbn, String publisher,
			int publish_year) {
		isbn_code = isbn;
		this.title = title;
		this.publisher = publisher;
		this.publish_year = publish_year;
	}

	public Book84083(String title, String isbn, String publisher,
			int publish_year, int pages, ArrayList<String> author) {
		isbn_code = isbn;
		this.title = title;
		this.publisher = publisher;
		this.publish_year = publish_year;
		this.number_Of_Pages = pages;
		author_names = author;
	}

	public void addReviewer(String name)

	{
		reviewer_names.add(name);

	}

	public void removeReviewer(String name) {
		reviewer_names.remove(name);

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn_code() {
		return isbn_code;
	}

	public void setIsbn_code(String isbn_code) {
		this.isbn_code = isbn_code;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPublish_year() {
		return publish_year;
	}

	public void setPublish_year(int publish_year) {
		this.publish_year = publish_year;
	}

	public int getNumber_Of_Pages() {
		return number_Of_Pages;
	}

	public void setNumber_Of_Pages(int number_Of_Pages) {
		this.number_Of_Pages = number_Of_Pages;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book84083 book = new Book84083("JAVA", "12345", "wrox", 2014);
		ArrayList<String> authorList = new ArrayList<String>();
		authorList.add("John");
		authorList.add("Sam");
		System.out.println("authorList: " + authorList);
		Book84083 book1 = new Book84083("JAVA", "12345", "wrox", 2014, 100,authorList);

	}
}
