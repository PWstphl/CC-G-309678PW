
package bmi;

public class bmi {
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String name = IO.promptAndReadString("What's your name?");

		double weight = IO.promptAndReadDouble("What's your weight?");
		double height = IO.promptAndReadDouble("What's your height?");
		double bmi = weight / (height * height);


		IO.writeln("Hello " + name);
		IO.writeln("Your BMI is: " + bmi);
		IO.writeln("Your BMI is: " + IO.round(bmi, 2));;
		
	}

}
