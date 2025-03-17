package project;

import java.util.Scanner;

public class pro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int prize = 10;
        int questionNumber = 1;
        int lifeline1 = 0, lifeline2 = 0, lifeline3 = 0;
        int correctAnswer;

        System.out.println("Welcome to the Game!");
        System.out.println("Enter your name:");
        String Name = sc.nextLine();
        System.out.println("\nHello, " + Name + "! , Let's start the game.\n");

        while (questionNumber <= 10) {
            System.out.println("\nQuestion " + questionNumber + " for ₹" + prize);

            if (questionNumber == 1) {
                System.out.println("\nWhat is a correct syntax to output 'Hello World' in Java?");
                System.out.println("1) System.out.println(\"Hello World\");");
                System.out.println("2) echo(\"Hello World\");");
                System.out.println("3) print (\"Hello World\");");
                System.out.println("4) Console.WriteLine(\"Hello World\");");
                correctAnswer = 1;
            } else if (questionNumber == 2) {
                System.out.println("\nJava is short for 'JavaScript'?");
                System.out.println("1) Yes");
                System.out.println("2) No");
                correctAnswer = 2;
            } else if (questionNumber == 3) {
                System.out.println("\nHow do you insert COMMENTS in Java code?");
                System.out.println("1) //");
                System.out.println("2) /*");
                System.out.println("3) #");
                System.out.println("4) //* ");
                correctAnswer = 1;
            } else if (questionNumber == 4) {
                System.out.println("\nWhich data type is used to create a variable that should store text?");
                System.out.println("1) Txt");
                System.out.println("2) myString");
                System.out.println("3) String");
                System.out.println("4) string");
                correctAnswer = 3;
            } else if (questionNumber == 5) {
                System.out.println("\nWhich method can be used to find the length of a string?");
                System.out.println("1) len()");
                System.out.println("2) length()");
                System.out.println("3) getSize()");
                System.out.println("4) getLength()");
                correctAnswer = 2;
            } else if (questionNumber == 6) {
                System.out.println("\nWhich method can be used to return a string in upper case letters?");
                System.out.println("1) toUpperCase()");
                System.out.println("2) touppercase()");
                System.out.println("3) tuc()");
                System.out.println("4) upperCase()");
                correctAnswer = 1;
            } else if (questionNumber == 7) {
                System.out.println("\nWhich operator can be used to compare two values?");
                System.out.println("1) ==");
                System.out.println("2) ><");
                System.out.println("3) <>");
                System.out.println("4) =");
                correctAnswer = 1;
            } else if (questionNumber == 8) {
                System.out.println("\nWhich keyword is used to create a class in Java?");
                System.out.println("1) MyClass");
                System.out.println("2) class()");
                System.out.println("3) class");
                System.out.println("4) className");
                correctAnswer = 3;
            } else if (questionNumber == 9) {
                System.out.println("\nWhich keyword is used to import a package from the Java API library?");
                System.out.println("1) import");
                System.out.println("2) package");
                System.out.println("3) lib");
                System.out.println("4) getlib");
                correctAnswer = 1;
            } else {
                System.out.println("\nWhich statement is used to stop a loop?");
                System.out.println("1) return");
                System.out.println("2) break");
                System.out.println("3) stop");
                System.out.println("4) exit");
                correctAnswer = 2;
            }

            System.out.print("\nEnter your final answer or Enter 0 for Lifelines: ");
            int answer = sc.nextInt();

            if (answer == 0) {
                System.out.println("\nAvailable Lifelines:");
                if (lifeline1 == 0) System.out.println("1. 50-50");
                if (lifeline2 == 0) System.out.println("2. Ask the Audience");
                if (lifeline3 == 0) System.out.println("3. Skip Question");

                System.out.print("Enter lifeline number: ");
                int lifeline = sc.nextInt();

                if (lifeline == 1 && lifeline1 == 0) {
                    System.out.println("\n50-50 used! Two incorrect options are removed.");
                    
                    int incorrectOption;
                    if (correctAnswer == 1) {
                        incorrectOption = 2;
                    } else if (correctAnswer == 2) {
                        incorrectOption = 3;
                    } else if (correctAnswer == 3) {
                        incorrectOption = 4;
                    } else {
                        incorrectOption = 1;
                    }

                    System.out.println("Remaining options: " + correctAnswer + " and " + incorrectOption);
                    lifeline1 = 1;
                } else if (lifeline == 2 && lifeline2 == 0) {
                    System.out.println("\nAudience votes for option " + correctAnswer);
                    lifeline2 = 1;
                } else if (lifeline == 3 && lifeline3 == 0) {
                    System.out.println("\nQuestion skipped!");
                    lifeline3 = 1;
                    questionNumber++;
                    prize += 10;
                    continue;
                } 

                System.out.print("\nEnter your final answer:\n ");
                answer = sc.nextInt();
            }

            if (answer == correctAnswer) {
                System.out.println("\nCongratulations! Correct Answer! You won ₹" + prize);
                prize += 10;
            } else {
                System.out.println("\nWrong Answer! Game Over");
                break;
            }

            questionNumber++;
        }

    }
}
