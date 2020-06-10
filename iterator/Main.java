package 迭代器模式;

public class Main {
	public static void main(String[] args) {
		// 生成一个书架
		BookShelf bookShelf = new BookShelf(4);
		// 向书架添加书籍
		bookShelf.appendBook(new Book("周恩来的晚年岁月"));
		bookShelf.appendBook(new Book("C++网络编程"));
		bookShelf.appendBook(new Book("J2EE网络编程精解"));
		bookShelf.appendBook(new Book("Java编程思想"));
		// 获得书架迭代器
		Iterator it = bookShelf.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
			System.out.println(book.getName());
		}
	}
}
