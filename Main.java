/////////////////////
////// CSE 2 ////////
////// WADE WARNER //
////// 10/9/2018 ///
/////////////////////

import java.lang.Math;
import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    
    Scanner scr = new Scanner(System.in);
    String junk; //junk cleaner string
   
    int numGens; //number of generations performed
    
    System.out.println("How many generations of hands do you want?: ");//asks for the amount of generations required

    
      while (!scr.hasNextInt()){//so long as the scaner does not have an integer
        
        System.out.println("Error: Re-input correctly"); //error statement

        junk = scr.nextLine();//junk string

      }

   numGens = scr.nextInt();//inputs the number of generations performed
   junk = scr.nextLine();//junk string

  int calcNum = 1; //number of calculations computed
  int i = 0;//counter for for loop
  int rC1, rC2, rC3, rC4, rC5; //integer representation for cards

  int numFK = 0; //number of four of a kinds
  int numTK = 0; //number of three of a kinds
  int twoPair = 0; //number of two pairs
  int onePair = 0; //number of one pairs

  double prob4K,prob3K,prob2pair, prob1pair; //the probability of getting a 4 of a kind

  int rank1, rank2, rank3, rank4, rank5; //integers for the different ranks of cards

 //FIXME add loop to account for number of combos wanted
    while (calcNum <= numGens){
        rC1 =(int) (52*Math.random()+1);//random card gen
       
        rC2 =(int) (52*Math.random()+1);//random card gen
       
        rC3 =(int) (52*Math.random()+1);//random card gen      
        rC4 =(int) (52*Math.random()+1);//random card gen     
        rC5 =(int) (52*Math.random()+1);//random card gen  

        rank1 = rC1 % 13; //gets the rank of card 1
        rank2 = rC2 % 13; //gets the rank of card 2    
        rank3 = rC3 % 13; //gets the rank of card 3   
        rank4 = rC4 % 13; //gets the rank of card 4
        rank5 = rC5 % 13; //gets the rank of card 5    
      
  
      if ((rank1 == rank2) || (rank2 == rank3)||(rank3 == rank4) || (rank4 == rank5) || (rank1 == rank3) || (rank1 == rank4) || (rank1 == rank5) || (rank2 == rank4) || (rank2 == rank5) || (rank3 == rank5)) {

        onePair += 1;
       
       if ((rank1 == rank2) && (rank2 == rank3) || (rank1 == rank3) && (rank3==rank4) || (rank1 == rank4) && (rank4 == rank5 ) || (rank1 == rank2) && (rank2 == rank4) || (rank1 == rank2) && (rank2 == rank5) ) {
          onePair -= 1;
          numTK += 1;
       
        if ((rank1 == rank2) == (rank3 == rank4) || (rank1 == rank2) == (rank4 == rank5) ) {
          numFK += 1;
          numTK -= 1;
        
       if ((((rank1 == rank2) && (rank3 == rank4))||((rank1 == rank2) && (rank4 == rank5)) || ((rank1 == rank2) && (rank3 == rank5))||((rank2 == rank3) && (rank4 == rank5)) || ((rank2 == rank3) && (rank1 == rank4))||((rank2 == rank3) && (rank1 == rank5))||((rank3 == rank4) && (rank1 == rank5))||((rank1 == rank2) && (rank4 == rank5))   ) ){
        
        numFK -= 1;
        twoPair += 1;


       }}}}

            //System.out.print(rC1 + " ");
      //System.out.print(rC2 + " ");
      //System.out.print(rC3 + " ");
      //System.out.print(rC4 + " ");
      //System.out.print(rC5 + " "); 
      
      //if 
      
      calcNum += 1;
    }
  
  System.out.println("Number of hands calculated = " + numGens); //prints out the number of hands generated

prob4K = (double) (((double)numFK/(double)calcNum));//finds the prob of 4 of a kind

prob3K = (double) (((double)numTK/(double)calcNum));//finds the prob of 3 of a kind

prob2pair = (double) (((double)twoPair/(double)calcNum));//finds the prob of 2 pair

prob1pair = (double) (((double)onePair/(double)calcNum));//finds the prob of 1 pair

 System.out.println("Number of four of a kind hands == " + numFK); //number of four of a kind hands
 System.out.println("Probability of a four of a kind: " + prob4K);//prints out the probability of a 4 of a kind

System.out.println("Number of three of a kind hands == " + numTK); //number of three of a kind hands
 System.out.println("Probability of a three of a kind: " + prob3K);//prints out the probability of a 3 of a kind

 System.out.println("Number of two pair hands == " + twoPair); //number of two pair hands
 System.out.println("Probability of two pair: " + prob2pair);//prints out the probability of a two pair hand

 System.out.println("Number of one pair hands == " + onePair); //number of one pair hands
 System.out.println("Probability of one pair: " + prob1pair);//prints out the probability of a one pair hand 
  }
}
