package org.system;

public class Desktop extends Computer {
	//Single Inheritance
	public void desktopSize() {
		System.out.println("Desktop Size: 14inch");
		// computerModel();
	}

	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.computerModel();
		d.desktopSize();
	}

}
