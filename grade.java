import java.util.Scanner;

class grade{
        public static void main(String[] args){
                int score;
                System.out.println("Enter your score: ");
                Scanner input = new Scanner(System.in);
                score = input.nextInt();
                if(score>=50 && score <= 60){
                        System.out.println("Grade E");
                }
                else if(score >=60 && score <= 70){
                        System.out.println("Grade D");
                }
                else if(score >= 70 && score <= 80){
                        System.out.println("Grade C");
                }
                else if(score >= 80 && score <= 90){
                        System.out.println("Grade B");
                }
                else if(score >= 90 && score <= 100){
                        System.out.println("Grade A");
                }
                else{
                        System.out.println("You Failed");
                }
        }
}
