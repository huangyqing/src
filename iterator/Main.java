package ������ģʽ;

public class Main {
	public static void main(String[] args) {
		// ����һ�����
		BookShelf bookShelf = new BookShelf(4);
		// ���������鼮
		bookShelf.appendBook(new Book("�ܶ�������������"));
		bookShelf.appendBook(new Book("C++������"));
		bookShelf.appendBook(new Book("J2EE�����̾���"));
		bookShelf.appendBook(new Book("Java���˼��"));
		// �����ܵ�����
		Iterator it = bookShelf.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
			System.out.println(book.getName());
		}
	}
}
