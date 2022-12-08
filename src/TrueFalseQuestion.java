//import javax.swing.JOptionPane;

import javax.swing.*;

public class TrueFalseQuestion extends Question {

	//question.setVisible(true);
	
	public TrueFalseQuestion(String question, String answer) {
		super(question);
		
		JPanel buttons = new JPanel();
		
		addButton(buttons,"TRUE");
		addButton(buttons,"FALSE");
		initQuestionDialog();
		
		correctAnswer = answer;
		
		
	}
	/*String ask(){
		question.setVisible(true);
		return question.answer;
	}*/
	
	void addButton(JPanel buttons, String label) {
		
		JButton button = new JButton(label);
		button.addActionListener(question);
		buttons.add(button);
	}

	
}
