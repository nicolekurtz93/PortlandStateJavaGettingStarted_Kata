package edu.pdx.cs410J.FightingMongoosesAKAMatt;


/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {

  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public static String compute(String number){
    int parsedNumber = Integer.parseInt(number);
    String result = "";

    if(parsedNumber % 3 == 0){
      result += "Foo";
    }
    if(parsedNumber % 5 == 0) {
      result += "Bar";
    }
    if(parsedNumber % 7 == 0){
      result += "Qix";
    }
    if(parsedNumber == 3){
      result += "Foo";
    }
    if(parsedNumber == 5){
      result += "Bar";
    }
    if(parsedNumber == 7){
      result += "Qix";
    }
    if(result == ""){
      result += number;
    }
    return result;
  }
}