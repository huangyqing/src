package 观察者模式;


public class ConcreteSubject extends Subject
{
	// 具体被观察者状态
	private String	subjectState; 
	public String getSubjectState()
	{
		return subjectState;
	}
	public void setSubjectState(String subjectState)
	{
		this.subjectState = subjectState;
	}
}
