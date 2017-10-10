public class WizardQuiz extends Quiz{
	
	double fireTotal;
	double iceTotal;
	double windTotal;
	
	public WizardQuiz(){
		resetValues();
	}

	@Override
	public String getResults() {
		resetValues();
		updateValues();
		return getMaxSchool();
	}
	
	public void resetValues(){
		fireTotal = 0;
		iceTotal = 0;
		windTotal = 0;
	}
	
	private String getMaxSchool(){
		double[] schoolArray = {fireTotal, iceTotal, windTotal};
		int maxIndex = 0;
		for(int i = 1; i < schoolArray.length; i++){
			if(schoolArray[i] > schoolArray[maxIndex]){
				maxIndex = i;
			}
		}
		
		switch(maxIndex){
			case 0: 
				return "School of Fire";
			case 1:
				return "School of Ice";
			case 2:
				return "School of Wind";
			default:
				return "School of Error";
		}
		
	}
	
	public void updateValues(){
		String a1 = answers.get(0);
		switch(a1){
			case QuizInitializer.Q1_OPT_1: //Volcano
				fireTotal += 10;
				iceTotal  += -5;
				windTotal += 1;
				break;
			case QuizInitializer.Q1_OPT_2: //Blizzard
				fireTotal += -5;
				iceTotal  += 10;
				windTotal += 5;
				break;
			case QuizInitializer.Q1_OPT_3: //Tornado
				fireTotal += 2;
				iceTotal  += 0;
				windTotal += 10;
				break;
			case QuizInitializer.Q1_OPT_4: //Sandstorm
				fireTotal += 3;
				iceTotal  += -1;
				windTotal += 7;
				break;
		}
		
		String a2 = answers.get(1);
		switch(a2){
			case QuizInitializer.Q2_OPT_1: //Competitive Sports
				fireTotal += 10;
				iceTotal  += 7;
				windTotal += 5;
				break;
			case QuizInitializer.Q2_OPT_2: //Learning something new
				fireTotal += 0;
				iceTotal  += 10;
				windTotal += 5;
				break;
			case QuizInitializer.Q2_OPT_3: //Playing with pets
				fireTotal += -4;
				iceTotal  += 3;
				windTotal += 4;
				break;
			case QuizInitializer.Q2_OPT_4: //Reading, playing games
				fireTotal += 3;
				iceTotal  += -1;
				windTotal += 7;
				break;
			case QuizInitializer.Q2_OPT_5: //Camping or fishing
				fireTotal += -5;
				iceTotal  += 7;
				windTotal += -2;
				break;
		}
		
		String a3 = answers.get(2);
		switch(a3){
			case QuizInitializer.Q3_OPT_1: //Morning
				fireTotal += 10;
				iceTotal  += 7;
				windTotal += 5;
				break;
			case QuizInitializer.Q3_OPT_2: //Afternoon
				fireTotal += 0;
				iceTotal  += 10;
				windTotal += 5;
				break;
			case QuizInitializer.Q3_OPT_3: //Night
				fireTotal += -4;
				iceTotal  += 3;
				windTotal += 4;
				break;
		}
	}

}
