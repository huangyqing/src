package 迭代器模式;


public class BookShelfIterator implements Iterator {
	private BookShelf bookShelf; // 书架
	private int index; // 书所在位置索引
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}
	public boolean hasNext() { // 检查是否还有下一本书
		if (index < bookShelf.getLength()) {
			return true;
		} else {
			return false;
		}
	}
	public Object next() { // 返回下一位置的书
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}
}
