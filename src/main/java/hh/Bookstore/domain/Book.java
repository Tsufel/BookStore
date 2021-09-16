package hh.Bookstore.domain;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String isbn;
	private String author;
	private String title;
	private int year;
	private double price;
	

	
	public Book(String isbn, String author, String title, int year, double price) {
		super();
		
		this.isbn = isbn;
		this.author = author;
		this.title = title;
		this.year = year;
		this.price = price;
	}
	
	
	public Book() {
		super();
	}
	
	
	
	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Kirja [id=" + id + ", isbn=" + isbn + ", author=" + author + ", title=" + title + ", year=" + year
				+ ", price=" + price + "]";
	}
	
	
	

}
