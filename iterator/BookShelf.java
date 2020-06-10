package ������ģʽ;

public class BookShelf implements Aggregate {
	private Book[] books;
	private int index = 0; // һ��ʼ���û��
	public BookShelf(int maxSize) {
		this.books = new Book[maxSize];
	}
	public Book getBookAt(int index) {
		return books[index];
	}
	public void appendBook(Book book) { // ���������鼮
		this.books[index] = book;
		index++;
	}
	public int getLength() { // �����ܴ��������
		return books.length;
	}
	public Iterator iterator() { // �����ܵ���������
		return new BookShelfIterator(this);
	}
}
