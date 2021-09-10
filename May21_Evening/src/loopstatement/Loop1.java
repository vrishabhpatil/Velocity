package loopstatement;

public class Loop1 {
	public void result() {
		for(int i=1;i<=5;i++) {    //if 1st outer condition is true then only inner will executes
			for(int j=1;j<=5;j++) {      //inner for loop excecutes totally then go to outer loop
				//System.out.print(" * ");
				System.out.println(i +"" +j);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Loop1 x=new Loop1();
		x.result();
	}

}
