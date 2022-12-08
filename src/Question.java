import java.awt.*;
import javax.swing.*;


public abstract class Question {
	//declaration of static variables
		static int nQuestions = 0;//number of questions
		static int nCorrect = 0;//number of correct answers

		//initialize question variable
		QuestionDialog question;
		String correctAnswer;
		
		Question(String question) {
			this.question = new QuestionDialog();
			this.question.setLayout(new GridLayout(0,1));
			this.question.add(new JLabel(" "+question+ " ",JLabel.CENTER));
		}
		
		 String ask() 
			 {
				    String answer; //initialize answer variable
						
						//ask question and store answer
						answer = JOptionPane.showInputDialog(question).toUpperCase();
				          question.setVisible(true);
						while(true ) {
							//check if answer is valid
							if(answer.equals("T") ||answer.equals("TRUE") || answer.equals("F")|| answer.equals("FALSE")||answer.equals("N")||answer.equals("NO")||answer.equals("Y")||answer.equals("YES")) {
								if(answer.equals("T")|| answer.equals("TRUE")||answer.equals("Y")||answer.equals("YES")) {
									answer = "TRUE";
								}else {
									answer = "FALSE";
								}
								break;
							}else {
								//if not valid,keep asking
							JOptionPane.showMessageDialog(null,"Invalid answer!,Please enter TRUE or FALSE");
							answer = JOptionPane.showInputDialog(question).toUpperCase();
							}
							
						};
						
						//return the answer
						return question.answer;
						
					}
		 
		/* method that asks questions and check accuracy of the answer
		 * takes arguments of the question and correctAnswer
		 * */
		
		void check() {
			
			nQuestions ++;
			
			//ask the question
			String userAnswer = ask();
			 //checks validity of answer
			if(userAnswer.equals(correctAnswer)) {
				JOptionPane.showMessageDialog(null,"Correct Answer!");
				nCorrect++;
				

			}else {
				JOptionPane.showMessageDialog(null,"Incorrect answer! "+correctAnswer + " is the correct answer");}

			}
		
		
		void showResults() {
			
			JOptionPane.showMessageDialog(null,nCorrect + " correct out of " + nQuestions + " questions" );
			
		}
		
		void initQuestionDialog() {
			this.question.setModal(true);
			this.question.pack();
			this.question.setLocationRelativeTo(null);

		}
}
