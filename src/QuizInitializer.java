
public class QuizInitializer {
	
	public static final String Q1_QUESTION = "Which of these is the most powerful?";
	public static final String Q1_OPT_1 = "Volcano";
	public static final String Q1_OPT_2 = "Blizzard";
	public static final String Q1_OPT_3 = "Tornado";
	public static final String Q1_OPT_4 = "Sandstorm";
	
	public static final String Q2_QUESTION = "What is your favorite activity?";
	public static final String Q2_OPT_1 = "Competitive Sports";
	public static final String Q2_OPT_2 = "Learning something new";
	public static final String Q2_OPT_3 = "Playing with pets";
	public static final String Q2_OPT_4 = "Reading, playing games";
	public static final String Q2_OPT_5 = "Camping or fishing";
	
	public static final String Q3_QUESTION = "What is your favorite time of day?";
	public static final String Q3_OPT_1 = "Morning";
	public static final String Q3_OPT_2 = "Afternoon";
	public static final String Q3_OPT_3 = "Night";

	public static void main(String[] args) {

		//Set up test Questions
		QuizQuestion q1 = new QuizQuestion();
		q1.setQuestion(Q1_QUESTION);
		q1.addAllOptions(Q1_OPT_1,
					Q1_OPT_2,
					Q1_OPT_3,
					Q1_OPT_4);
		
		QuizQuestion q2 = new QuizQuestion();
		q2.setQuestion(Q2_QUESTION);
		q2.addAllOptions(Q2_OPT_1,
					Q2_OPT_2,
					Q2_OPT_3,
					Q2_OPT_4,
					Q2_OPT_5);
		
		
		QuizQuestion q3 = new QuizQuestion();
		q3.setQuestion(Q3_QUESTION);
		q3.addAllOptions(Q3_OPT_1,
					Q3_OPT_2,
					Q3_OPT_3);
		
		//Put the questions in a quiz
		WizardQuiz quiz = new WizardQuiz();
		quiz.addAllQuestions(q1, q2, q3);
		
		//Take the quiz
		quiz.takeQuiz();
		System.out.println("Your school is: " + quiz.getResults());		
	}

}
