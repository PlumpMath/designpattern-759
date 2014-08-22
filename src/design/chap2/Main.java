package design.chap2;

public class Main {
	public static void main(String[] args) {
		MyStack<String> ms = new MyStack<>();
		ms.push("10");
		ms.push("20");
		ms.set(0, "40");
		System.out.println(ms.pop());
		System.out.println(ms.pop());
	}
}
