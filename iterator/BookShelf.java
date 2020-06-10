package 迭代器模式;

public class BookShelf implements Aggregate {
	private Book[] books;
	private int index = 0; // 一开始书架没书
	public BookShelf(int maxSize) {
		this.books = new Book[maxSize];
	}
	public Book getBookAt(int index) {
		return books[index];
	}
	public void appendBook(Book book) { // 往书架添加书籍
		this.books[index] = book;
		index++;
	}
	public int getLength() { // 获得书架存书的数量
		return books.length;
	}
	public Iterator iterator() { // 获得书架迭代器对象
		return new BookShelfIterator(this);
	}
}
