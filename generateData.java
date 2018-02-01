import java.io.*;

public class generateData{
	
	public static void main(String ar[]){

		try{

		PrintWriter printWriter = new PrintWriter(new File("data.csv"));
		StringBuilder builder = new StringBuilder();

		builder.append("College");
		builder.append(",");
		builder.append("Hostel");
		builder.append(",");
		builder.append("Date");
		builder.append(",");
		builder.append("Name");
		builder.append(",");
		builder.append("Lunch");
		builder.append(",");
		builder.append("Dinner");
		builder.append("\n");

		printWriter.write(builder.toString());
		printWriter.close();
		System.out.println("Random data generated");


		}

	}

}