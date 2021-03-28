import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner input = new Scanner (System.in);
    int score1 = 0;
    int score2 = 0;
    int score3 = 0;
    int score4 = 0;
    int score5 = 0;
    int score6 = 0;
    int result = 0;
      System.out.println ("FAGERSTORM TEST");
      System.out.println ("Hello!");
      System.out.
      println ("As we now know PAH in tobacco smoke is carcionogenic.");
      System.out.
      println
      ("Knowing the consequences people are still addicted to it due to presence of NICOTINE in tobacco.");
      System.out.
      println
      ("If you smoke , then you should check if you are NICOTINE DEPENDENT or not.");
      System.out.
      println
      ("You can take the test below , anonymously and get the results to know your NICOTINE DEPENDCE");
      System.out.
      println
      ("The test will be completely anonymous and no data will shared to anyone. ");
      System.out.
      println
      ("How soon after you wake up do you smoke after your first ciagerette.");
      System.out.println ("1.Within 5 minutes");
      System.out.println ("2.Within 6-31 minutes");
      System.out.println ("3.Within 31-60 minutes");
      System.out.println ("4.After 60 minutes.");
      System.out.println ("Enter your choice");
    int a1 = input.nextInt ();
    if (a1 == 1)
      {
	score1 = 3;
      }
    else if (a1 == 2)
      {
	score1 = 2;
      }
    else if (a1 == 3)
      {
	score1 = 1;
      }
    else if (a1 == 4)
      {
	score1 = 0;
      }
    else
      {
	score1 = -35;
	System.out.println ("INVALID INPUT");
      }
    result = score1;
    System.out.
      println
      ("Do you find it difficult to refrain from smoking in places where it forbidden( church, school)?");
    System.out.println ("1.yes");
    System.out.println ("2.no");
    System.out.println ("Enter your choice");
    int a2 = input.nextInt ();
    if (a2 == 1)
      {
	score2 = 1;
      }
    else if (a2 == 2)
      {
	score2 = 0;
      }
    else
      {
	score2 = -35;
	System.out.println ("INVALID INPUT");
      }
    result = result + score2;
    System.out.println ("Which ciagerette would you hate to leave the most?");
    System.out.println ("1.The  first one in morning");
    System.out.println ("2.any other");
    System.out.println ("Enter your choice");
    int a3 = input.nextInt ();
    if (a3 == 1)
      {
	score3 = 1;
      }
    else if (a3 == 2)
      {
	score3 = 0;
      }
    else
      {
	score3 = -35;
	System.out.println ("INVALID INPUT");
      }
    result = result + score3;
    System.out.println ("How many cigarettes per day do smoke?");
    System.out.println ("1.10 or less");
    System.out.println ("2.11-20");
    System.out.println ("3.21-30");
    System.out.println ("4.31 or more");
    System.out.println ("Enter your choice");
    int a4 = input.nextInt ();
    if (a4 == 1)
      {
	score4 = 0;
      }
    else if (a4 == 2)
      {
	score4 = 1;
      }
    else if (a4 == 3)
      {
	score4 = 2;
      }
    else if (a4 == 4)
      {
	score4 = 3;
      }
    else
      {
	score4 = -35;
	System.out.println ("INVALID INPUT");
      }
    result = result + score4;
    System.out.
      println
      ("Do you smoke more during first hours after waking then during the rest of the day?");
    System.out.println ("1.yes");
    System.out.println ("2.no");
    System.out.println ("Enter your choice");
    int a5 = input.nextInt ();
    if (a5 == 1)
      {
	score5 = 1;
      }
    else if (a5 == 2)
      {
	score5 = 0;
      }
    else
      {
	score5 = -35;
	System.out.println ("INVALID INPUT");
      }
    result = result + score5;
    System.out.
      println
      ("Do you smoke even when you are ill enough to be in bed most of the day?");
    System.out.println ("1.yes");
    System.out.println ("2.no");
    System.out.println ("Enter your choice");
    int a6 = input.nextInt ();
    if (a6 == 1)
      {
	score6 = 1;
      }
    else if (a6 == 2)
      {
	score6 = 0;
      }
    else
      {
	score6 = -35;
	System.out.println ("INVALID INPUT");
      }
    result = result + score6;
    System.out.println ("YOUR SCORE=" + result);
    if (result < 0)
      {
	System.out.println ("You may entered a wrong input");
      }
    else if (result >= 0 && result < 5)
      {
	System.out.println ("You are minimally nicotine dependent");
      }
    else if (result > 5 && result<7)
      {
	System.out.println("You are moderately nicotine dependent you need to take several measures. ");
      }
      else
      {
	System.out.println("You are highly nicotine dependent you need to take several measures. ");
      }
  }
}
