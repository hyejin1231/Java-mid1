package nested.test.ex1;

public class Library
{
	private Book[] bookList;
	private int bookCount;

	public Library(int size)
	{
		bookList = new Book[size];
		bookCount = 0;
	}

	private class Book {
		 private String title;
		 private String author;

		 public Book(String title, String author)
		 {
			 this.title = title;
			 this.author = author;
		 }

		@Override
		public String toString()
		{
			return "도서 제목 : " + title + ", 저자 : " + author;
		}
	}

	public void addBook(String title, String author)
	{
		if (bookCount < bookList.length)
		{
			bookList[bookCount] = new Book(title, author);
			bookCount++;
		}else {
			System.out.println("도서관 저장 공간이 부족합니다.");
		}
	}
	public void showBooks()
	{
		System.out.println("== 책 목록 출력 == ");
		for (Book book : bookList)
		{
			System.out.println(book);
		}
	}
}
