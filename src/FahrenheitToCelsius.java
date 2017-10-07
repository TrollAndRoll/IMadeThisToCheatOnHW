import javax.swing.JOptionPane;

public class FahrenheitToCelsius 
{
	static int check = 1, i, F;
	
	public static void main(String[] args) 
	{
		while (check == 1)
		{
			
		String F = JOptionPane.showInputDialog(null, "What Fahrenheit degree would you like to convert to celsius?");
			
		check = check - 1;	
			
		try 
		{
			i = Integer.parseInt(F);
		}
		catch (Exception e)
		{
			JOptionPane.showMessageDialog(null, "That is an invalid entry...\n ...please try again.");
			
			check = check + 1;
		}
		
		}
		
		i = i - 32;
		i = i * 5;
		i = i / 9;
		
		JOptionPane.showMessageDialog(null, "that's equal to " + i + "°C.");
		
	}
}
