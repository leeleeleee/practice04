package prob05;

public class MyBase extends Base {
	public void service(String state) {
		if (state.equals("낮")) {
			System.out.println(state + "에는 열심히 일하자!");
		} else if (state.equals("밤")) {
			night();
		} else {
			System.out.println(state + "에도 열심히 일하자");
		}
	}

	public MyBase() {

	}
}
