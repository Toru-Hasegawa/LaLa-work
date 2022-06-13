package chap17;

public class Person {
	int age;
	public void setAge(int age) {
		if(age < 0) {
			throw new IllegalArgumentException
			("年齢は0以上の数を指定すべきです。指定地=" + age);
		}
		this.age = age;
	}
}