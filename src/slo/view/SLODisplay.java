package slo.view;

import javax.swing.JOptionPane;

public class SLODisplay
{
	public String getAnswer(String input)
	{
		String answer = "";
		
		answer = JOptionPane.showInputDialog(null, input);
		
		return answer;
	}
public void displayResponse (String input)
	{
		JOptionPane.showMessageDialog(null, input);
	}
}
