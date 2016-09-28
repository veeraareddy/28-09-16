public class BodyTest
{
	public int idNum;
	public String name="empty";
	BodyTest()
	{
	}
	BodyTest(String bodyName,int id)
	{
		this();
		name=bodyName;
		idNum=id;
	}
	public int getIdNum()
	{
		return idNum;
	}
	public String getNmae()
	{
		return name;
	}
	public void getIdNum(int num)
	{
		this.idNum=num;
	}
	public void getNmae(String name)
	{
		this.name=name;
	} 
	public static void main(String[] args) 
	{
		BodyTest b1=new BodyTest("veera",20);
		System.out.println(b1.name);
		System.out.println(b1.idNum);
	}
}
