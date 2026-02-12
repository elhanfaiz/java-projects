import java.util.Scanner ;
class Question{
    String question ;
    String [] options;
    int correctOption;
    // Constructor
    Question(String question , String[] options ,int correctOption){
        this.question = question;
        this.options=options;
        this.correctOption=correctOption;
    }
    boolean checkAnswer(int userAnswer){
        return userAnswer == correctOption;

    }
}
public class QuizGame{
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        //Create Question
        Question[] quiz=new Question[5];
        quiz[0]= new Question(
            "which language is used for Android development?" ,
            new String[]{"1.Java","2.python","3.c++","4.Ruby"},1
        );
        quiz[1]=new Question(
       "which keyword is used to inherit a class in java ?" ,
        new String[]{"1.implement","2.extends","3.inherit","4.super"},2 );
         quiz[2]= new Question(
            "what is the size of int in java?",
            new String[]{"1.4 bytes","2. 2 bytes", "3. 1 bytes" , "4. 8 bytes"} ,1
         );
         quiz[3] = new Question(
            "which of these is not a java keyword ?",
            new String[]{"1.static","2.void","3.float","4.class"},3
         ); 
          quiz[4] = new Question(
            "Which method is the entry point of a Java program?",
            new String[]{"1. start()", "2. main()", "3. init()", "4. run()"},
            2
        );
        int score=0;
        System.out.println("Welcom to java Quiz Game");
        for(int i=0; i<quiz.length; i++){
            System.out.println("Q"+(i+1)+":"+quiz[i].question);
            for(String option:quiz[i].options){
              System.out.println(option);
            }
            System.out.println("Enter your Answer(1-4):");
            int answer = sca.nextInt();
            if(quiz[i].checkAnswer(answer)){
                System.out.println("Correct /n");
                score+=1;
            }else{
                System.out.println("wrong ! correct answer is :"+quiz[i].options[quiz[i].correctOption-1]+"/n");

            }
        }
        System.out.println("------Quiz Over------");
        System.out.println("Your total score: "+score+"/"+quiz.length);
        sca.close();

    }
}