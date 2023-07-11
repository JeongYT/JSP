package chap01;

public class Member {

	String name;
	String id;
	String password;
	int age;
	
	public Member(String name,String id) {
		this.name = name;
		this.id = id;
	}
	
	
	
	Member user1 = new Member("홍길동","hong");
	Member user2 = new Member("강자바","java");
}
