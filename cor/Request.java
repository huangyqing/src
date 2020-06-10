package 职责链模式;


public class Request {
	// 申请类别
	private String type;
	// 申请内容
	private String content;
	// 申请数量
	private int num;
	public Request(String type, int num) {
		this.type = type;
		this.num = num;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getNum() {
	  return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}
