package First_package;

public class Junhwan {

	public static void main(String[] args) {
	User me = new User("최준환","언어학과",201900607);
	me.showinfo();
	System.out.println("\n인삿말 : 내가 대장이다 크하하하하하하 부럽지");
}
	
}
class User{
	private String name;
	private String studies;
	private int StudentId;
	User(String name_,String studies_,int StudentId_){
		this.name = name_;
		this.studies = studies_;
		this.StudentId = StudentId_;
	}
	public void showinfo() {
		System.out.printf("이름 : %s \n학번 : %d\n학과 : %s",name,StudentId,studies);
	}
	
}
