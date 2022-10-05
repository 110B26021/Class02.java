class Data {
	private String name;
	private Test score;

	class Test {
		private int english;
		private int math;

		Test(int eng, int m) {
			english = eng;
			math = m;
		}

		double avg() {
			return (english + math) / 2.0;
		}
	}

	void show() {
		System.out.println("姓名:" + name);
		System.out.println("英文:" + score.english);
		System.out.println("數學:" + score.math);
		System.out.println("平均成績:" + score.avg());
	}
}
