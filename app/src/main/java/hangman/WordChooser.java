package hangman;

import java.util.Random;


public class WordChooser {


  public static final String[] DICTIONARY = {"MAKERS", "CANDIES", "DEVELOPER", "LONDON"};

  public String getRandomWordFromDictionary(){
    
    Random rand = new Random();

    int upperbound = DICTIONARY.length;

    int random_number = rand.nextInt(upperbound);

    return DICTIONARY[random_number];

  }



}