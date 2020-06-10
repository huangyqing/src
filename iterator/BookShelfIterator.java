package ������ģʽ;


public class BookShelfIterator implements Iterator {
	private BookShelf bookShelf; // ���
	private int index; // ������λ������
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}
	public boolean hasNext() { // ����Ƿ�����һ����
		if (index < bookShelf.getLength()) {
			return true;
		} else {
			return false;
		}
	}
	public Object next() { // ������һλ�õ���
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}
}
