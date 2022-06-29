package week3.assignment;

public class Automation extends MultipleLangauge implements Language,TestTool{
	public void Selenium() {
		System.out.println("Selenium method");
		
	}

	public void Java() {
		System.out.println("Java method");
		
	}

	public static void main(String[] args) {
	Automation a = new Automation();
	a.Selenium();
	a.Java();
	a.python();
	
	}

	@Override
	public void python() {
		System.out.println("python method");
		
		
	}



}
