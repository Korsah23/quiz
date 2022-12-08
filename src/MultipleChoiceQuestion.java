import java.awt.*;
import javax.swing.*;

public class MultipleChoiceQuestion extends Question {
	
	
	
	//class constructor which takes strings as arguments
	public MultipleChoiceQuestion(String query, String a, String b, String
			c, String d, String e, String answer) {
		/*question = query+"\n";
		question += "A. "+a+"\n";
		question += "B. "+b+"\n";
		question += "C. "+c+"\n";
		question += "D. "+d+"\n";
		question += "E. "+e+"\n";*/
		super(query);
		
		addChoice("A",a);
		addChoice("B",b);
		addChoice("C",c);
		addChoice("D",d);
		addChoice("E",e);
		
		initQuestionDialog();


		correctAnswer = answer.toUpperCase();
		
		
		
	}
	

	/*
	 * a method that asks for user a question and returns the answer given only when its valid
	 * takes no argument, the question
	 * */
	 String ask() {
		String answer; //initialize answer variable
		
		//ask question and store answer
		answer = JOptionPane.showInputDialog(question).toUpperCase();
	
		while(true ) {
			//check if answer is valid
			if(answer.equals("A") ||answer.equals("B") || answer.equals("C")|| answer.equals("D")||answer.equals("E")) {
				break;
			}else {
				//if not valid,keep asking
			JOptionPane.showMessageDialog(null,"Invalid answer!");
			answer = JOptionPane.showInputDialog(question).toUpperCase();
			}
			
		};
		//return the answer
		return answer;
		
	}//end of ask method
	 
	 void addChoice(String name, String label) {
		 JPanel choice = new JPanel(new BorderLayout());
		 JButton button = new JButton(name);
		 //JButton button = new JButton(name);
		 button.addActionListener(question);
		 choice.add(button,BorderLayout.WEST);
		 choice.add(new JLabel(label+" " ,JLabel.LEFT),BorderLayout.CENTER);
		 question.add(choice);
		 
		 
	 }
	 
	 
	 
}













